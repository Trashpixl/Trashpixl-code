package trashpixl.trashpixl//package of the file


import org.bukkit.plugin.java.JavaPlugin//import the java plugin
import org.bukkit.scheduler.BukkitRunnable//import the bukkit runnable
import trashpixl.trashpixl.command.* //importing all the command
import trashpixl.trashpixl.handler.* //importing all the handler
import trashpixl.trashpixl.runnable.*//importing all the runnable


class Trashpixl : JavaPlugin() {
    //the main class of the plugin
    //creating the main class
    override fun onEnable() {//plugin startup logic

        server.messenger.registerOutgoingPluginChannel(this, "BungeeCord")//register the chanel
        object : BukkitRunnable() {
            //create a new runnable
            override fun run() {//run the runnable
                // Do something on each server tick
                timer()//run timer
                lineOfSight()//run line of sight
                isBlinded()//run is blinded
            }
        }.runTaskTimer(this, 0L, 10L)//run the timer immediately and at every 10 tick
        Remove(this, this)//start the remove handler
        Break(this)//start the break handler
        Place(this)//start the place handler
        Join(this)//start the join handler
        Quit(this)//start the quit handler
        Death(this, this)//init the death handler
        Loot(this)//init the loot handler
        PlateHandler(this, this)//init the plate handler
        WoodPlateHandler(this)//init the wood plate handler
        Launcher(this, this)//init the launcher handler
        FirstToFinish(this, this)//init the first to finish handler
        Punch(this)//init the punch handler
        LauncherJoin(this)//init the launcher join handler
        GetShot(this)//init the get shot handler
        if (environment() == 1) {//check if server equal 1

            this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())//init the command for the pvp game
            this.getCommand("onCommandTnt")?.setExecutor(OnCommandTnt())//init the command for capture the flag
            this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())//init the command for pvp bow
            this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())//init the command for pvp sumo
            this.getCommand("onCommandPvpKnockBack")?.setExecutor(OnCommandPvpKnockBack())//init the command for pvp knock back
            this.getCommand("onCommandPvpLoot")?.setExecutor(OnCommandPvpLoot())//init the command for pvp loot
            this.getCommand("onCommandParkour")?.setExecutor(OnCommandParkour())//init the command for the parkour
            this.getCommand("onCommandBridgeRace")?.setExecutor(OnCommandBridgeRace())//init the command for the tag
            this.getCommand("onCommandLabi")?.setExecutor(OnCommandLabi())//init the command for the tag
            this.getCommand("onCommandButton4")?.setExecutor(OnCommandButton4())//init the command for the button 4
            this.getCommand("onCommandHideAndSeek")?.setExecutor(OnCommandHideAndSeek())//init the command for the hide and seek
            this.getCommand("onCommandTag")?.setExecutor(OnCommandTag())//init the command for the tag
            this.getCommand("onCommandSearchAndFind")?.setExecutor(OnCommandSearchAndFind())//init the command for the search and find
            this.getCommand("onCommandDodgeBall")?.setExecutor(OnCommandDodgeBall())//init the command for the dodge ball
            Variable.preventPlacedBlock = true//set the prevent placed block to true
            Variable.preventBreakedBlock = true//set the prevent breaked block to true

        }
        if(environment() == 2){
            Variable.preventPlacedBlock = true//set the prevent placed block to true
            Variable.preventBreakedBlock = true//set the prevent breaked block to true
        }
        if(environment() == 0){
           Variable.preventPlacedBlock = false//set the prevent placed block to false
            Variable.preventBreakedBlock = false//set the prevent breaked block to false
        }
        put(os(), 0)//put the minigame file to zero


    }

    override fun onDisable() {
        // Plugin shutdown logic
        this.server.messenger.unregisterOutgoingPluginChannel(this)//unregister the chanel
        this.server.messenger.unregisterIncomingPluginChannel(this)//unregister the chanel
    }
}
