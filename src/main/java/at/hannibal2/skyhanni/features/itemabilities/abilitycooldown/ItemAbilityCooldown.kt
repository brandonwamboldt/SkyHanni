package at.hannibal2.skyhanni.features.itemabilities.abilitycooldown

import at.hannibal2.skyhanni.SkyHanniMod
import at.hannibal2.skyhanni.data.ItemRenderBackground.Companion.background
import at.hannibal2.skyhanni.events.*
import at.hannibal2.skyhanni.utils.InventoryUtils
import at.hannibal2.skyhanni.utils.ItemUtils
import at.hannibal2.skyhanni.utils.ItemUtils.cleanName
import at.hannibal2.skyhanni.utils.ItemUtils.getInternalName
import at.hannibal2.skyhanni.utils.LorenzColor
import at.hannibal2.skyhanni.utils.LorenzUtils
import at.hannibal2.skyhanni.utils.LorenzUtils.between
import at.hannibal2.skyhanni.utils.LorenzUtils.equalsOneOf
import at.hannibal2.skyhanni.utils.LorenzUtils.round
import at.hannibal2.skyhanni.utils.NEUInternalName.Companion.asInternalName
import at.hannibal2.skyhanni.utils.SkyBlockItemModifierUtils.getAbilityScrolls
import at.hannibal2.skyhanni.utils.StringUtils.matchMatcher
import net.minecraft.client.Minecraft
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class ItemAbilityCooldown {
    private var lastAbility = ""
    private var items = mapOf<ItemStack, List<ItemText>>()
    private val youAlignedOthersPattern = "§eYou aligned §r§a.* §r§eother player(s)?!".toPattern()
    private val WEIRD_TUBA = "WEIRD_TUBA".asInternalName()
    private val WEIRDER_TUBA = "WEIRDER_TUBA".asInternalName()

    @SubscribeEvent
    fun onSoundEvent(event: PlaySoundEvent) {
        if (event.soundName == "mob.zombie.remedy") {
            if (event.pitch == 0.6984127f && event.volume == 1f) {
                val abilityScrolls = InventoryUtils.getItemInHand()?.getAbilityScrolls() ?: return
                if (abilityScrolls.size != 3) return

                ItemAbility.HYPERION.sound()
            }
        }
        if (event.soundName == "mob.enderdragon.growl") {
            if (event.pitch == 1f && event.volume == 1f) {
                ItemAbility.ICE_SPRAY_WAND.sound()
            }
        }
        if (event.soundName == "mob.endermen.portal") {
            if (event.pitch == 0.61904764f && event.volume == 1f) {
                ItemAbility.GYROKINETIC_WAND_LEFT.sound()
            }
            if (event.pitch == 1f && event.volume == 1f) {
                val internalName = InventoryUtils.getItemInHand()?.getInternalName() ?: return
                if (!internalName.equalsOneOf(
                        "SHADOW_FURY".asInternalName(),
                        "STARRED_SHADOW_FURY".asInternalName()
                    )
                ) return

                ItemAbility.SHADOW_FURY.sound()
            }
        }
        if (event.soundName == "random.anvil_land") {
            if (event.pitch == 0.4920635f && event.volume == 1f) {
                ItemAbility.GIANTS_SWORD.sound()
            }
        }
        if (event.soundName == "mob.ghast.affectionate_scream") {
            if (event.pitch == 0.4920635f && event.volume == 0.15f) {
                ItemAbility.ATOMSPLIT_KATANA.sound()
            }
        }
//        if (event.soundName == "random.click") {
//            if (event.pitch == 2.0f && event.volume == 0.55f) {
//                ItemAbility.RAGNAROCK_AXE.sound()
//            }
//        }
        if (event.soundName == "liquid.lavapop") {
            if (event.pitch == 0.7619048f && event.volume == 0.15f) {
                ItemAbility.WAND_OF_ATONEMENT.sound()
            }
        }
        if (event.soundName == "mob.bat.hurt") {
            if (event.volume == 0.1f) {
                ItemAbility.STARLIGHT_WAND.sound()
            }
        }
        if (event.soundName == "mob.guardian.curse") {
            if (event.volume == 0.2f) {
                ItemAbility.VOODOO_DOLL.sound()
            }
        }
        if (event.soundName == "random.successful_hit") {
            if (event.volume == 1.0f && event.pitch == 0.7936508f) {
                ItemAbility.VOODOO_DOLL_WILTED.sound()
            }
        }
        if (event.soundName == "random.explode") {
            if (event.pitch == 4.047619f && event.volume == 0.2f) {
                ItemAbility.GOLEM_SWORD.sound()
            }
        }
        if (event.soundName == "mob.wolf.howl") {
            if (event.volume == 0.5f) {
                val recentItems = InventoryUtils.recentItemsInHand.values
                if (WEIRD_TUBA in recentItems) {
                    ItemAbility.WEIRD_TUBA.sound()
                }
                if (WEIRDER_TUBA in recentItems) {
                    ItemAbility.WEIRDER_TUBA.sound()
                }
            }
        }
        if (event.soundName == "mob.zombie.unfect") {
            if (event.pitch == 2.0f && event.volume == 0.3f) {
                ItemAbility.END_STONE_SWORD.sound()
            }
        }
        if (event.soundName == "mob.wolf.panting") {
            if (event.pitch == 1.3968254f && event.volume == 0.4f) {
                ItemAbility.SOUL_ESOWARD.sound()
            }
        }
        if (event.soundName == "mob.zombiepig.zpigangry") {
            if (event.pitch == 2.0f && event.volume == 0.3f) {
                ItemAbility.PIGMAN_SWORD.sound()
            }
        }
        if (event.soundName == "mob.ghast.fireball") {
            if (event.pitch == 1.0f && event.volume == 0.3f) {
                ItemAbility.EMBER_ROD.sound()
            }
        }
        if (event.soundName == "mob.guardian.elder.idle") {
            if (event.pitch == 2.0f && event.volume == 0.2f) {
                ItemAbility.FIRE_FREEZE_STAFF.sound()
            }
        }
        if (event.soundName == "random.explode") {
            if (event.pitch == 0.4920635f && event.volume == 0.5f) {
                ItemAbility.STAFF_OF_THE_VOLCANO.sound()
            }
        }
        if (event.soundName == "random.eat") {
            if (event.pitch == 1.0f && event.volume == 1.0f) {
                ItemAbility.STAFF_OF_THE_VOLCANO.sound()
            }
        }
        if (event.soundName == "random.drink") {
            if (event.pitch.round(1) == 1.8f && event.volume == 1.0f) {
                ItemAbility.HOLY_ICE.sound()
            }
        }
    }

    @SubscribeEvent
    fun onBlockClickSend(event: BlockClickEvent) {
        handleItemClick(event.itemInHand)
    }

    @SubscribeEvent
    fun onItemClick(event: ItemClickEvent) {
        handleItemClick(event.itemInHand)
    }

    private fun handleItemClick(itemInHand: ItemStack?) {
        if (!LorenzUtils.inSkyBlock) return
        itemInHand?.getInternalName()?.run {
            ItemAbility.getByInternalName(this)?.setItemClick()
        }
    }

    @SubscribeEvent
    fun onActionBar(event: LorenzActionBarEvent) {
        if (!isEnabled()) return

        val message: String = event.message
        handleOldAbilities(message)

        if (message.contains("§lCASTING IN ")) {
            if (!ItemAbility.RAGNAROCK_AXE.isOnCooldown()) {
                ItemAbility.RAGNAROCK_AXE.activate(LorenzColor.WHITE, 3_000)
            }
        } else if (message.contains("§lCASTING")) {
            if (ItemAbility.RAGNAROCK_AXE.specialColor != LorenzColor.DARK_PURPLE) {
                ItemAbility.RAGNAROCK_AXE.activate(LorenzColor.DARK_PURPLE, 10_000)
            }
        } else if (message.contains("§c§lCANCELLED")) {
            ItemAbility.RAGNAROCK_AXE.activate(null, 17_000)
        }
    }

    private fun handleOldAbilities(message: String) {
        if (message.contains(" (§6")) {
            if (message.contains("§b) ")) {
                val name: String = message.between(" (§6", "§b) ")
                if (name == lastAbility) return
                lastAbility = name
                for (ability in ItemAbility.entries) {
                    if (ability.abilityName == name) {
                        click(ability)
                        return
                    }
                }
                return
            }
        }
        lastAbility = ""
    }

    private fun isEnabled(): Boolean {
        return LorenzUtils.inSkyBlock && SkyHanniMod.feature.itemAbilities.itemAbilityCooldown
    }

    private fun click(ability: ItemAbility) {
        if (ability.actionBarDetection) {
            ability.activate()
        }
    }

    @SubscribeEvent
    fun onTick(event: LorenzTickEvent) {
        if (!isEnabled()) return

        if (event.isMod(2)) {
            checkHotBar()
        }
    }

    private fun checkHotBar() {
        val items = mutableMapOf<ItemStack, MutableList<ItemText>>()
        for ((stack, _) in ItemUtils.getItemsInInventoryWithSlots(true)) {
            for (ability in hasAbility(stack)) {
                items.getOrPut(stack) { mutableListOf() }.add(createItemText(ability))
            }
        }
        this.items = items
    }

    private fun createItemText(ability: ItemAbility): ItemText {
        val specialColor = ability.specialColor
        return if (ability.isOnCooldown()) {
            val duration: Long =
                ability.lastActivation + ability.getCooldown() - System.currentTimeMillis()
            val color =
                specialColor ?: if (duration < 600) LorenzColor.RED else LorenzColor.YELLOW
            ItemText(color, ability.getDurationText(), true, ability.alternativePosition)
        } else {
            if (specialColor != null) {
                ability.specialColor = null
                tryHandleNextPhase(ability, specialColor)
                return createItemText(ability)
            }
            ItemText(LorenzColor.GREEN, "R", false, ability.alternativePosition)
        }
    }

    private fun tryHandleNextPhase(ability: ItemAbility, specialColor: LorenzColor) {
        if (ability == ItemAbility.GYROKINETIC_WAND_RIGHT) {
            if (specialColor == LorenzColor.BLUE) {
                ability.activate(null, 4_000)
            }
        }
        if (ability == ItemAbility.RAGNAROCK_AXE) {
            if (specialColor == LorenzColor.DARK_PURPLE) {
                ability.activate(null, 7_000)
            }
        }
    }

    @SubscribeEvent
    fun onRenderItemTip(event: RenderItemTipEvent) {
        if (!isEnabled()) return

        val stack = event.stack

        val guiOpen = Minecraft.getMinecraft().currentScreen != null
        val list = items.filter { it.key == stack }
            .firstNotNullOfOrNull { it.value } ?: return

        for (itemText in list) {
            if (guiOpen && !itemText.onCooldown) continue
            val color = itemText.color
            val renderObject = RenderObject(color.getChatColor() + itemText.text)
            if (itemText.alternativePosition) {
                renderObject.offsetX = -8
                renderObject.offsetY = -10
            }
            event.renderObjects.add(renderObject)

            // fix multiple problems when having multiple abilities
            if (SkyHanniMod.feature.itemAbilities.itemAbilityCooldownBackground) {
                var opacity = 130
                if (color == LorenzColor.GREEN) {
                    opacity = 80
                }
                stack.background = color.addOpacity(opacity).rgb
            }
        }
    }

    @SubscribeEvent
    fun onChatMessage(event: LorenzChatEvent) {
        if (!isEnabled()) return

        val message = event.message
        if (message == "§dCreeper Veil §r§aActivated!") {
            ItemAbility.WITHER_CLOAK.activate(LorenzColor.LIGHT_PURPLE)
        }
        if (message == "§dCreeper Veil §r§cDe-activated! §r§8(Expired)"
            || message == "§cNot enough mana! §r§dCreeper Veil §r§cDe-activated!"
        ) {
            ItemAbility.WITHER_CLOAK.activate()
        }
        if (message == "§dCreeper Veil §r§cDe-activated!") {
            ItemAbility.WITHER_CLOAK.activate(null, 5000)
        }

        youAlignedOthersPattern.matchMatcher(message) {
            ItemAbility.GYROKINETIC_WAND_RIGHT.activate(LorenzColor.BLUE, 6_000)
        }
        if (message == "§eYou §r§aaligned §r§eyourself!") {
            ItemAbility.GYROKINETIC_WAND_RIGHT.activate(LorenzColor.BLUE, 6_000)
        }
        if (message == "§cRagnarock was cancelled due to being hit!") {
            ItemAbility.RAGNAROCK_AXE.activate(null, 17_000)
        }
    }

    private fun hasAbility(stack: ItemStack): MutableList<ItemAbility> {
        val itemName: String = stack.cleanName()
        val internalName = stack.getInternalName()

        val list = mutableListOf<ItemAbility>()
        for (ability in ItemAbility.entries) {
            if (ability.newVariant) {
                if (ability.internalNames.contains(internalName)) {
                    list.add(ability)
                }
            } else {
                for (name in ability.itemNames) {
                    if (itemName.contains(name)) {
                        list.add(ability)
                    }
                }
            }
        }
        return list
    }

    private fun ItemAbility.sound() {
        val ping = System.currentTimeMillis() - lastItemClick
        if (ping < 400) {
            activate()
        }
    }

    class ItemText(
        val color: LorenzColor,
        val text: String,
        val onCooldown: Boolean,
        val alternativePosition: Boolean,
    )
}
