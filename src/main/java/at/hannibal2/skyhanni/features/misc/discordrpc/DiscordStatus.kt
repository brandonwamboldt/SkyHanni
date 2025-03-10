package at.hannibal2.skyhanni.features.misc.discordrpc

// SkyblockAddons code, adapted for SkyHanni with some additions and fixes

import at.hannibal2.skyhanni.SkyHanniMod
import at.hannibal2.skyhanni.data.*
import at.hannibal2.skyhanni.data.GardenCropMilestones.getCounter
import at.hannibal2.skyhanni.data.GardenCropMilestones.getTierForCropCount
import at.hannibal2.skyhanni.data.GardenCropMilestones.progressToNextLevel
import at.hannibal2.skyhanni.features.garden.GardenAPI.getCropType
import at.hannibal2.skyhanni.features.rift.RiftAPI
import at.hannibal2.skyhanni.utils.InventoryUtils
import at.hannibal2.skyhanni.utils.LorenzUtils
import at.hannibal2.skyhanni.utils.LorenzUtils.colorCodeToRarity
import at.hannibal2.skyhanni.utils.StringUtils.firstLetterUppercase
import at.hannibal2.skyhanni.utils.StringUtils.removeColor
import at.hannibal2.skyhanni.utils.TabListData.Companion.getTabList
import io.github.moulberry.notenoughupdates.miscfeatures.PetInfoOverlay.getCurrentPet
import io.github.moulberry.notenoughupdates.util.SkyBlockTime
import net.minecraft.client.Minecraft
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NBTTagCompound
import java.util.function.Supplier
import java.util.regex.Pattern

var lastKnownDisplayStrings: MutableMap<DiscordStatus, String> =
    mutableMapOf() // if the displayMessageSupplier is ever a placeholder, return from this instead

val purseRegex = Regex("""(?:Purse|Piggy): ([\d,]+)[\d.]*""")
val motesRegex = Regex("""Motes: ([\d,]+)""")
val bitsRegex = Regex("""Bits: ([\d|,]+)[\d|.]*""")

val stackingEnchants = mapOf(
    "compact" to mapOf(
        "levels" to listOf(0, 100, 500, 1500, 5000, 15000, 50000, 150000, 500000, 1000000),
        "nbtNum" to "compact_blocks"
    ),
    "cultivating" to mapOf(
        "levels" to listOf(
            0,
            1000,
            5000,
            25000,
            100000,
            300000,
            1500000,
            5000000,
            20000000,
            100000000
        ), "nbtNum" to "farmed_cultivating"
    ),
    "expertise" to mapOf(
        "levels" to listOf(0, 50, 100, 250, 500, 1000, 2500, 5500, 10000, 15000),
        "nbtNum" to "expertise_kills"
    ),
    "hecatomb" to mapOf(
        "levels" to listOf(0, 2, 5, 10, 20, 30, 40, 60, 80, 100),
        "nbtNum" to "hecatomb_s_runs"
    ),
    "champion" to mapOf(
        "levels" to listOf(
            0,
            50000,
            100000,
            250000,
            500000,
            1000000,
            1500000,
            2000000,
            2500000,
            3000000
        ), "nbtNum" to "champion_combat_xp"
    )
) // nbtNum is the id of the enchantment in the nbt data

private fun getVisitingName(): String {
    val tabData = getTabList()
    val ownerRegex = Regex(".*Owner: (\\w+).*")
    for (line in tabData) {
        val colorlessLine = line.removeColor()
        if (ownerRegex.matches(colorlessLine)) {
            return ownerRegex.find(colorlessLine)!!.groupValues[1]
        }
    }
    return "Someone"
}

enum class DiscordStatus(private val displayMessageSupplier: Supplier<String>?) {

    NONE(null),

    LOCATION({
        var location = LorenzUtils.skyBlockArea
        val island = LorenzUtils.skyBlockIsland

        if (location == "Your Island") location = "Private Island"
        if (island == IslandType.PRIVATE_ISLAND_GUEST) lastKnownDisplayStrings[LOCATION] =
            "${getVisitingName()}'s Island"
        else if (island == IslandType.GARDEN) {
            if (location.startsWith("Plot: ")) {
                lastKnownDisplayStrings[LOCATION] = "Personal Garden ($location)" // Personal Garden (Plot: 8)
            } else {
                lastKnownDisplayStrings[LOCATION] = "Personal Garden"
            }
        } else if (island == IslandType.GARDEN_GUEST) {
            lastKnownDisplayStrings[LOCATION] = "${getVisitingName()}'s Garden"
            if (location.startsWith("Plot: ")) {
                lastKnownDisplayStrings[LOCATION] = "${lastKnownDisplayStrings[LOCATION]} ($location)"
            } // "MelonKingDe's Garden (Plot: 8)"
        } else if (location != "None" && location != "invalid") {
            lastKnownDisplayStrings[LOCATION] = location
        }
        lastKnownDisplayStrings[LOCATION] ?: "None"// only display None if we don't have a last known area
    }),

    PURSE({
        val scoreboard = ScoreboardData.sidebarLinesFormatted
        // Matches coins amount in purse or piggy, with optional decimal points
        val coins = scoreboard.firstOrNull { purseRegex.matches(it.removeColor()) }?.let {
            purseRegex.find(it.removeColor())?.groupValues?.get(1) ?: ""
        }
        val motes = scoreboard.firstOrNull { motesRegex.matches(it.removeColor()) }?.let {
            motesRegex.find(it.removeColor())?.groupValues?.get(1) ?: ""
        }
        if (coins == "1") {
            lastKnownDisplayStrings[PURSE] = "1 Coin"
        } else if (coins != "" && coins != null) {
            lastKnownDisplayStrings[PURSE] = "$coins Coins"
        } else if (motes == "1") {
            lastKnownDisplayStrings[PURSE] = "1 Mote"
        } else if (motes != "" && motes != null) {
            lastKnownDisplayStrings[PURSE] = "$motes Motes"
        }
        lastKnownDisplayStrings[PURSE] ?: ""
    }),

    BITS({
        val scoreboard = ScoreboardData.sidebarLinesFormatted
        val bits = scoreboard.firstOrNull { bitsRegex.matches(it.removeColor()) }?.let {
            bitsRegex.find(it.removeColor())?.groupValues?.get(1)
        }

        when (bits) {
            "1" -> "1 Bit"
            null -> "0 Bits"
            else -> "$bits Bits"
        }
    }),

    STATS({
        val groups = ActionBarStatsData.groups
        val statString = if (!RiftAPI.inRift()) {
            "❤${groups["health"]} ❈${groups["defense"]} ✎${groups["mana"]}"
        } else {
            "${groups["riftTime"]}ф ✎${groups["mana"]}"
        }
        if (groups["mana"] != "") {
            lastKnownDisplayStrings[STATS] = statString
        }
        lastKnownDisplayStrings[STATS] ?: ""
    }),

    ITEM({
        InventoryUtils.getItemInHand()?.let {
            String.format("Holding ${it.displayName.removeColor()}")
        } ?: "No item in hand"
    }),

    TIME({
        fun formatNum(num: Int): Int {
            val rem = num % 10
            var returnNum = num - rem // floor()
            if (returnNum == 0) {
                returnNum = "0$num".toInt()
                /**
                 * and this is so that if the minute value is ever
                 * a single digit (0 after being floored), it displays as 00 because 12:0pm looks bad
                 */
            }
            return returnNum
        }

        val date: SkyBlockTime = SkyBlockTime.now()
        val hour = if (date.hour > 12) date.hour - 12 else date.hour
        val timeOfDay = if (date.hour > 11) "pm" else "am" // hooray for 12-hour clocks
        "${SkyBlockTime.monthName(date.month)} ${date.day}${SkyBlockTime.daySuffix(date.day)}, $hour:${formatNum(date.minute)}$timeOfDay" // Early Winter 1st, 12:00pm
    }),

    PROFILE({
        val player = LorenzUtils.getPlayerName()

        val tabData = getTabList()
        val levelRegex = Regex("""\[(\d{1,3})] $player""")
        var sbLevel = ""
// SkyBlock Level: [999] on Lemon
        for (line in tabData) {
            if (line.contains(player)) {
                val colorlessLine = line.removeColor()
                sbLevel = levelRegex.find(colorlessLine)!!.groupValues[1]
                break
            }
        }

        var profile = "SkyBlock Level: [$sbLevel] on "

        profile += (
                if (HypixelData.ironman) "♲"
                else if (HypixelData.bingo) "Ⓑ"
                else if (HypixelData.stranded) "☀"
                else ""
                )

        val fruit = HypixelData.profileName.firstLetterUppercase()
        if (fruit == "") profile =
            lastKnownDisplayStrings[PROFILE] ?: "SkyBlock Level: [$sbLevel]" // profile fruit hasn't loaded in yet
        else profile += fruit

        lastKnownDisplayStrings[PROFILE] = profile
        profile
    }),

    SLAYER({
        var slayerName = ""
        var slayerLevel = ""
        var bossAlive = "spawning"
        val slayerRegex =
            Pattern.compile("(?<name>(?:\\w| )*) (?<level>[IV]+)") // Samples: Revenant Horror I; Tarantula Broodfather IV

        for (line in ScoreboardData.sidebarLinesFormatted) {
            val noColorLine = line.removeColor()
            val match = slayerRegex.matcher(noColorLine)
            if (match.matches()) {
                slayerName = match.group("name")
                slayerLevel = match.group("level")
            } else if (noColorLine == "Slay the boss!") bossAlive = "slaying"
            else if (noColorLine == "Boss slain!") bossAlive = "slain"
        }

        if (slayerLevel == "") "Planning to do a slayer quest"// selected slayer in rpc but hasn't started a quest
        else if (bossAlive == "spawning") "Spawning a $slayerName $slayerLevel boss."
        else if (bossAlive == "slaying") "Slaying a $slayerName $slayerLevel boss."
        else if (bossAlive == "slain") "Finished slaying a $slayerName $slayerLevel boss."
        else "Something went wrong with slayer detection!"
    }),

    CUSTOM({
        SkyHanniMod.feature.misc.discordRPC.customText.get() // custom field in the config
    }),

    AUTO({
        val slayerResult = SLAYER.displayMessageSupplier!!.get()
        val stackingResult = STACKING.displayMessageSupplier!!.get()
        val milestoneResult = CROP_MILESTONES.displayMessageSupplier!!.get()
        if (slayerResult != "Planning to do a slayer quest") slayerResult
        else if (milestoneResult != "Not farming!") milestoneResult
        else if (stackingResult != "") stackingResult
        else {
            val statusNoAuto = entries.toMutableList()
            statusNoAuto.remove(AUTO)
            statusNoAuto[SkyHanniMod.feature.misc.discordRPC.auto.get()].getDisplayString()
        }
    }),

    CROP_MILESTONES({
        val crop = InventoryUtils.getItemInHand()?.getCropType()
        val cropCounter = crop?.getCounter()
        val tier = cropCounter?.let { getTierForCropCount(it, crop) }

        val progress = tier?.let {
            LorenzUtils.formatPercentage(crop.progressToNextLevel())
        } ?: 100 // percentage to next milestone

        if (tier != null) {
            "${crop.cropName}: Milestone $tier ($progress)"
        } else {
            "Not farming!"
        }
    }),

    PETS({
        ProfileStorageData.profileSpecific?.currentPet?.let {
            val colorCode = it.substring(1..2).first()
            val petName = it.substring(2)
            val petLevel = getCurrentPet()?.petLevel?.currentLevel ?: "?"

            "[Lvl $petLevel] ${colorCodeToRarity(colorCode)} $petName"
        } ?: "No pet equipped"
    }),

    // Dynamic-only
    STACKING({
        // Logic for getting the currently held stacking enchant is from Skytils, except for getExtraAttributes() which they got from BiscuitDevelopment

        fun getExtraAttributes(item: ItemStack?): NBTTagCompound? {
            return if (item == null || !item.hasTagCompound()) {
                null
            } else item.getSubCompound("ExtraAttributes", false)
        }

        val itemInHand = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem()
        val itemName = itemInHand?.displayName?.removeColor() ?: ""

        val extraAttributes = getExtraAttributes(itemInHand)

        fun getProgressPercent(amount: Int, levels: List<Int>): String {
            var currentLevel = 0
            var percent = "MAXED"
            for (level in levels.indices) {
                if (amount > levels[level]) {
                    currentLevel++
                    continue
                }
                percent = if (amount.toDouble() == 0.0) {
                    ""
                } else {
                    LorenzUtils.formatPercentage((amount.toDouble() - levels[level - 1]) / (levels[level] - levels[level - 1]))
                }
                break
            }
            return percent
        }

        var stackingReturn = ""
        if (extraAttributes != null) {
            val enchantments = extraAttributes.getCompoundTag("enchantments")
            var stackingEnchant = ""
            for (enchant in stackingEnchants.keys) {
                if (extraAttributes.hasKey(stackingEnchants[enchant]?.get("nbtNum").toString())) {
                    stackingEnchant = enchant
                    break
                }
            }
            val levels = stackingEnchants[stackingEnchant]?.get("levels") as? List<Int> ?: listOf(0)
            val level = enchantments.getInteger(stackingEnchant)
            val amount = extraAttributes.getInteger(stackingEnchants[stackingEnchant]?.get("nbtNum").toString())
            val stackingPercent = getProgressPercent(amount, levels)

            stackingReturn =
                if (stackingPercent == "" || amount == 0) "" // outdated info is useless for AUTO; empty strings are manually ignored
                else "$itemName: ${stackingEnchant.firstLetterUppercase()} $level ($stackingPercent)" // Hecatomb 100: (55.55%)
        }
        stackingReturn

    })
    ;

    fun getDisplayString(): String {
        if (displayMessageSupplier != null) {
            return displayMessageSupplier.get()
        }
        return ""
    }
}
