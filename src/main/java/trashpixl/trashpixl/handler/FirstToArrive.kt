package trashpixl.trashpixl.handler//the package for this project

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.getMinigame

class FirstToArrive(plugin: Trashpixl?, main: JavaPlugin) : Listener {
    private var mainPlugin = main

    init {//the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
    }

    @EventHandler//define that the following code is an event handler
    fun pressurePlateHandler(ev: PlayerInteractEvent) {//describes what the event is
        if (ev.action == Action.PHYSICAL) {//check if the action is physical
            if (ev.clickedBlock!!.type == Material.WARPED_PRESSURE_PLATE) {//compare what the player step on to a warped pressure plate
                val p = ev.player//create the local player id
                if (getMinigame() == 8 || getMinigame() == 5 || getMinigame() == 6) {//checking if the number in the file correspond to the number require to start the minigame
                    if (Variable.serverType == 1) {//checking if the environment is the lobby
                        p.chat(p.name + " won the race")//sending the won message
                        for (p2 in Bukkit.getServer().onlinePlayers) {//getting all online player
                            val connect = ByteStreams.newDataOutput()//creating the connection
                            connect.writeUTF("Connect")//writing the command
                            connect.writeUTF("lobby")//writing the server name
                            p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//sending the message
                        }

                    }
                }
            }
        }
    }
}
