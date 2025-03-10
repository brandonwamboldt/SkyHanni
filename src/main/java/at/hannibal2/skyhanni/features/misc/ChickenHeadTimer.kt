package at.hannibal2.skyhanni.features.misc

import at.hannibal2.skyhanni.SkyHanniMod
import at.hannibal2.skyhanni.events.GuiRenderEvent
import at.hannibal2.skyhanni.events.LorenzChatEvent
import at.hannibal2.skyhanni.events.LorenzTickEvent
import at.hannibal2.skyhanni.events.LorenzWorldChangeEvent
import at.hannibal2.skyhanni.utils.InventoryUtils
import at.hannibal2.skyhanni.utils.ItemUtils.name
import at.hannibal2.skyhanni.utils.LorenzUtils
import at.hannibal2.skyhanni.utils.RenderUtils.renderString
import at.hannibal2.skyhanni.utils.TimeUtils
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class ChickenHeadTimer {
    private var hasChickenHead = false
    private var lastTime = 0L
    private val config get() = SkyHanniMod.feature.misc

    @SubscribeEvent
    fun onTick(event: LorenzTickEvent) {
        if (!isEnabled()) return
        if (!event.isMod(5)) return

        val itemStack = InventoryUtils.getArmor()[3]
        val name = itemStack?.name ?: ""
        hasChickenHead = name.contains("Chicken Head")
    }

    @SubscribeEvent
    fun onWorldChange(event: LorenzWorldChangeEvent) {
        lastTime = System.currentTimeMillis()
    }

    @SubscribeEvent
    fun onChatMessage(event: LorenzChatEvent) {
        if (!isEnabled()) return
        if (!hasChickenHead) return
        if (event.message == "§aYou laid an egg!") {
            lastTime = System.currentTimeMillis()
            if (config.chickenHeadTimerHideChat) {
                event.blockedReason = "chicken_head_timer"
            }
        }
    }

    @SubscribeEvent
    fun onRenderOverlay(event: GuiRenderEvent.GameOverlayRenderEvent) {
        if (!isEnabled()) return
        if (!hasChickenHead) return

        val sinceLastTime = System.currentTimeMillis() - lastTime
        val cooldown = 5_000
        val remainingTime = cooldown - sinceLastTime

        val displayText = if (remainingTime < 0) {
            "Chicken Head Timer: §aNow"
        } else {
            val formatDuration = TimeUtils.formatDuration(remainingTime)
            "Chicken Head Timer: §b$formatDuration"
        }

        config.chickenHeadTimerPosition.renderString(displayText, posLabel = "Chicken Head Timer")
    }

    fun isEnabled() = LorenzUtils.inSkyBlock && config.chickenHeadTimerDisplay
}