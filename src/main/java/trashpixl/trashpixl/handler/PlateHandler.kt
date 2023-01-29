package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams
import java.io.File // importing the java file var
import java.io.IOException // imprting the io exeption
import java.util.* // importing all the java util class
import org.bukkit.Bukkit // import all the other class
import org.bukkit.Material // import all the material
import org.bukkit.event.EventHandler // import the event handler
import org.bukkit.event.Listener // import all the listener
import org.bukkit.event.block.Action // import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent // import the action related to the player
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Zero // import zero

class PlateHandler(plugin: Zero?, main: JavaPlugin) : Listener { // the implements for the listener
    val mainPlugin = main
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the plugin
    }

    @EventHandler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.PHYSICAL) { // check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE
            ) { // compare what the player sept on to a stone pressure plate and is required a
                // non-nullable
                val p = ev.player // create the local player id
                val fileName = "Server.txt" // creating the file name var
                val actualFile = File(fileName) // creating the file
                var Serv = 0 // creating the actual data var
                try { // trying the code
                    if (actualFile.exists() && actualFile.isFile
                    ) { // checking if actual file is a file
                        try {
                            val reader = Scanner(actualFile) // creating the scanner
                            val data = reader.nextLine() // reading the first line
                            Serv = data.toInt() // converting the data to an int
                            reader.close() // closing the reader
                        } catch (e: IOException) { // catching the exeption
                            throw RuntimeException(e) // trowing the exeption
                        }
                    }
                } catch (e: IOException) { // catching the exeption
                    throw RuntimeException(e) // trowing it again
                }
                if (Serv == 0) {

                    val connect = ByteStreams.newDataOutput()
                    connect.writeUTF("Connect")
                    connect.writeUTF("lobby")
                    p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                }
                if (Serv == 2) {

                    val connect = ByteStreams.newDataOutput()
                    connect.writeUTF("Connect")
                    connect.writeUTF("main")
                    p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                }
            }
        }
    }
}
