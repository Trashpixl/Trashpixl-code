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
import trashpixl.trashpixl.runnable.minigameFile
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
                    put(minigameFile, 1)

                    // Bukkit.dispatchCommand(p, "onCommandPvp") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA) { // if the block is orange terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(minigameFile, 2)
                    // Bukkit.dispatchCommand(p, "onCommandPvpSumo") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA) { // check if the block is magenta terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(minigameFile, 3)
                    // Bukkit.dispatchCommand(p, "onCommandPvpBow") //dispatchCommand for parkour

                }

                if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA) { // check if the block is light blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(minigameFile, 4)
                    // Bukkit.dispatchCommand(p, "onCommandPvpLoot") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA) { // check if the block is yellow terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                  put(minigameFile, 5)
                    // Bukkit.dispatchCommand(p, "onCommandBridge") //dispatchCommand for bridge
                }

                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA) { // check if the block is lime terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                  put(minigameFile, 6)
                    // Bukkit.dispatchCommand(p, "onCommandParkour") //dispatchCommand for parkour

                } /*
                  if (ev.clickedBlock!!.type == Material.PINK_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandCaptureFlag") //dispatchCommand for capture flag
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.GRAY_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandDontDie") //dispatchCommand for don't die
                      }
                  }
                  */
                if (ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA) { // check if the block is light gray terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(minigameFile, 7)
                    // Bukkit.dispatchCommand(p, "onCommandPvpKnockBack") //dispatchCommand for pvp
                    // knock back

                } /*
                  if (ev.clickedBlock!!.type == Material.CYAN_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandChaiseMusical") //dispatchCommand for chaise musical
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.PURPLE_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandClimbFast") //dispatchCommand for climb fast
                      }
                  }
                  */
                if (ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA) { // check if the block is blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(minigameFile, 8)
                    // Bukkit.dispatchCommand(p, "onCommandCpsTest") //dispatchCommand for parkour

                } /*
                  if (ev.clickedBlock!!.type == Material.BROWN_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandDodgeBall") //dispatch command for dodge ball
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.GREEN_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandElytraRace") //dispatchCommand for elytra race
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.RED_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandFallTrap") //dispatchCommand for fall trap
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.BLACK_TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandFindMe") //dispatchCommand for findMe
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.TERRACOTTA) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandFiretrap") //dispatchCommand for firetrap
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                         //Bukkit.dispatchCommand(p, "onCommandHideAndSeek") //dispatchCommand for hide and seek
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandHorseRace") //dispatchCommand for horse race
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandMlg") //dispatchCommand for mlg
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandRockPaperScissor") //dispatchCommand for rock paper scissor
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                         //Bukkit.dispatchCommand(p, "onCommandSkyWars") //dispatchCommand for SkyWars
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandSwimFast") //dispatchCommand for swim fast
                      }
                  }
                  if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                      if (p.location.world.name.endsWith("lobby_server")) {
                          p.sendMessage("not available yet")
                          //Bukkit.dispatchCommand(p, "onCommandTag") //dispatchCommand for tag
                      }
                  }
                  */
                if (ev.clickedBlock!!.type == Material.BLACK_CONCRETE) { // check if the block is black concrete
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(minigameFile, 9)
                }
                // Bukkit.dispatchCommand(p, "onCommandTnt") //dispatchCommand for tnt race

            }
        }
    }
}
