package trashpixl.trashpixl.handler // the package for this project

import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.minigame

class LauncherJoin(plugin: Trashpixl?) : Listener { // the implements for the listener

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler
    fun onJoin(ev: PlayerJoinEvent) { // describes what the event is
        val p = ev.player // create the local player id
        var playerCount = 0
        // p.connect("mini")

        if (environment() == 1) {

            for (playerCountloop in getServer().onlinePlayers) {
                playerCount++


            }

            if (playerCount == 1) {

                if (minigame() == 1) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandpvp"
                    ) // dispatchCommand for parkour
                }
                if (minigame() == 2) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandpvpsumo"
                    ) // dispatchCommand for parkour
                }
                if (minigame() == 3) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandpvpbow"
                    ) // dispatchCommand for parkour
                }
                if (minigame() == 4) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandpvploot"
                    ) // dispatchCommand for parkour
                }
                if (minigame() == 5) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandbridgerace"
                    ) // dispatchCommand for bridge
                }
                if (minigame() == 6) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandparkour"
                    ) // dispatchCommand for parkour
                }
                if (minigame() == 7) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandpvpknockback"
                    ) // dispatchCommand for pvp knock back
                }
                if (minigame() == 8) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandlabi"
                    ) // dispatchCommand for parkour
                }
                if (minigame() == 9) {
                    Bukkit.dispatchCommand(
                            p,
                            "oncommandtnt"
                    ) // dispatchCommand for tnt race
                }
                if (minigame() == 10) {
                    // add cps test
                    Bukkit.dispatchCommand(p, "oncommandcpstest")
                }


            }
        }
        if (environment() == 2) {
            val x = 25.0
            val y = 81.0
            val z = 10.0
            val w: World = p.world // get the player world
            val to = Location(w, x, y, z) // put together all the info
            p.teleport(to) // tp him
        }
        if (environment() == 0) {
            val to: Location = p.bedSpawnLocation!! // get his bed location
            p.teleport(to) // tp him to his bed
        }
    }
}
