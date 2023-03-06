package trashpixl.trashpixl.handler // the package for this project

import com.google.common.io.ByteStreams
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.os
import trashpixl.trashpixl.runnable.put

class Launcher(plugin: Trashpixl?, main: JavaPlugin) : Listener { // creating the class and extending it with the main class and implement the listener

    private var mainPlugin = main

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the handler
    }

    @EventHandler // define that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical
            if (environment() == 2) {
                if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA) { // compare what the player sept on to white terracotta and is required a
                    // non-nullable
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    put(os(), 1)

                    // Bukkit.dispatchCommand(p, "onCommandPvp") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA) { // if the block is orange terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(os(), 2)
                    // Bukkit.dispatchCommand(p, "onCommandPvpSumo") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA) { // check if the block is magenta terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(os(), 3)
                    // Bukkit.dispatchCommand(p, "onCommandPvpBow") //dispatchCommand for parkour

                }

                if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA) { // check if the block is light blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(os(), 4)
                    // Bukkit.dispatchCommand(p, "onCommandPvpLoot") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA) { // check if the block is yellow terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                  put(os(), 5)
                    // Bukkit.dispatchCommand(p, "onCommandBridge") //dispatchCommand for bridge
                }

                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA) { // check if the block is lime terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                  put(os(), 6)
                    // Bukkit.dispatchCommand(p, "onCommandParkour") //dispatchCommand for parkour

                }
                if (ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA) { // check if the block is light gray terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(os(), 7)
                    // Bukkit.dispatchCommand(p, "onCommandPvpKnockBack") //dispatchCommand for pvp
                    // knock back

                }
                if (ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA) { // check if the block is blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(os(), 8)
                    // Bukkit.dispatchCommand(p, "onCommandCpsTest") //dispatchCommand for parkour

                }
                if (ev.clickedBlock!!.type == Material.BLACK_CONCRETE) { // check if the block is black concrete
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(os(), 9)
                }
                // Bukkit.dispatchCommand(p, "onCommandTnt") //dispatchCommand for tnt race
                if (ev.clickedBlock!!.type == Material.GRAY_TERRACOTTA) { // check if the block is black concrete
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    put(os(), 10)
                }

            }
        }
    }
}
