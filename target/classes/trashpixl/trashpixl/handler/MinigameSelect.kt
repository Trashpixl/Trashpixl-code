package trashpixl.trashpixl.handler

import SendPlayerBetweenServer
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.os
import trashpixl.trashpixl.runnable.put

class MinigameSelect(plugin: Trashpixl?, main: JavaPlugin) :
        Listener { // creating the class and extending it with the main class and implement the
    // listener

    private var mainPlugin = main // copy main to main plugin

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }

    @EventHandler // define that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical
            if (Variable.serverType == 2) { // check if environment equals 2
                if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA
                ) { // compare what the player sept on to white terracotta and is required a
                    sendPlayerTogGame(Variable.numberOfPlayerPvp)
                    put(os(), 1) // put 1 in the minigame file

                    // Bukkit.dispatchCommand(p, "onCommandPvp") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA
                ) { // if the block is orange terracotta
                    sendPlayerTogGame(Variable.numberOfPlayerPvpSumo)
                    put(os(), 2) // put 2 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpSumo") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA
                ) { // check if the block is magenta terracotta
                    sendPlayerTogGame(Variable.numberOfPlayerPvpBow)
                    put(os(), 3) // put 3 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpBow") //dispatchCommand for parkour

                }

                if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA
                ) { // check if the block is light blue terracotta
                    sendPlayerTogGame(Variable.numberOfPlayerPvpLoot)
                    put(os(), 4) // put 4 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpLoot") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA
                ) { // check if the block is yellow terracotta
                    sendPlayerTogGame(Variable.numberOfPlayerBridgeRace)
                    put(os(), 5) // put 5 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandBridge") //dispatchCommand for bridge
                }

                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA
                ) { // check if the block is lime terracotta
                    sendPlayerTogGame(Variable.numberOfPlayerParkour)
                    put(os(), 6) // put 6 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandParkour") //dispatchCommand for parkour

                }
                if (ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA
                ) { // check if the block is light gray terracotta
                    sendPlayerTogGame(Variable.numberOfPlayerPvpKnockBack)
                    put(os(), 7) // put 7 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandPvpKnockBack") //dispatchCommand for pvp

                }
                if (ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA
                ) { // check if the block is blue terracotta
                    sendPlayerTogGame(Variable.numberOfPlayerLabi)
                    put(os(), 8) // put 8 in the minigame file
                    // Bukkit.dispatchCommand(p, "onCommandCpsTest") //dispatchCommand for parkour

                }
                if (ev.clickedBlock!!.type == Material.BLACK_CONCRETE
                ) { // check if the block is black concrete
                    sendPlayerTogGame(Variable.numberOfPlayerTnt)
                    put(os(), 9) // put 9 in the minigame file
                }
                // Bukkit.dispatchCommand(p, "onCommandTnt") //dispatchCommand for tnt race
                if (ev.clickedBlock!!.type == Material.GRAY_TERRACOTTA
                ) { // check if the block is black concrete
                    sendPlayerTogGame(Variable.numberOfPlayerButton4)
                    put(os(), 10) // put 10 in the minigame file
                }
                if (ev.clickedBlock!!.type == Material.RED_TERRACOTTA
                ) { // check if the block is black concrete
                    sendPlayerTogGame(Variable.numberOfPlayerHideAndSeek)
                    put(os(), 11) // put 11 in the minigame file
                }
                if (ev.clickedBlock!!.type == Material.CYAN_TERRACOTTA
                ) { // check if the block is black concrete
                    sendPlayerTogGame(Variable.numberOfPlayerTag)
                    put(os(), 12) // put 12 in the minigame file
                }
                if (ev.clickedBlock!!.type == Material.PURPLE_TERRACOTTA
                ) { // todo check for the block
                    sendPlayerTogGame(Variable.numberOfPlayerSearchAndFind)
                    put(os(), 13) // put 13 in the minigame file
                }
                if (ev.clickedBlock!!.type == Material.BROWN_TERRACOTTA) {
                    sendPlayerTogGame(Variable.numberOfPlayerDodgeBall)
                    put(os(), 14) // put 14 in the minigame file
                }
                if (ev.clickedBlock!!.type == Material.OBSIDIAN) { // todo check for the block
                    sendPlayerTogGame(Variable.numberOfPlayerCamelFight)
                    put(os(), 15) // put 15 in the minigame file
                }
            }
        }
    }
    fun sendPlayerTogGame(numberOfPlayersRequired: Int) { // todo find why it send only one player

        var playerSent = 0
        for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
            p2.sendMessage(numberOfPlayersRequired.toString()) // send the message to all the player
            if (playerSent == 2) {
                break
            }

            SendPlayerBetweenServer("mini", p2, mainPlugin) // send the player to the location
            playerSent++
        }
    }
}
