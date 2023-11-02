package trashpixl.trashpixl // package of the file

import SnowBallGiver
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitRunnable
import trashpixl.trashpixl.command.*
import trashpixl.trashpixl.handler.*
import trashpixl.trashpixl.runnable.*

class Trashpixl : JavaPlugin() {
    override fun onEnable() { // plugin startup logic
        // server.dispatchCommand(server.consoleSender, "Command")
        server.messenger.registerOutgoingPluginChannel(this, "BungeeCord") // register the chanel
        put(os(), 0) // put the minigame file to zero
        registerHandler() // register the handler
        if (environment() == 1) { // check if server equal 1
            alwaysRun() // run the always run function
            registerCommand() // register the command
            Variable.preventPlacedBlock = true // set the prevent placed block to true
            Variable.preventBreakedBlock = true // set the prevent breaked block to true
            Variable.serverType = 1 // set the server type to 1
        }
        if (environment() == 2) {
            Variable.preventPlacedBlock = true // set the prevent placed block to true
            Variable.preventBreakedBlock = true // set the prevent breaked block to true
            Variable.serverType = 2 // set the server type to 2
        }
        if (environment() == 0) {
            Variable.preventPlacedBlock = false // set the prevent placed block to false
            Variable.preventBreakedBlock = false // set the prevent breaked block to false
            Variable.serverType = 0 // set the server type to 0
        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
        this.server.messenger.unregisterOutgoingPluginChannel(this) // unregister the chanel
        this.server.messenger.unregisterIncomingPluginChannel(this) // unregister the chanel
    }
    private fun alwaysRun() {
        object : BukkitRunnable() {
                    // create a new runnable
                    override fun run() { // run the runnable
                        // Do something on each server tick
                        timer() // run timer
                        lineOfSight() // run line of sight
                        isBlinded() // run is blinded
                    }
                }
                .runTaskTimer(this, 0L, 10L) // run the timer immediately and at every 10 tick
        object : BukkitRunnable() {
                    // create a new runnable
                    override fun run() { // run the runnable
                        removeTntStartBlock() // run the remove tnt start block
                    }
                }
                .runTaskTimer(this, 0L, 100L) // run the timer immediately and at every 40 tick
    }
    private fun registerCommand() {
        this.getCommand("onCommandPvp")
                ?.setExecutor(OnCommandPvp()) // init the command for the pvp game
        this.getCommand("onCommandTnt")
                ?.setExecutor(OnCommandTnt()) // init the command for capture the flag
        this.getCommand("onCommandPvpBow")
                ?.setExecutor(OnCommandPvpBow()) // init the command for pvp bow
        this.getCommand("onCommandPvpSumo")
                ?.setExecutor(OnCommandPvpSumo()) // init the command for pvp sumo
        this.getCommand("onCommandPvpKnockBack")
                ?.setExecutor(OnCommandPvpKnockBack()) // init the command for pvp knock back
        this.getCommand("onCommandPvpLoot")
                ?.setExecutor(OnCommandPvpLoot()) // init the command for pvp loot
        this.getCommand("onCommandParkour")
                ?.setExecutor(OnCommandParkour()) // init the command for the parkour
        this.getCommand("onCommandBridgeRace")
                ?.setExecutor(OnCommandBridgeRace()) // init the command for the tag
        this.getCommand("onCommandLabi")
                ?.setExecutor(OnCommandLabi()) // init the command for the tag
        this.getCommand("onCommandButton4")
                ?.setExecutor(OnCommandButton4()) // init the command for the button 4
        this.getCommand("onCommandHideAndSeek")
                ?.setExecutor(OnCommandHideAndSeek()) // init the command for the hide and seek
        this.getCommand("onCommandTag")?.setExecutor(OnCommandTag()) // init the command for the tag
        this.getCommand("onCommandSearchAndFind")
                ?.setExecutor(OnCommandSearchAndFind()) // init the command for the search and find
        this.getCommand("onCommandDodgeBall")
                ?.setExecutor(OnCommandDodgeBall()) // init the command for the dodge ball
        this.getCommand("onCommandCamelFight")
                ?.setExecutor(OnCommandCamelFight()) // init the command for the tnt start
    }
    private fun registerHandler() {
        ChanceToDie(this) // start the chance to die handler
        BlockBreak(this, this) // start the break handler
        BlockPlace(this) // start the place handler
        PlayerLogin(this) // start the join handler
        PlayerLogout(this) // start the quit handler
        PlayerDeath(this, this) // init the death handler
        LootGiver(this) // init the loot handler
        Portal(this, this) // init the plate handler
        WoodPressurePlate(this) // init the wood plate handler
        MinigameSelect(this, this) // init the launcher handler
        FirstToArrive(this, this) // init the first to finish handler
        PlayerGetPunch(this) // init the punch handler
        MinigameLauncher(this) // init the launcher join handler
        PlayerGetShot(this) // init the get shot handler
        CamelDismount(this) // init the camel dismount handler
        OnCamelSpawn(this) // init the camel spawn handler
        SnowBallGiver(this) // init the snow ball giver handler
    }
}
