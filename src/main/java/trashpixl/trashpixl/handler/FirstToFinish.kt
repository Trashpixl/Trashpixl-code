package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams
import java.io.File // importing java file class
import java.io.FileWriter // importing the file writer class
import java.io.IOException // importing the io exception class
import java.util.* // importing the java util class
import org.bukkit.Bukkit // import all the other class
import org.bukkit.Material // import all the material
import org.bukkit.event.EventHandler // import the event handler
import org.bukkit.event.Listener // import all the listener
import org.bukkit.event.block.Action // import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent // import the action related to the player
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Zero // importing the zero class

class FirstToFinish(plugin: Zero?, main: JavaPlugin) : Listener { // the implements for the listener
    private var mainPlugin = main
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // getting the plugin
    }
    @EventHandler // define that the following code is an event handler
    fun pressurePlateHandler(e: PlayerInteractEvent) { // describes what the event is
        if (e.action == Action.PHYSICAL) { // check if the action is physical
            if (e.clickedBlock!!.type == Material.WARPED_PRESSURE_PLATE
            ) { // compare what the player step on to a stone pressure plate and is required a
                // non-nullable
                val fileName = "Minigame.txt" // creating the file name
                val actualFile = File(fileName) // creating the file
                var actualdata = 0 // creating the var that hold the data of the file
                try { // trying the following code
                    if (actualFile.exists() && actualFile.isFile) { // checking if the file exist
                        try { // trying the following code
                            val reader = Scanner(actualFile) // creating the reader
                            val data = reader.nextLine() // reading the first line
                            actualdata = data.toInt() // converting the data to int
                            reader.close() // closing the reader
                        } catch (e: IOException) { // catching the exception
                            throw RuntimeException(
                                    e
                            ) // throwing it the hardest we can, so it won't come back for a long time
                        }
                    }
                } catch (e: IOException) { // catching the exception
                    throw RuntimeException(e) // throwing it
                }
                val p = e.player // create the local player id
                if (actualdata == 4 || actualdata == 5
                ) { // checking if the number in the file correspond to the number require to start
                    // the exception
                    val fileName2 = "Server.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file
                    var serv = 0 // creating the actual data var
                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if actual file is a file
                            try {
                                val reader2 = Scanner(actualFile2) // creating the scanner
                                val data2 = reader2.nextLine() // reading the first line
                                serv = data2.toInt() // converting the data to an int
                                reader2.close() // closing the reader
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // trowing it again
                    }
                    if (serv == 1) {
                        p.sendMessage(p.name + " won the race") // sending the won message
                        for (p2 in Bukkit.getServer().onlinePlayers) { // getting all online player
                            // wrong type of tp
                            val connect = ByteStreams.newDataOutput()
                            connect.writeUTF("Connect")
                            connect.writeUTF("lobby")
                            p.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                        }
                        try { // trying the following code
                            if (actualFile.exists() && actualFile.isFile
                            ) { // checking if the file exist
                                val dataToWrite = "0" // cretin g the var with the data to write
                                val myWriter: FileWriter // create the file writer
                                try { // trying the following code
                                    myWriter =
                                            FileWriter(
                                                    actualFile
                                            ) // pointing the writer to the actual file
                                    myWriter.write(dataToWrite) // writing the data to the file
                                    myWriter.close() // closing the writer
                                } catch (e: IOException) { // catching the exception
                                    throw java.lang.RuntimeException(e) // trowing it
                                }
                            }
                        } catch (e: IOException) { // catching it...
                            throw java.lang.RuntimeException(
                                    e
                            ) // throwing it the hardest we can, be gone exception you have no friend
                            // :)
                        }
                    }
                }
            }
        }
    }
}
