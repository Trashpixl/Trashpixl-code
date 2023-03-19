package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams//import byte stream
import org.bukkit.Bukkit//import bukkit
import org.bukkit.Material//import material
import org.bukkit.event.EventHandler//import the handler
import org.bukkit.event.Listener//import the listener
import org.bukkit.event.block.Action//import the block action
import org.bukkit.event.player.PlayerInteractEvent//import the player interact event
import org.bukkit.plugin.java.JavaPlugin//import java plugin
import trashpixl.trashpixl.Trashpixl//import the main class
import trashpixl.trashpixl.runnable.environment//import some runnable
import trashpixl.trashpixl.runnable.os
import trashpixl.trashpixl.runnable.put

class Launcher(plugin: Trashpixl?, main: JavaPlugin) : Listener { // creating the class and extending it with the main class and implement the listener

    private var mainPlugin = main//copy main to main plugin

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the handler
    }

    @EventHandler // define that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical
            if (environment() == 2) {//check if environment equals 2
                if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA) { // compare what the player sept on to white terracotta and is required a
                    // non-nullable
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                    put(os(), 1)//put 1 in the minigame file

                    // Bukkit.dispatchCommand(p, "onCommandPvp") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA) { // if the block is orange terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }

                    put(os(), 2)//put 2 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpSumo") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA) { // check if the block is magenta terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }

                    put(os(), 3)//put 3 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpBow") //dispatchCommand for parkour

                }

                if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA) { // check if the block is light blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }

                    put(os(), 4)//put 4 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpLoot") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA) { // check if the block is yellow terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                  put(os(), 5)//put 5 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandBridge") //dispatchCommand for bridge
                }

                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA) { // check if the block is lime terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                  put(os(), 6)//put 6 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandParkour") //dispatchCommand for parkour

                }
                if (ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA) { // check if the block is light gray terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                   put(os(), 7)//put 7 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpKnockBack") //dispatchCommand for pvp
                    // knock back

                }
                if (ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA) { // check if the block is blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                   put(os(), 8)//put 8 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandCpsTest") //dispatchCommand for parkour

                }
                if (ev.clickedBlock!!.type == Material.BLACK_CONCRETE) { // check if the block is black concrete
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                   put(os(), 9)//put 9 in the minigame file
                }
                // Bukkit.dispatchCommand(p, "onCommandTnt") //dispatchCommand for tnt race
                if (ev.clickedBlock!!.type == Material.GRAY_TERRACOTTA) { // check if the block is black concrete
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                    put(os(), 10)//put 10 in the minigame file
                }
                if (ev.clickedBlock!!.type == Material.RED_TERRACOTTA) { // check if the block is black concrete TODO change the object
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                    put(os(), 11)//put 11 in the minigame file
                }
                if (ev.clickedBlock!!.type == Material.CYAN_TERRACOTTA) { // check if the block is black concrete TODO change the object
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()//create the new data stream
                        connect.writeUTF("Connect")//send the connects packet
                        connect.writeUTF("mini")//send the mini packet
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())//connect the player
                    }
                    put(os(), 12)//put 11 in the minigame file
                }

            }
        }
    }
}
