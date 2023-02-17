package trashpixl.trashpixl.handler // the package for this project

import java.io.File // importing the java file var
import java.io.IOException // importing the io exception
import java.util.* // importing all the java util class
import org.bukkit.Bukkit // importing bukkit
import org.bukkit.Bukkit.getServer // importing the get server class
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.event.EventHandler // import the event handler
import org.bukkit.event.Listener // import all the listener
import org.bukkit.event.player.PlayerJoinEvent // import the action related to the player
import trashpixl.trashpixl.Trashpixl // import zero
import trashpixl.trashpixl.runnable.environment

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
            val fileName2 = "S:\\Mini.txt" // creating the file name var
            val actualFile2 = File(fileName2) // creating the file
            val mini: Int // creating the actual data var
            try { // trying the code
                if (actualFile2.exists() && actualFile2.isFile
                ) { // checking if actual file is a file
                    try {
                        val reader2 = Scanner(actualFile2) // creating the scanner
                        val data2 = reader2.nextLine() // reading the first line
                        mini = data2.toInt() // converting the data to an int
                        reader2.close() // closing the reader
                        for (playerCountloop in getServer().onlinePlayers) {
                            playerCount++
                        }
                        if (playerCount == 10) {
                            if (mini == 1) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandpvp"
                                ) // dispatchCommand for parkour
                            }
                            if (mini == 2) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandpvpsumo"
                                ) // dispatchCommand for parkour
                            }
                            if (mini == 3) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandpvpbow"
                                ) // dispatchCommand for parkour
                            }
                            if (mini == 4) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandpvploot"
                                ) // dispatchCommand for parkour
                            }
                            if (mini == 5) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandbridgerace"
                                ) // dispatchCommand for bridge
                            }
                            if (mini == 6) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandparkour"
                                ) // dispatchCommand for parkour
                            }
                            if (mini == 7) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandpvpknockback"
                                ) // dispatchCommand for pvp knock back
                            }
                            if (mini == 8) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandlabi"
                                ) // dispatchCommand for parkour
                            }
                            if (mini == 9) {
                                Bukkit.dispatchCommand(
                                        p,
                                        "oncommandtnt"
                                ) // dispatchCommand for tnt race
                            }
                            if (mini == 10) {
                                // add cps test
                                Bukkit.dispatchCommand(p, "oncommandcpstest")
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // trowing it again
                    }
                }
            } catch (e: IOException) { // catching the exception
                throw RuntimeException(e) // trowing it again
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
