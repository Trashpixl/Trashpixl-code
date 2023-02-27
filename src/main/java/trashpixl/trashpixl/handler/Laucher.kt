package trashpixl.trashpixl.handler // the package for this project

// block
// they click on something
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

class Laucher(plugin: Trashpixl?, main: JavaPlugin) : Listener { // creating the class and extending it with the main class and implement the
    // listener
    // the implements for the listener
    private var mainPlugin = main

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the handler
    }

    @EventHandler // define that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { // describes what the event is
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { // check if the action is physical


            if (environment() == 2) {

                if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA
                ) { // compare what the player sept on to white terracotta and is required a
                    // non-nullable

                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                    put(minigameFile, 1)

                    // Bukkit.dispatchCommand(p, "oncommandpvp") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA) { // if the block is orange terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player

                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(minigameFile, 2)
                    // Bukkit.dispatchCommand(p, "oncommandpvpsumo") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA) { // check if the block is magenta terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(minigameFile, 3)
                    // Bukkit.dispatchCommand(p, "oncommandpvpbow") //dispatchCommand for parkour

                }

                if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA) { // check if the block is light blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }

                    put(minigameFile, 4)
                    // Bukkit.dispatchCommand(p, "oncommandpvploot") //dispatchCommand for parkour
                }

                if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA) { // check if the block is yellow terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                  put(minigameFile, 5)
                    // Bukkit.dispatchCommand(p, "oncommandbridge") //dispatchCommand for bridge
                }

                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA) { // check if the block is lime terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                  put(minigameFile, 6)
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
                if (ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA) { // check if the block is light gray terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(minigameFile, 7)
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
                if (ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA) { // check if the block is blue terracotta
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(minigameFile, 8)
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
                if (ev.clickedBlock!!.type == Material.BLACK_CONCRETE) { // check if the block is black concrete
                    for (p2 in Bukkit.getServer().onlinePlayers) { // taking all the player
                        val connect = ByteStreams.newDataOutput()
                        connect.writeUTF("Connect")
                        connect.writeUTF("mini")
                        p2.sendPluginMessage(mainPlugin, "BungeeCord", connect.toByteArray())
                    }
                   put(minigameFile, 9)
                }
                // Bukkit.dispatchCommand(p, "oncommandtnt") //dispatchCommand for tnt race

            }
        }
    }
}
