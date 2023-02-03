package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams
import java.io.File // importing the java file var
import java.io.FileWriter // importing the file-writer
import java.io.IOException // importing the io exception
import java.util.* // importing all the java util class
import org.bukkit.Bukkit // importing bukkit
import org.bukkit.Material // importing the material library
import org.bukkit.event.EventHandler // importing the event handler class
import org.bukkit.event.Listener // importing the event listener class
import org.bukkit.event.block.Action // importing the block action class to get if they set on a
// block
import org.bukkit.event.player.PlayerInteractEvent // importing the player interact event to get if
// they click on something
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Zero // importing zero

class Laucher(plugin: Zero?, main: JavaPlugin) : Listener { // creating the class and extending it with the main class and implement the
    // listener
    // the implements for the listener
    private var mainPlugin = main
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the handler
    }

    @EventHandler // define that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical

            val fileName = "Server.txt" // creating the file name var
            val actualFile = File(fileName) // creating the file
            var serv = 0 // creating the actual data var
            try { // trying the code
                if (actualFile.exists() && actualFile.isFile) { // checking if actual file is a file
                    try {
                        val reader = Scanner(actualFile) // creating the scanner
                        val data = reader.nextLine() // reading the first line
                        serv = data.toInt() // converting the data to an int
                        reader.close() // closing the reader
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // trowing the exception
                    }
                }
            } catch (e: IOException) { // catching the exception
                throw RuntimeException(e) // trowing it again
            }
            if (serv == 2) {

                if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA
                ) { // compare what the player sept on to white terracotta and is required a
                    // non-nullable

                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "1" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }

                    // Bukkit.dispatchCommand(p, "oncommandpvp") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA
                ) { // if the block is orange terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "2" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                    // Bukkit.dispatchCommand(p, "oncommandpvpsumo") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA
                ) { // check if the block is magenta terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "3" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                    // Bukkit.dispatchCommand(p, "oncommandpvpbow") //dispatchCommand for parkour

                }

                if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA
                ) { // check if the block is light blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "4" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                    // Bukkit.dispatchCommand(p, "oncommandpvploot") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA
                ) { // check if the block is yellow terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "5" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                    // Bukkit.dispatchCommand(p, "oncommandbridge") //dispatchCommand for bridge
                }

                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA
                ) { // check if the block is lime terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "6" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                    // Bukkit.dispatchCommand(p, "oncommandparkour") //dispatchCommand for parkour

                } /*
                  if (ev.clickedBlock!!.type == Material.PINK_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandcaptureflag") //dispatchCommand for capture flag
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.GRAY_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommanddontdie") //dispatchCommand for don't die
                      }
                  }
                  */
                if (ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA
                ) { // check if the block is light gray terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "7" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                    // Bukkit.dispatchCommand(p, "oncommandpvpknockback") //dispatchCommand for pvp
                    // knock back

                } /*
                  if (ev.clickedBlock!!.type == Material.CYAN_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandchaismMusical") //dispatchCommand for chaise musical
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.PURPLE_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandclimbfast") //dispatchCommand for climb fast
                      }
                  }
                  */
                if (ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA
                ) { // check if the block is blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "8" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                    // Bukkit.dispatchCommand(p, "oncommandcpstest") //dispatchCommand for parkour

                } /*
                  if (ev.clickedBlock!!.type == Material.BROWN_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommanddodgeball") //dispatch command for dodge ball
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.GREEN_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandelytrarace") //dispatchCommand for elytra race
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.RED_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandfalltrap") //dispatchCommand for fall trap
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.BLACK_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandfindme") //dispatchCommand for findme
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandfiretrap") //dispatchCommand for firetrap
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                         //Bukkit.dispatchCommand(p, "oncommandhideandseek") //dispatchCommand for hide and seek
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandhorserace") //dispatchCommand for horse race
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandmlg") //dispatchCommand for mlg
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandrockpapercisor") //dispatchCommand for rock paper scissor
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                         //Bukkit.dispatchCommand(p, "oncommandskywars") //dispatchCommand for skywars
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandswimfast") //dispatchCommand for swim fast
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "oncommandtag") //dispatchCommand for tag
                      }
                  }
                  */
                if (ev.clickedBlock!!.type == Material.BLACK_CONCRETE
                ) { // check if the block is black concrete
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    val fileName2 = "S:\\Mini.txt" // creating the file name var
                    val actualFile2 = File(fileName2) // creating the file

                    try { // trying the code
                        if (actualFile2.exists() && actualFile2.isFile
                        ) { // checking if the file exist
                            val dataToWrite = "9" // creating the data to write var
                            val myWriter: FileWriter // create the file writer
                            try { // trying the code
                                myWriter =
                                        FileWriter(
                                                actualFile2
                                        ) // pointing the writer to the actual file
                                myWriter.write(dataToWrite) // writing the data to the file
                                myWriter.close() // closing the writer
                            } catch (e: IOException) { // catching the exception
                                throw RuntimeException(e) // trowing the exception
                            }
                        }
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing the exception
                    }
                }
                // Bukkit.dispatchCommand(p, "oncommandtnt") //dispatchCommand for tnt race

            }
        }
    }
}
