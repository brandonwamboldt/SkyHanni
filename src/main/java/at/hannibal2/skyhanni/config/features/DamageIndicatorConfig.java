package at.hannibal2.skyhanni.config.features;

import at.hannibal2.skyhanni.config.FeatureToggle;
import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DamageIndicatorConfig {

    @Expose
    @ConfigOption(name = "Damage Indicator Enabled", desc = "Show the boss' remaining health.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean enabled = false;

    @Expose
    @ConfigOption(name = "Healing Chat Message", desc = "Sends a chat message when a boss heals themself.")
    @ConfigEditorBoolean
    public boolean healingMessage = false;

    @Expose
    @ConfigOption(
            name = "Boss Name",
            desc = "Change how the boss name should be displayed.")
    @ConfigEditorDropdown(values = {"Hidden", "Full Name", "Short Name"})
    public int bossName = 1;

    @Expose
    @ConfigOption(
            name = "Select Boss",
            desc = "Change what type of boss you want the damage indicator be enabled for."
    )
    @ConfigEditorDraggableList(
            exampleText = {
                    "§bDungeon All",
                    "§bNether Mini Bosses",
                    "§bVanquisher",
                    "§bEndstone Protector (not tested)",
                    "§bEnder Dragon (not finished)",
                    "§bRevenant Horror",
                    "§bTarantula Broodfather",
                    "§bSven Packmaster",
                    "§bVoidgloom Seraph",
                    "§bInferno Demonlord (only tier 1 yet)",
                    "§bHeadless Horseman (bugged)",
                    "§bDungeon Floor 1",
                    "§bDungeon Floor 2",
                    "§bDungeon Floor 3",
                    "§bDungeon Floor 4",
                    "§bDungeon Floor 5",
                    "§bDungeon Floor 6",
                    "§bDungeon Floor 7",
                    "§bDiana Mobs",
                    "§bSea Creatures",
                    "Dummy",
                    "§bArachne",
                    "§bThe Rift Bosses",
                    "§bRiftstalker Bloodfiend",
                    "§6Reindrake"
            }
    )
    //TODO only show currently working and tested features
    public List<Integer> bossesToShow = new ArrayList<>(Arrays.asList(0, 1, 2, 5, 6, 7, 8, 9, 18, 19, 21, 22, 23, 24));

    @Expose
    @ConfigOption(name = "Hide Damage Splash", desc = "Hiding damage splashes near the damage indicator.")
    @ConfigEditorBoolean
    public boolean hideDamageSplash = false;

    @Expose
    @ConfigOption(name = "Damage Over Time", desc = "Show damage and health over time below the damage indicator.")
    @ConfigEditorBoolean
    public boolean showDamageOverTime = false;

    @Expose
    @ConfigOption(name = "Hide Nametag", desc = "Hide the vanilla nametag of damage indicator bosses.")
    @ConfigEditorBoolean
    public boolean hideVanillaNametag = false;

    @Expose
    @ConfigOption(name = "Time to Kill", desc = "Show the time it takes to kill the slayer boss.")
    @ConfigEditorBoolean
    public boolean timeToKillSlayer = true;


    @Expose
    @ConfigOption(name = "Ender Slayer", desc = "")
    @Accordion
    public EnderSlayerConfig enderSlayer = new EnderSlayerConfig();

    public static class EnderSlayerConfig {

        @Expose
        @ConfigOption(name = "Laser phase timer", desc = "Show a timer when the laser phase will end.")
        @ConfigEditorBoolean
        public boolean laserPhaseTimer = false;

        @Expose
        @ConfigOption(name = "Health During Laser", desc = "Show the health of Voidgloom Seraph 4 during the laser phase.")
        @ConfigEditorBoolean
        public boolean showHealthDuringLaser = false;
    }

    @Expose
    @ConfigOption(name = "Vampire Slayer", desc = "")
    @Accordion
    public DamageIndicatorConfig.VampireSlayerConfig vampireSlayer = new DamageIndicatorConfig.VampireSlayerConfig();

    public static class VampireSlayerConfig {
        @Expose
        @ConfigOption(name = "HP untill Steak", desc = "Show the amount of HP miss1ing untill the steak can be used on the vampire slayer on top of the boss.")
        @ConfigEditorBoolean
        public boolean hpTillSteak = false;

        @Expose
        @ConfigOption(name = "Mania Circles", desc = "Show a timer until the boss leaves the invicible Mania Circles state.")
        @ConfigEditorBoolean
        public boolean maniaCircles = false;

        @Expose
        @ConfigOption(name = "Percentage HP", desc = "Show the percentage of HP next to the HP.")
        @ConfigEditorBoolean
        public boolean percentage = false;
    }
}
