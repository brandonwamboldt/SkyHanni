# SkyHanni - Change Log

## Version 0.20 (Unreleased)

### New Features

+ Replacing command `/warp is` with `/is`.
+ Added command `/shbingotoggle` to toggle the bingo card.
+ Added option to disable quick bingo card toggle with sneaking.
+ **King Talisman Helper**
    + Show kings you have not talked to yet, and when the next missing king will appear.
+ **Harp Keybinds** - NetheriteMiner
    + In Melodys Harp, press buttons with your number row on the keyboard instead of clicking.
+ **Ender Node Tracker** - pretz
    + Tracks items and profit obtained from mining ender nodes and killing normal endermen.
+ **Fishing timer** now works in **Crystal Hollows** as well. (Worm fishing)
+ Option to shorten the **bestiary level-up message**.
+ **Bestiary overlay** - HiZe
    + Options for change number format, display time, number type and hide maxed.
    + Highlight maxed bestiaries.
+ Show the names of the **4 areas** while in the center of **crystal Hollows**.
+ Chest Value - HiZe
    + Shows a list of all items and their price when inside a chest on your private island.
+ In Melody's Harp, show buttons as stack size. - NetheriteMiner
    + Intended to be used with Harp Keybinds
+ Added keybind to manually reset the barn/worm fishing timer. - CarsCupcake
+ Added timer till shared inquisitors will despawn. - hannibal2
+ Account upgrade complete reminder. - appable0
+ Chat message how many places you dropped in the farming weight lb when joining garden.
+ Added command /shfarmingprofile [player name]
+ Opens the elitebot.dev website in your web browser to show your Farming Weight profile.
+ Pet Experience Tooltip
    + Show the full pet exp and the progress to level 100 (ignoring rarity) when hovering over a pet while pressing
      shift key.
+ Anita Extra Farming Fortune:
    + Show current tier and cost to max out in the item tooltip.
+ Sync Jacob Contests - Kaeso + CalMWolfs
    + No need to open the calendar every SkyBlock year again.
    + Grab Jacob Contest data from the elitebot.dev website.
    + Option to send local contest data to elitebot.dev at the start of the new SkyBlock year.
+ Added **SkyHanni Installer** - NetheriteMiner
    + Double-clicking the mod jar file will open a window that asks you where to move the mod into.
+ Added Chat Translator - NetheriteMiner
    + After enabling, click on any chat message sent by another player to translate it to English.
+ Show the progress bar until maxed crop milestone in the crop milestone inventory. - hannibal2
+ Show a line to the enderman slayer beacon. - hannibal2
+ Added **Default Option Settings:** - nea
    + Enables or disables all features at once, or per category.
    + Sends a chat message on first SkyHanni startup (starting with this feature, so this version everyone will see this
      message).
    + Shows new features after an update (starting with the next beta, not this one).
    + Allows to change those settings anytime again with /shdefaultoptions.
+ While on the Winter Island, show a timer until Jerry's Workshop closes. - hannibal2
+ Added Reindrake support to the Damage Indicator. - hannibal2
+ Added visual garden plot borders. - VixidDev
    + Press F3 + G to enable/disable the view.
+ Added **Following Line** Cosmetic - hannibal2
    + Draws a colored line behind the player.
    + Change the color, width, and duration of the line.
+ Show alert when reaching max super-pairs clicks. - pretz
    + Plays a beep sound and sends a message in chat when the player reaches the maximum number of clicks gained for
      super-pairs minigames.
+ Added gemstone slot unlock costs to the Estimated Item Value. - Fix3dll
+ **Powder Grinding Tracker** - HiZe
    + Shows the Mithril/Gemstone Powder gained, the number of chests opened, if Double Powder is active, and the items
      collected.
    + Change between current session and total (open the inventory and click on Display Mode).
    + Fully customizable: change what items or stats to show.
    + Has support for the maxed Great Explorer perk.
    + Option to hide while not grinding powder.

### Changes

+ Added option to disable quick bingo card toggle with sneaking.
+ Made damage indicator more performant. - nea
+ Ghost bestiary update. - HiZe
+ Api error messages are now formatted more helpful.
+ Added option to only show the reputation helper while pressing a hotkey.
+ Garden **Money per Hour** now uses the **dicer drops** from melon and pumpkins as well. - CalMWolfs
+ Adds **Double Hook** to the **sea creature chat message** instead of in a previous line. - appable0
+ Rune display now shows always in sack display.
+ Shark fish counter now counts twice for Double hook. - appable0
+ Ghost counter check for Mist now ignores y coordiantes - HiZe
+ Telling the user about the bypass hotkey when the visitor drop warning blocks a visitor refusal. - CalMWolfs
+ Added warning sound when the worm fishing cap of 60 is hit. - CarsCupcake
+ Shared inquisitor waypoints will now get removed after 75 seconds. - hannibal2
+ Chest Value now works with Backpack and Ender Chest. - HiZe
    + Only works if NEU storage is not active.
+ Removed distance checks when detecting sea creatures for fishing timer. - hannibal2
+ Added Enchantments Cap to EstimatedItemValue. - hannibal2
    + Only show the top # most expensive enchantments on an item.
+ Count sea emperor and rider of the deep twice against sea creature cap.
+ Clicking on the chat message from farming weight will run the /shfarmingprofile command.
+ Changed Bestiary Display number format - HiZe
+ Changed ff buffs for Elephant and Anita.
+ Changed chicken head timer from 20s to 5s.
+ Added option to show reputation locations only when pressing the hotkey.
+ Delay the custom garden level up message by a few milliseconds to not cut into the garden milestone message.
+ Added runic support for Zealots/Bruiser.
+ Added cultivating and replenish to the visitor rewards. - ReyMaratov
+ Added Bee pet support to /ff - derholzmann12321
+ Added exportable carrot to /ff. - CalMWolfs
    + If SkyHanni doesn't know you have it, run /shcarrot
+ The damage indicator now includes a toggle option for the Ender Slayer Laser Phase timer. - hannibal2
+ Added ender slayer beacon explode timer. - hannibal2
+ Show the name over Nukekubi Skulls for in ender slayer (deadly eyes). - hannibal2
+ Changed the enderman slayer laser timer to be more exact. - hannibal2
+ Added support for the new fixed inquisitor spawn message from Hypixel for the detection. - hannibal2
+ Added option to hide the off-screen drop chat message. - hannibal2
+ Now hides the farming weight display by default when below 200 weight (can be disabled). - hannibal2
+ Added option to change the Enderman Slayer beacon color. - hannibal2
+ Added option to show a line to every slayer mini boss around you. - hannibal2
+ Added options to ignore the wizard and the crypt warp for Diana.
+ Loading farming weight values directly from elitebot.dev. - CalMWolfs
    + This has no effect right now but allows Kaeso to change the values easier in the future.
+ Slightly changed the FF guide tab colors to make more sense. - Obsidian
+ Changed the bingo tips description to show the actual data source.

### Fixes

+ Removed `Simple Carrot Candy` from composter overlay.
+ Fixed croesus highlight unopened chest not working anymore. (ty hypixel)
+ Should not crash anymore if a file in repo is missing.
+ Fixed Killer Spring tower still highlighting even with the feature turned off. - HiZe
+ Fixed weird tuba ability cooldown not working in rift.
+ Fixed holy ice cooldown sometimes not working.
+ Fixed a rare startup crash.
+ Fixed Ghost stats after bestiary update. - HiZe
+ Watchdog hider now correctly hides empty lines as well, even when empty line hider is disabled. - appable0
+ Fixed `saw mob` title for trevor trapper solver still showing even when feature is disabled.
+ Fixed chicken from raider of the sea get detected as trevor trapper mob.
+ Fixed master star detection in estimate item value broken for some times.
+ Fixed description in golden trophy fish info tooltip. - appable0
+ Fixed End Node Tracker not updating when changing the text format.
+ Fixed neu repo error messages with runes.
+ Fixed rare crashes with scoreboard.
+ Fixed feature that replaces the sack stitched lore message. - hannibal2
+ Fixed some typos in config descriptions and correctly rounding down in composter overlay. - CalMWolfs
+ Fixed a typo in an error message. - Obsidian
+ Fixed Chest Value fails to detect chests when using a resource pack. - HiZe
+ Fixed Sea Creature Timer not working on barn. - hannibal2
+ Arachne boss highlighter no longer requires damage indicator to be enabled. - hannibal2
+ /shtrackcollection Cactus now detects cactus green. hannibal2
+ Fixed arachne minis falsely show in damage indicator.
+ Fixed rare cases where special laptop keys trigger behavior unintended. - hannibal2
+ Fixed rendering problems with stack background and custom text lore. - nea
+ Hopefully fixed Derpy problems with Trevor Trapper, Arachne, Arachne Keeper and Zealots.
+ Fixed Anita upgrade detection from the Anita Shop inventory.
+ Fixed error message when clicking a finished upgrade in the community shop.
+ Fixed everything **crop milestone** related. - CalMWolfs
+ Fixed estimated item value detects master stars on non-dungeon items. - hannibal2
+ Fixed wrong progress bar for pet exp display. - hannibal2
+ Fixed compatibility problem with NEU for pet exp number format. - hannibal2
+ Various **/ff fixes** - CalMWolfs
+ Numbers, rounding and pets being reset.
+ Fixed inventory item number offset being wrong. - CalMWolfs
+ Fixed slayer quest detection after death. - hannibal2
+ Fixed rounding errors with yaw and pitch display. - hannibal2
+ Fixed ender slayer beacon don't disappear sometimes. - hannibal2
+ Fixed multiple bugs with garden visitor: - hannibal2
    + Visitors with multiple different crops now calculate the copper price and the visitor drop stats correctly.
    + Reward items no longer impact the visitor drop coins spent data negatively.
    + Copper per coin price now respects the reward item profit as well.
    + Now showing the NPC price for items without ah/bazaar data (looking at pet candy).
+ Fixed highlight in the main bestiary menu. - HiZe
+ Fixed maxed farming fortune possible in /ff - CalMWolfs
+ Fixed negative coins per copper price in visitor inventory. - hannibal2
+ Fixed rare error message while farming. - hannibal2
+ Fixed a rare error message while showing the lore of a farming tool. - hannibal2
+ Fixed estimated item value doesn't detect master stars in Auction House. - hannibal2
+ Fixed enderman slayer beacon warning only visible for a very short amount of time. - hannibal2
+ Fixed enderman slayer line to beacon only shows when beacon highlight is enabled. - hannibal2
+ Fixed major composter profit calculation with multi-drop. - pretz
+ Garden Money Per Hour: Fixed the wrong NPC price when Merge Seeds is enabled. - hannibal2
+ Hopefully fixed error messages in bingo around collection values. - hannibal2
+ Hopefully fixed a rare chat error. - hannibal2
+ Fixed duration format in non-god-potion display. - appable0
+ Fixed various typos. - pretz

### Removed Features

- Removed **Broken Wither Impact** detection. - hannibal2
    - (Hypixel fixed their bug, finally)
- Removed remaining **Hypixel API** support for still existing legacy api keys. - hannibal2
    - This should not affect much
    -
- Removed wishing compass in item number.
    - Every Wishing Compass now only has one use instead of three.

## Version 0.19

### Rift Features

+ Added **Rift Timer**
    + Show the remaining rift time, max time, percentage, and extra time changes.
+ **Highlight Guide**
    + Highlight things to do in the Rift Guide.
+ Added **Shy Warning** (Contributed by CalMWolfs)
    + Shows a warning when a shy crux will steal your time.
    + Useful if you play without volume.
+ Added **Larvas Highlighter**
    + Highlight larvas on trees in Wyld Woods while holding a Larva Hook in the hand
    + Customize the color
+ Added **Odonatas Highlighter**
    + Highlight the small Odonatas flying around the trees while holding a Empty Odonata Bottle in the hand.
    + Customize the color
+ Added **Agaricus Cap** countdown
    + Counts down the time until Agaricus Cap (Mushroom) changes color from brown to red and is breakable.
+ Added **Leech Supreme** to Damage Indicator
+ Added **Volt Crux Warning** (Contributed by nea)
    + Shows a warning while a volt is discharging lightning
    + Shows the area in which a Volt might strike lightning
    + Change the color of the area
    + Change the color of the volt enemy depending on their mood (default disabled)
+ Added **Enigma Soul Waypoints** (Contributed by CalMWolfs)
    + Click on the soul name inside Rift Guide to show/hide
+ Added **Kloon Hacking** (Contributed by CalMWolfs)
    + Highlights the correct button to click in the hacking inventory
    + Tells you which color to pick
    + While wearing the helmet, waypoints will appear at each terminal location
+ Added **Crux Talisman Progress** Display - HiZe
    + Show bonuses you get from the talisman
+ Added existing slayer feature support for **Vampire Slayer** - HiZe
    + This contains RNG Meter, Slayer quest warning and Items on ground
+ Added item ability cooldown support for **Weirder Tuba** and **Holy Ice** - HiZe
+ Added **Lazer Parkour** Solver - CalMWolfs
    + Highlights the location of the invisible blocks in the MirrorVerse
+ Added Mirrorverse **Dance Room Helper** - HiZe
    + Helps to solve the dance room in the mirror verse by showing multiple tasks at once.
    + Change how many tasks you should see
    + Hide other players inside the dance room
    + Added timer before next instruction
    + Option to hide default title (instructions, "Keep it up!" and "It's happening!")
    + Fully customize the description for now, next and later (with color)
+ Added **Upside Down** Parkour & **Lava Maze** - hannibal2
    + Helps to solve the Upside Down Parkour and Lava Maze in the mirror verse by showing the correct way
    + Change how many platforms should be shown in front of you
    + Rainbow color (optional) - nea
    + Hide other players while doing the parkour
    + Outlines the top edge of the platforms (for Upside Down Parkour only) - CalMWolfs
+ Added Jinxed voodoo doll ability cooldown support - HiZe
+ Added Polarvoid Books to estimated item value - jani
+ Added **Motes NPC** price in the item lore
    + With Burgers multiplier - HiZe
+ Added Motes Grubber to Not Clickable Items feature
+ **Living Metal Suit** Progress - HiZe
    + Display progress Living Metal Suit (Default disabled)
    + Option to show a compacted version of the overlay when the set is maxed
+ Added Highlight for Blobbercysts in Bacte fight in colloseum in rift - HiZe
+ Show a line between **Defense blocks** and the mob and highlight the blocks - hannibal2
    + Hide particles around Defense Blocks
+ Show a moving animation between **Living Metal** and the next block - hannibal2
    + Hide Living Metal particles
+ Highlight **flying Motes Orbs** - hannibal2
    + Hide normal motes orbs particles
+ Added bloodfiend (vampire slayer) to Damage Indicator - HiZe
+ Add Bacte to Damage Indicator
+ Hide Not Rift-transferable items in Rift Transfer Chest as part of the hide not clickable items feature
+ Add npc motes sell value for current opened chest - HiZe
+ Vampire Slayer Feature - HiZe
    + Sound for twinclaws
    + Option to delay twinclaws notification and sound (in millis, configurable)
    + Draw line starting from the boss head to the Killer Spring/Blood Ichor (if the boss is highlighted)
    + Draw line starting from your crosshair to the boss head
    + Configurable to work only on your boss, on bosses hit, or on coop boss
+ Show locations of inactive Blood Effigy
    + Show effigies that are about to respawn
    + Show effigies without known time
+ Added **Wilted Berberis Helper**
    + Option to only show the helper while standing on Farmland blocks
    + Option to hide the wilted berberis particles
+ Added **Vampire Slayer** features in Damage Indicator
    + Show the amount of HP miss1ing untill the steak can be used on the vampire slayer on top of the boss.
    + Show a timer until the boss leaves the invicible Mania Circles state.
    + Show the percentage of HP next to the HP.
+ Added **Horsezooka Hider**
    + Hide horses while holding the Horsezooka in the hand.

### Other New Features

+ Added **Frozen Treasure Tracker** (Contributed by CalMWolfs)
    + Show different items collected while breaking treasures in the Glacial Cave in Jerry's Workshop
    + Show Ice per hour
    + Customizable GUI
    + Option to hide the chat messages
+ Added **Custom Text Box** - CalMWolfs
    + Write fancy text into a gui element to show on your screen at all time
    + Supports color codes
    + Supports line breaks `\n` - hannibal2
+ Added **Highlight Commission Mobs** - hannibal2
    + Highlight Mobs that are part of active commissions
+ Added command **/shcommands**
    + Show all commands in SkyHanni
+ Added Attribute price support to Estimated Item Value - nea
+ Added warning when enderman slayer beacon spawns - dragon99z
+ Added Highlight enderman slayer Nukekubi (Skulls) - dragon99z
+ Added option to hide the vanilla particles around enderman
+ Hide particles around enderman slayer bosses and mini bosses
+ Added support for Shadow Fury abilty cooldown - HiZe
+ Added /sendcoords sending, detecting and rendering - dragon99z
+ Added **Boss Spawn Warning** - HiZe + hannibal2
    + Send a title when your slayer boss is about to spawn
    + Configurable percentage at which the title and sound should be sent
+ Added **Refusal Bypass Key** - HiZe
    + Hold a custom key to bypass the Prevent Refusing feature for visitors
+ Added **Farming Weight ETA Goal** - Kaeso
    + Override the Overtake ETA to show when you will reach the specified rank.
    + If not there yet
    + Default: #10k
+ Added **Dungeon Potion level as item stack size - HiZe
+ Added **Griffin Pet Warning**
    + Warn when holding an Ancestral Spade while no Griffin pet is selected.
+ More **Trophy Fish** features - appable0
    + **Trophy Fish Info** - Hover over trophy fish caught chat message to see information and stats about the trophy
      fish.
    + **Fillet Tooltip** - Adding fillet amount and price to the tooltip of a trophy fish. Left shift to show stack
      value.
+ Added Chumcap support for Chum Bucket Hider - jani

### Changes

+ SkyHanni no longer requires Patcher to start! (Big thanks nea)
+ Option to show the yaw and pitch display outside garden or while not holding a farming tool (Contributed by CalMWolfs)
+ Added wizard warp as diana waypoint
+ Added option to show exact prices in estimated item value
+ Better error handling with missing neu repo items - CalMWolfs
+ Changes to **Discord RCP** - NetheriteMiner
    + More images for different locations
    + Fixed names unnecessarily getting cut off when visiting an island in Location
    + Fewer crashes because of NEU Item Repo
+ Changed time for Trapper from 30 to 15 seconds while Finnegan is mayor – CalMWolfs
+ Added warning to not disable repo auto-update
+ Wither impact ability cooldown now only shows when all 3 scrolls are attached
+ Show total amount of all trophy fish rarities at the end of the chat message
+ Changed **Elite farming weight** display - Kaeso
    + Instantly showing the next player in the lb when passing someone on the leaderboard
+ Show in chat the total amount of sharks fished after the fishing contest
+ Custom text over Visitor name moves more smoothly now
+ Discord Rich Presence now supports Motes in the rift and the garden plot number - NetheriteMiner
+ Crop money display: Using npc price for mushroom cow pet calculation when on ironman, stranded or bingo
+ Sacks no longer get blocked from moving in storage (not clickable items feature)
+ Using 19.9 bps if bps is too low for jacob contest ff needed display
+ Better default positions for some guis

### Fixes

+ Fixed Pocket Sack-In-A-Sack Replace in lore
+ Fixed possible crash with broken neu repo when opening the desk inventory in garden (Contributed by CalMWolfs)
+ Fixed frozen treasures per hour display being inaccurate (Contributed by CalMWolfs)
+ Fixed bug with ghost counter sometimes not detecting new kills (Contributed by CalMWolfs)
+ Fixed **Ghost Counter** - HiZe & ksipli
    + Should no longer have compatibility issues with other mods
    + It work even if the action bar show percent +xxx (xx%) instead of +xxx (xxx/xxx)
    + Added command /shresetghostcounter to reset everything (not the bestiary data)
    + Added time format in ETA formatting (can show days, hours, minutes and seconds remaining)
+ Fixed **Dungeon Master Stars** calculation not working correctly sometimes – hannibal2 & Fix3dll
+ Fixed Discord Rich Presence detecting absorption hearts not correctly – NetheriteMiner
+ Fixed Reputation Helper **Kuudra Completions** not getting detected and adding T4 and T5 support - Cinshay
    + Fixed Item Ability cooldown not working for Astraea - hannibal2
    + Fixed a typo in the config - hannibal2
    + Added a workaround for a crash when refusing a visitor - hannibal2
+ Added support for new counter drops to dicer rng counter - ReyMaratov
+ Fixed composter inventory numbers after Hypixel changes - hannibal2
+ Rng dicer chat hider now works without enabling drop counter
+ Server restart timer no longer shows all the time if over 2 minutes
+ Fixed crazy rare drops not counting properly - ReyMaratov
+ Fixed individual attribute prices in estimated item value - nea
+ Fixed sack display detection - hize
+ Fixed rare Ghost Counter bugs - hize
+ Fixed a bug that farming weight display does not show up if you only have one profile
+ Fixed broken thorn damage indicator detection in dungeon F4/M4
+ Fixed togglesneak mod breaking escape menu open detection for quick mod menu switch
+ Fixed error with detecting hit phase during eman slayer in damage indicator
+ No longer double counting mob kill coins in slayer item profit tracker
+ Fixed jacob contest time chat message chat shows one second too long
+ Fixed farming contest calendar reading going above 100% - Contrabass26
+ Changed multiple descriptions in the misc category, fixed grammar and punctuation problems - Absterge
+ Fixed rare bug with Damage Indicator

## Version 0.18 (2023-06-19)

### New Features

+ Added **Visitor Drop Counter** (Contributed by CalMWolfs)
    + Counts up all the drops that you get from visitors
    + Count each rarity of visitor Accepted
    + Count copper, farming exp and coins spent
    + Setting to show number or drop first
    + Setting to show as the icon instead of the name
    + Setting to show only on the barn plot
+ Added **Contest Time Needed**
    + Show the time and missing FF for every crop inside Jacob's Farming Contest inventory.
+ Added **Garden Start Location**
    + Show the start waypoint for your farm with the currently holding tool.
    + Auto-detects the start of the farm when farming for the first time
    + Option to manually set the waypoint with /shcropstartlocation
+ Added **price display next to sack items** (Contributed by HiZe)
    + Can be disabled
    + Sortable by price or items stored (both desc/asc)
    + Option to show prices from Bazaar or NPC
+ Added Farming Fortune Breakdown for Armor and Equipment (Contributed by CalMWolfs)
    + Run /ff to open the menu
    + Works with: Base Stats, Reforge Bonus, Ability Fortune and Green Thumb
    + Breakdown for the true farming fortune from each crop
    + Ability to select a single piece of armor or equipment
+ Added Server Restart Title
+ Added Jacob Contest Stats Summary
    + Showing Blocks per Second and total Blocks clicked after a farming contest in chat
+ Added City Project Features
    + Show missing items to contribute inside the inventory
        + Click on the item name to open the bazaar
    + Highlight a component in the inventory that can be contributed
+ Added `/pt <player>` alias for `/party transfer <player>`
    + SkyBlock Command `/tp` to check the play time still works
+ Added **Command Autocomplete**
    + Supports tab completing for warp points when typing /warp
    + Supports party members, friends (need to visit all friend list pages), player on the same server
    + Supports these commands: /p, /party, /pt (party transfer), /f, /friend /msg, /w, /tell, /boop, /visit, /invite,
      /ah, /pv (NEU's Profile Viewer), /shmarkplayer (SkyHanni's Mark Player feature)
    + Supports VIP /visit suggestions (e.g. PortalHub or Hubportal)
+ Added Item Profit Tracker (Slayer only)
    + Count items collected and how much you pay while doing slayer, calculates final profit
    + Shows the price of the item collected in chat (default disabled)
+ Added Items on Ground (Slayer only)
    + Show item name and price over items laying on ground (only in slayer areas)
+ Added Broken Hyperion Warning (Slayer only)
    + Warns when right-clicking with a Wither Impact weapon (e.g. Hyperion) no longer gains combat exp
    + Kill a mob with melee-hits to fix this hypixel bug
    + Only while doing slayer
+ Added Piece of Wizard Portal show earned by player name (Contributed by HiZe)
+ City Project Daily Reminder
    + Remind every 24 hours to participate
+ Added Quick Mod Menu Switching (default disabled)
    + Allows for fast navigation between one Mod Config and another
    + Default disabled
    + Detects your SkyBlock Mod automatically
    + Does detect Chat Triggers and OneConfig itself, but no single mods that require these libraries
+ Added **Arachne Chat Hider**
    + Hide chat messages about the Arachne Fight while outside of Arachne's Sanctuary
+ Added **Contest Time Needed**
    + Show the time and missing FF for every crop inside Jacob's Farming Contest inventory
+ Added **Sack Item Display** (Contributed by HiZe)
    + Added price display next to sack items
    + Can be disabled
    + Sortable by price or items stored (both desc/asc)
    + Option to show prices from Bazaar or NPC
+ Added profile id chat hider
+ Added Garden Crop Start Location
    + Show the start waypoint for your farm with the currently holding tool.
    + Auto-detects the start of the farm when farming for the first time
    + Option to manually set the waypoint with `/shcropstartlocation`
+ Added Pet Candies Used number
    + Works even after Hypixel removed the `10 pet candies applied` line
+ Added Estimated Armor Value display
    + Shows the price of all 4 armor pieces combined inside the wardrobe
+ Added Garden Plot Icon (Contributed by HiZe)
    + Select an item from the inventory to replace the icon in the Configure Plots inventory
    + Change the Edit mode in the bottom right corner in the Configure Plots inventory
+ Showing fished item names
+ Show numbers of Pocket Sack-In-A-Sack applied on a sack (Default disabled, contributed by HiZe)
+ Added a warning when finding a visitor with a rare reward
    + Show message in chat, over the visitor and prevents refusing
+ Added composter empty timer for outside garden
+ Added title warning when picking up an expensive slayer item
+ Added **RNG Meter Display**
    + Display number of bosses needed until the next RNG Meter item drops
    + Warn when no item is set in the RNG Meter
    + Hide the RNG Meter message from chat if the current item is selected
+ Added **Ghost Counter** (Contributed by HiZe)
    + Shows number of ghosts killed in the Mist in Dwarven Mines
    + Shows kill combo, coins per scavenger, all item drops, bestiarity, magic find and more
    + Each display line is highly customizable

### Changes

+ Added Options for displays Crop Milestone and Best Crop Time.
    + Change the time format/the highest time unit to show. (1h30m vs. 90 min)
    + Maxed Milestone:  Calculate the progress and ETA until maxed milestone (46) instead of the next milestone.
+ Changed 'Warp to Trapper Hotkey' to only work while in the Farming Islands
+ Changed Trevor Trapper find mods logic (Contributed by CalMWolfs)
    + Fixed Detection of Oasis Mobs and Horse
    + Improved detection speed
    + Derpy double health support
    + More fair detection logic
+ Added extra setting to allow/block clicks for the 'hide not clickable' feature
+ Disabled hide far particles feature in M7 boss fight. This will fix M7 boss fight features from other mods
+ Added support for multiple players/profiles:
    + SkyHanni saves all profile specific data now separately (e.g., garden data, crimson isle reputation progress,
      minion display text on the island)
    + Config toggles and GUI elements stay synced between all profiles
+ Reworked Hide Armor
    + More options
        + Fixed Movement bugs with Depth Strider enchantment
        + Fixed compatibility issues with other mods
        + Note: The hide armor config got reset, if you want to use it, you have to enable it again)
+ Added support for maxed out crop milestones
+ Showing total price for visitor items needed
+ Warning when BPS in Jacob contest ff needed display is below 1
+ More Discord Rich Presence features (Contributed by NetheriteMiner)
    + Option "Profile" not only shows the profile name but also the profile type and SkyBlock level
    + Option "Dynamic" now also supports stacking enchantments
+ Highlight the item in bazaar search result inventory when clicking on an item list (Contributed by CalMWolfs)
+ Resetting Ragnarock ability cooldown when being hit during channeling
+ Hide Non God Pot Effect Display while inside the Rift

### Fixes

+ Fixed typos in Trevor Trapper texts (Contributed by CalMWolfs)
+ Fixed Hypixel bug that the equipment lore talks about "kills" instead of "visitors" (Contributed by CalMWolfs)
+ Fixed reforge stone 'warped' not detected in item price display
+ Hotkey to open SkyHanni Position Editor no longer works inside signs
+ Fixed non god pot effects display being wrong sometimes
+ Fixed duplex not working in Bazaar features
+ Fixed crashes with repo errors
+ If you touch water, the King Scent form Non God Pot Timer will now be correctly removed

### Removals

- Removed Garden Recent Teleport Pads display

## Version 0.17 (2023-05-11)

### Features

+ Added **Time to Kill**
    + Show the time it takes to kill the Slayer boss.
+ Added skill and collection level as item stack.
+ Added **Auction Highlighter**
    + Highlight own items that are sold in green and that are expired in red.
+ Added support for tier 1 minions and title send for the minion craft helper.
+ Added Chicken head Timer.
+ Added **rancher boots** speed display.
+ Added **Unclaimed Rewards**
    + Highlight contests with unclaimed rewards in the jacob inventory.
+ Added **Duplicate Hider**
    + Hides duplicate farming contests in the inventory.
+ Added **Contest Time**
    + Adds the real time format to the farming contest description.
+ Added **Hide Repeated Catches** (contributed by appable)
    + Delete past catches of the same trophy fish from chat
+ Added **Trophy Counter Design** (contributed by appable)
    + Change the way trophy fish messages gets displayed in the chat
+ Added **CH Join**
    + Helps buy a Pass for accessing the Crystal Hollows if needed
+ Added **Estimated Item Value**
    + Displays an estimated item value for the item you hover over
+ Added Arachne to damage indicator.
+ Added **Arachne Minis Hider**
    + Hides the nametag above arachne minis
+ Added **Arachne Boss Highlighter**
    + Highlight the arachne boss in red and mini bosses and orange.
+ Added **Discord RPC** (contributed by NetheriteMiner)
    + Showing stats like Location, Purse, Bits, Purse or Held Item at Discord Rich Presence

### Garden Features

+ Added **Copper Price**
    + Show copper to coin prices inside the Sky Mart inventory.
+ Added **Visitor Display**
    + Show all items needed for the visitors.
+ Added **Visitor Highlight**
    + Highlight visitor when the required items are in the inventory or the visitor is new and needs to checked what
      items it needs
+ Added **Show Price**
    + Show the bazaar price of the items required for the visitors.
+ Added **Crop Milestone** Number
    + Show the number of the crop milestone in the inventory.
+ Added **Crop Upgrades** Number
    + Show the number of upgrades in the crop upgrades inventory.
+ Added **Visitor Timer**
    + Timer when the next visitor will appear, and a number how many visitors are already waiting.
+ Added **Visitor Notification**
    + Show as title and in chat when a new visitor is visiting your island.
+ Added **Plot Price**
    + Show the price of the plot in coins when inside the Configure Plots inventory.
+ Added **Garden Crop Milestone Display**
    + Shows the progress and ETA until the next crop milestone is reached and the current crops/minute value. (Requires
      a tool with either a counter or cultivating enchantment)
+ Added **Best Crop Display**
    + Lists all crops and their ETA till next milestone. Sorts for best crop for getting garden level or skyblock level.
+ Added **Copper Price**
    + Show the price for copper inside the visitor gui.
+ Added **Amount and Time**
    + Show the exact item amount and the remaining time when farmed manually. Especially useful for ironman.
+ Added **Custom Keybinds**
    + Use custom keybinds while having a farming tool or Daedalus Axe in the hand in the garden.
+ Added Desk shortcut in SkyBlock Menu.
+ Added **Garden Level Display**
    + Show the current garden level and progress to the next level.
+ Added **Farming Weight and Leaderboard**, provided by the elite skyblock farmers.
+ Added farming weight next leaderboard position eta.
+ Added **Dicer Counter**
    + Count RNG drops for Melon Dicer and Pumpkin Dicer.
+ Added **Optimal Speed**
    + Show the optimal speed for your current tool in the hand. (Ty MelonKingDE for the values)
    + Also available to select directly in the rancher boots overlay (contributed by nea)
+ Added **Warn When Close**
    + Warn with title and sound when the next crop milestone upgrade happens in 5 seconds
    + Useful for switching to a different pet for leveling
+ Added **Money per Hour**
    + Displays the money per hour YOU get with YOUR crop/minute value when selling the items to bazaar.
+ Added farming contest timer.
+ Added wrong fungi cutter mode warning.
+ Added show the price per garden experience inside the visitor gui.
+ Added support for mushroom cow pet perk. (Counting and updating mushroom collection when breaking crops with mushroom
  blocks, added extra gui for time till crop milestones)
+ Added blocks/second display to crop milestone gui and made all crop milestone gui elements customizable/toggleable.
+ Added farming armor drops counter.
+ Added **Colored Name**
    + Show the visitor name in the color of the rarity.
+ Added **Visitor Item Preview**
    + Show the base type for the required items next to new visitors (Note that some visitors may require any crop)
+ Added **Teleport Pad Compact Name**
    + Hide the 'Warp to' and 'No Destination' texts over teleport pads.
+ Added **Money per Hour Advanced stats**
    + Show not only Sell Offer price but also Instant Sell price and NPC Sell price
    + Suggestion: Enable Compact Price as well for this
+ Added **Anita Medal Profit**
    + Helps to identify profitable items to buy at the Anita item shop and potential profit from selling the item at the
      auction house.
+ Added **Composter Compact Display**
    + Displays the compost data from the tab list in a compact form as gui element.
+ Added **Composter Upgrade Price**
    + Show the price for the composter upgrade in the lore
+ Added **Highlight Upgrade**
    + Highlight Upgrades that can be bought right now.
+ Added **Number Composter Upgrades**
    + Show the number of upgrades in the composter upgrades inventory.
+ Added **Composter Inventory Numbers**
    + Show the amount of Organic Matter, Fuel and Composts Available while inside the composter inventory.
+ Added **True Farming Fortune
    + Displays** current farming fortune, including crop-specific bonuses. (contributed by appable)
+ Added **Tooltip Tweaks Compact Descriptions**
    + Hides redundant parts of reforge descriptions, generic counter description, and Farmhand perk explanation. (
      contributed by appable)
+ Added **Tooltip Tweaks Breakdown Hotkey**
    + When the keybind is pressed, show a breakdown of all fortune sources on a tool. (contributed by appable)
+ Added **Tooltip Tweaks Tooltip Format**
    + Show crop-specific farming fortune in tooltip. (contributed by appable)
+ Added command **/shcropspeedmeter**
    + Helps calculate the real farming fortune with the formula crops broken per block.
+ Added **Compost Low Notification**
    + Shows a notification as title when organic matter/fuel is low.
+ Added **Jacob's Contest Warning**
    + Show a warning shortly before a new jacob contest starts.
+ Added **Inventory Numbers**
    + Show the number of the teleport pads inside the 'Change Destination' inventory as stack size.
+ Added **Composter Overlay**
    + Show the cheapest items for organic matter and fuel, show profit per compost/hour/day and time per compost
+ Added **Composter Upgrades Overlay**
    + Show an overview of all composter stats, including time till organic matter and fuel is empty when fully filled
      and show a preview how these stats change when hovering over an upgrade
+ Hide crop money display, crop milestone display and garden visitor list while inside anita show, SkyMart or the
  composter inventory
+ Hide chat messages from the visitors in garden. (Except Beth and Spaceman)
+ Introduced a new command '/shcroptime <amount> <item>' that displays the estimated time it will take to gather the
  requested quantity of a particular item based on the current crop speed.
+ Show the average crop milestone in the crop milestone inventory.
+ Added **FF for Contest**
    + Show the minimum needed Farming Fortune for reaching a medal in the Jacob's Farming Contest inventory.
+ Added **yaw and pitch display**
    + Shows yaw and pitch with customizable precision while holding a farm tool.
    + Automatically fades out if no movement for a customizable duration (Contributed by Sefer)
+ Added warning when 6th visitors is ready (Contributed by CalMWolfs)

### Features from other Mods

> *The following features are only there because I want them when testing SkyHanni features without other mods present.*

+ Added Hide explosions.
+ Added **Enderman Teleportation Hider**
    + Stops the enderman teleportation animation (Like in SBA)
+ Added **Fire Overlay Hider**
    + Hide the fire overlay (Like in Skytils)

### Changes

+ Reworked reputation helper design in the crimson isle.
+ Moved the key setting for diana `warp to nearest burrow waypoint` from vanilla mc (esc -> config -> controls -> scroll
  all the way down to skyhanni category) to just `/sh diana`

### Fixed

+ Barbarian Duke Damage Indicator now only starts displaying after the player is getting close to him. (30 blocks)
+ Fixed a bug that caused fire veil particle `hider/redline drawer` to not always detect the right click correctly.
+ Removed `Fixing Skytils custom Damage Splash` (Skytils has already fixed this bug. Additionally, this option enabled
  and skytils' damage splash disabled caused the hypixel damage splash to not show the tailing commas at all)
+ Fixed bug with particles that blocks NotEnoughUpdates' Fishing features.
+ Hopefully fixed incompatibility with skytils `hide cheap coins` feature.
+ Fixed dungeon milestone messages getting wrongfully formatted.
+ Fixed bazaar features not working for items with an `-` (turbo farming books and triple strike)
+ Fixed Crab Hat of Celebration not being detected as an accessory correctly.
+ Added support for soopy's \[hand] feature

## Version 0.16 (2023-02-11)

## Features

+ Added highlight for stuff that is missing in the skyblock level guide inventory.
+ Added Bingo Card display.
+ **Minion Craft Helper** - Show how many more items you need to upgrade the minion in your inventory. Especially useful
  for bingo.
+ Hide dead entities - Similar to Skytil's feature for inside dungeon, but for everywhere.
+ Hide Fireball particles and hide Fire Block particles.
+ Made **blaze slayer clear view** work with more particles.
+ Added colors for the missing slayer area bosses (Golden Ghoul, Old Wolf and Spider Keeper)
+ Added Arachne keeper highlighter.
+ Added area boss highlighter.
+ Added area boss spawn timer.
+ Added Corleone highlighter.
+ Added **Tps Display** - Show the Tps of the current server.
+ Added Kuudra Key Number overlay.
+ Added colored highlight support for zealots, bruisers and special zealots.
+ Added more particle hiders. (Far particles, near redstone particles and smoke particles)

## Removals

- Removed Blaze slayer Pillar warning + timer (The Feature caused lags and Soopy's approach is better)

## Version 0.15.1 (2023-01-25)

## Features

+ Adding green line around items that are clickable. (Inside the **Not Clickable Items Feature**)
+ Added **Odger waypoint** - Show the Odger waypoint when trophy fishes are in the inventory and no lava rod in hand.
+ Added the option to hide the red numbers in the scoreboard sidebar on the right side of the screen.
+ Added **Tia Relay Waypoint** - Show the next Relay waypoint for Tia The Fairy, where maintenance for the abiphone
  network needs to be done.
+ Added **Tia Relay Helper** - Helps with solving the sound puzzle.

## Changes

+ Hide reputation boss waypoint when damage indicator is present.

## Version 0.15 (2023-01-22)

### Features

+ Added Bazaar Update Timer - Forrick.
+ Added Crimson Isle Reputation Helper.
+ Added **Barn Timer** - Show the time and amount of sea creatures while fishing on the barn via hub.
+ Added **Shark Fish Counter** - Counts how many sharks have been caught.
+ Added **Hide Silver Duplicates** - Hiding chat message when catching a duplicate silver trophy fish.

### Changes

+ **Damage Indicator** text size scale now changes dynamically.
+ Enderman slayer beacon now renders behind the damage indicator text, for better readability.

### Fixes

+ Fixed **Steaming Hot Flounder** in custom trophy fish counter.
+ Fixed hide powder gain message from chests in crystal hollows. (thanks hypixel)
+ Fixed damage indicator for M3 Professor bug. (Thanks hypixel)

## Version 0.14

### Features

+ Added /shtrackcollection <item> - This tracks the number of items you collect, but it does not work with sacks.
+ Added Compact Bingo Chat Messages.
+ Added Compact Potion Effect Chat Messages.
+ Added Brewing Stand Overlay.
+ Added minion name display with minion tier.

### Changes

+ Don't render overlays when tab list key is pressed.
+ Do no longer prevent the selling of bazaar items to NPC when on ironman, stranded or bingo mode.

### Fixes

+ Fixed wrong dungeon level colors. (in Party Finder)
+ Fixed error in Sea Creature Guide inventory.

## Version 0.13

### Features

+ Player Rank Hider works now with all messages.
+ Add two more chat filter categories: Powder Mining and Winter Gifts.
+ Add catacombs class level color to party finder.
+ Add wishing compass uses amount display.
+ Saves missing items from canceled buy orders to clipboard for faster re-entry.
+ Adds a visual highlight to the Croesus inventory that show what chests have not yet been opened.

### Removals

- Removed additional settings for the chat design, like channel prefix and skyblock level

### Fixes

+ Fixed void slayer mini bosses not being detected and colored.

## Version 0.12.2

### Changes

+ Add Bonzo's Mask highlight timer
+ Made the config button in the forge mod list work.
+ Blaze slayer pillar warning text is now much bigger.
+ Hides the new 'you earn x event exp' message.
+ Added Peek Chat feature.

### Fixes

+ Fixed a bug that caused the right blaze slayer dagger highlight to show wrong values.
+ Fixed kill combo message filter format

## Version 0.12.1

### Fixes

+ Fixed a crash when checking if the hotkey is pressed.

## Version 0.12

### Diana

+ Show burrows near you.
+ Uses Soopy's Guess Logic to find the next burrow. Does not require SoopyV2 or chat triggers to be installed.
+ Let Soopy guess the next burrow location for you.
+ Warps to the nearest warp point on the hub, if closer to the next burrow.

### Crimson Isle

+ Option to remove the wrong blaze slayer dagger messages from chat.
+ Hide particles and fireballs near blaze slayer bosses and demons.
+ Added Option to hide blaze particles.
+ Highlight millenia aged blaze color in red

### Changes

+ Removed more blaze slayer item drop message spam.
+ Showing number next to custom hellion shield from damage indicator.
+ All particles next to ashfang are now hidden when clear ashfang view is enabled.
+ All particles around blaze slayer are hidden when blaze particles is enabled.
+ Hide blocks circling around ashfang.
+ Hide the vanilla nametag of damage indicator bosses.

## Version 0.11

### Slayer

+ Added toggle to ender slayer phase display
+ Added blaze slayer phase display
+ Added toggle for blaze slayer colored mobs
+ Mark the right dagger to use for blaze slayer in the dagger overlay.
+ Added option to select the first, left sided dagger for the display.

### Stats Tuning

+ Show the tuning stats in the Thaumaturgy inventory.
+ Show the amount of selected tuning points in the stats tuning inventory.
+ Highlight the selected template in the stats tuning inventory.
+ Show the type of stats for the tuning point templates.

### Misc

+ Added Lord Jawbus to damage indicator
+ Display the active non-god potion effects.

### Changes

+ Showing Thunder Sparks while in lava
+ Damage indicator switches into cleaner design when close to boss and not in f5 view

### Fixes

+ Reduced lags after world switch

## Version 0.10 - Slayer

### Blaze Slayer

+ Added a cooldown when the Fire Pillars from the Blaze Slayer will kill you.
+ Added a faster and permanent display for the Blaze Slayer daggers.
+ Added custom countdown sound for the Fire Pillar timer for the Blaze Slayer.
+ Added hide sound and entities when building the Fire Pillar for the Blaze Slayer.
+ Added warning when the fire pit phase starts for the Blaze Slayer tier 3.

### Slayer

+ Added warning when wrong slayer quest is selected, or killing mobs for the wrong slayer.
+ Added hide more poor slayer drop chat messages.

### Misc

+ Added option to hide armor or just helmet of other player or yourself.

### Fixes

+ Fixed overload damage gets not detected as damage splash.

## Version 0.9 - Chat + Dungeon

### Chat

+ Added option to enable that clicking on a player name in chat opens the profile viewer of NotEnoughUpdates (to fix
  SkyHanni breaking the default NEU feature).
+ Added support for new SBA chat icon feature (show profile type and faction in chat)
+ Highlight marked player names in chat.
+ Scan messages sent by players in all-chat for blacklisted words and greys out the message
+ Links in player chat are clickable again

### Dungeon

+ Added hide the damage, ability damage and defense orbs that spawn when the healer is killing mobs in dungeon
+ Added hide the golden fairy that follows the healer in dungeon.
+ Added hidden music for the clean end of the dungeon

### Misc

+ Added hide the name of the mobs you need to kill in order for the Slayer boss to spawn. Exclude mobs that are damaged,
  corrupted, runic or semi rare.
+ Added option to hide all damage splashes, from anywhere in Skyblock.
+ Added highlight Thunder Sparks after killing a Thunder
+ Added Thunder to damage indicator
+ Mark the own player name (for Chat messages)

### Fixed

- Fixed vanilla items not being sellable to npc

## Version 0.8

### Misc

- Added hiding the flame particles when using the Fire Veil Wand ability
- Added circle around the player when having the Fire Veil Wand ability is active
- The config GUI how has a search function (top right corner)
- Added more player chat format options (show all channel prefix, hide player rank, hide colon after player name,
  hide/change elite position format, channel prefix design)

### Small Changes

- Changed the ashfang gravity orb highlight from square to cylinder
- Added msg support to fancy chat format
- Added damage indicator for diana mobs

### Fixes

- Fixed enchanted books in bazaar
- Fixed LorenzLogger printing output into console
- Fixed best sell method not working for some bazaar items
- Fixed summoning mobs display don't track mobs when moving too fast while spawning summoning mobs

## Version 0.7 - Dungeon and Colored Highlight

### New Dungeon Features

- Added highlight deathmites in dungeon in red color
- Added hide Superboom TNT lying around in dungeon
- Added hide Blessings lying around in dungeon
- Added hide Revive Stones lying around in dungeon
- Added hide Premium Flesh lying around in dungeon
- Added Dungeon Copilot (Suggests to you what to do next in dungeon)
- Added separate option to hide dungeon key pickup and door open messages
- Added hide Journal Entry pages lying around in dungeon.
- Added hide Skeleton Skulls lying around in dungeon.
- Added highlight Skeleton Skulls in dungeon when combining into a skeleton in orange color (not useful combined with
  feature Hide Skeleton Skull)

### Other Misc Features

- Added option to hide the Skyblock Level from the chat messages (alpha only atm)
- Added option to change the way the Skyblock Level gets displayed in the chat (only working when skyblock level and
  fancy player message format are enabled)
- Added highlight the voidling extremist in pink color
- Added highlight corrupted mobs in purple color
- Added command /shmarkplayer <player> (marking a player with yellow color)
- Added highlight slayer miniboss in blue color
- Added option to hide the death messages of other players, except for players who are close to the player, inside
  dungeon or during a Kuudra fight.
- Added highlight the enderman slayer Yang Glyph (Beacon) in red color (supports beacon in hand and beacon flying)

### Fixes

- Fixed message filter for small bazaar messages

## Version 0.6 - Ashfang and Summoning Mobs

### New Features

- Added /wiki command (using hypixel-skyblock.fandom.com instead of Hypixel wiki)
- Added hiding damage splashes while inside the boss room (replacing a broken feature from Skytils)
- Added Summoning Mob Display (Show the health of your spawned summoning mobs listed in an extra GUI element and hiding
  the corresponding spawning/despawning chat messages)
- Added option to hide the nametag of your spawned summoning mobs
- Added option to mark the own summoning mobs in green
- Added Ashfang Blazing Souls display
- Added highlight for the different ashfang blazes in their respective color
- Added option to hide all the particles around the ashfang boss
- Added option to hide the name of full health blazes around ashfang (only useful when highlight blazes is enabled)
- Added option to hide damage splashes around ashfang

### Minor Changes

- Optimizing the highlight block size for minions, blazing souls and gravity orbs
- Added option to change the gray-out opacity for 'Not Clickable Items'
- Added option to show the health of Voidgloom Seraph 4 during the laser phase (useful when trying to phase skip)
- Fixed that items with stars don't gray out properly when hidden by the 'hide not clickable' feature
- Fixed 'hiding the nametag of mobs close to minions' not working when minion nearby was never collected

## Version 0.5 - Minions and RNG Meter

### New Features

- Added a display that show the last time the hopper inside a minion has been emptied
- Added a marker to the last opened minion for a couple of seconds (Seen through walls)
- Added option to hide mob nametags close to minions
- Added showing stars on all items (Not only dungeon stars and master stars but also on crimson armors, cloaks and
  fishing rods)
- Added **Real Time** - Display the current computer time, a handy feature when playing in full-screen mode.
- Added overlay features to the RNG meter inventory (Highlight selected drop and floors without a drop and show floor)
- Added minion hopper coins per day display (Using the held coins in the hopper and the last time the hopper was
  collected to calculate the coins a hopper collects in a day)

### Minor Changes

- Summoning souls display is rendering better close to corners
- Ashfang gravity orbs are now rendering better close to corners
- Showing the name of ashfang gravity orbs as a nametag above the orb
- Bazaar now knows books and essences (Thanks again, Hypixel)

### Bug Fixes

- Fixed damage Indicator damage over time display order swapping sometimes

## Version 0.4.2 - Repair what Hypixel broke

### New Features

- Added grabbing the API key from other mods. First time using SkyHanni should not require you to set the API key
  manually (Thanks efefury)

### Fixes

- Fixing ender slayer health for damage indicator (Hypixel broke it)
- Fixing format to hide all blessing messages in dungeon again (Hypixel broke it)
- Fixing 'damage splash hiding' when near damage indicator (Hypixel broke it)
- Fixed Skytils custom damage splash (Hypixel broke it)

## Hotfix 0.4.1 - Removing red bazaar errors

- This is no support for the new enchanted books in the bazaar. It’s just removing the red error messages from the chat.

## Version 0.4

### Damage Indicator stuff

- Added damage indicator healing chat messages
- Added damage indicator showing boss name (not working in dungeon yet)
- Added damage indicator option to hide or only show short name
- Added option to enable/disable damage indicator for specific bosses
- Added enderman slayer hits display to damage indicator
- Added that damage indicator is showing when the boss is dead
- Added enderman slayer laser phase cooldown to damage indicator
- Added all slayers to damage indicator (except blaze above tier 1)
- Added revenant slayer 5 boom display to damage indicator
- Fixed damage indicator f4 and m4 thorn support for Derpy
- Added option to hide vanilla (or Skytils) damage splashes next to damage indicator
- Added damage/healing over time display to damage indicator
- Added Training Dummy (on personal island) to damage indicator

### Other stuff

+ Added ashfang reset cooldown
+ Added fire veil wand ability cooldown
+ Added custom player chat for dead players in dungeon and for visiting players on own islands
+ Added ashfang gravity orbs display

## Version 0.3

- Added damage indicator for magma boss and headless horseman
- Added summoning souls display
- Added Derpy support for damage indicator

## Version 0.1

- Added damage indicator for some bosses who are outside dungeon (4 nether bosses: Ashfang, barbarian duke, mage outlaw
  and Bladesoul, slayers: Enderman 1-4, revenant 5, and untested support for vanquisher in nether, Enderdragon and
  Endstone protector in end)
- Added item ability cooldown background display (over the slot, work in progress)
- Added Ashfang freeze cooldown (when you get hit by “anti ability” and slowness effect)
- Changed “hot clickable items” to show items again, but only with dark gray overlay. Looks nicer
- Made the GitHub repository public