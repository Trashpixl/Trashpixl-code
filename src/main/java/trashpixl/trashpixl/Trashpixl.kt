package trashpixl.trashpixl // the package of this project

// import zero.zero.command.store.* //import all the class in store
// import zero.zero.handler.shop.* //import all the handler related to store
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.command.* // importing all the command
import trashpixl.trashpixl.handler.* // importing all the handler
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigameFile
import trashpixl.trashpixl.runnable.put


class Trashpixl : JavaPlugin() {
    // creating the main class
    override fun onEnable() { // plugin startup logic
        server.messenger.registerOutgoingPluginChannel(
                this,
                "BungeeCord"
        ) // register the chanel

        Death(this, this) // init the death handler
        Loot(this) // init the loot handler
        PlateHandler(this, this) // init the plate handler
        WoodPlateHandler(this) // init the wood plate handler
        Laucher(this, this) // init the launcher handler
        FirstToFinish(this, this) // init the first to finish handler
        Punch(this) // init the punch handler
        LauncherJoin(this)
        if (environment() == 0) { // check if server equals 0
        }
        if (environment() == 1) { // check if server equal 1

            this.getCommand("onCommandPvp")
                    ?.setExecutor(
                            OnCommandPvp()
                    ) // init the command for the pvp game
            this.getCommand("onCommandTnt")
                    ?.setExecutor(
                            OnCommandTnt()
                    ) // init the command for capture the flag
            this.getCommand("onCommandPvpBow")
                    ?.setExecutor(
                            OnCommandPvpBow()
                    ) // init the command for pvp bow
            this.getCommand("onCommandPvpSumo")
                    ?.setExecutor(
                            OnCommandPvpSumo()
                    ) // init the command for pvp sumo

            this.getCommand("onCommandPvpKnockBack")
                    ?.setExecutor(
                            OnCommandPvpKnockBack()
                    ) // init the command for pvp knock back
            this.getCommand("onCommandPvpLoot")
                    ?.setExecutor(
                            OnCommandPvpLoot()
                    ) // init the command for pvp loot
            this.getCommand("onCommandParkour")
                    ?.setExecutor(
                            OnCommandParkour()
                    ) // init the command for the parkour


            this.getCommand("onCommandBridgeRace")
                    ?.setExecutor(
                            OnCommandBridgeRace()
                    ) // init the command for the tag
            this.getCommand("onCommandLabi")
                    ?.setExecutor(
                            OnCommandLabi()
                    ) // init the command for the tag
        }
        put(minigameFile, 0)


    }

    override fun onDisable() {
        // Plugin shutdown logic
        this.server.messenger.unregisterOutgoingPluginChannel(this) // unregister the chanel
        this.server.messenger.unregisterIncomingPluginChannel(this) // unregister the chanel
    }
}
