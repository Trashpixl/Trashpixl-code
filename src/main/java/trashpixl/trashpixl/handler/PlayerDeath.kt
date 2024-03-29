package trashpixl.trashpixl.handler // define the package

import SendPlayerBetweenServer
import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.entity.Entity
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.getMinigame
import trashpixl.trashpixl.runnable.stopTheGame

class PlayerDeath(plugin: Trashpixl?, main: JavaPlugin) : Listener {
    // creating the class death and implementing the listener
    private val mainPlugin = main

    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // register the event
    }

    @EventHandler // says that this is an event handler
    fun onPlayerDead(ev: PlayerRespawnEvent) {

        var playerCount = 0 // create the player count var

        if (getMinigame() in 1..7 || getMinigame() in 9..10 || getMinigame() == 14 || getMinigame() in (17..18)
        ) { // check if the data that we found correspond to the one require to start the handler
            val name: String = ev.player.name // name variable to store the player name
            if (Variable.serverType == 1) { // check if we are in the server 1
                for (p in getServer().onlinePlayers) { // getting all the player in the server
                    playerCount++ // add one to the player count
                    p.sendMessage(
                            "$name  died an is now out of the game"
                    ) // send the message of who won the match
                }
                if (Bukkit.getOnlinePlayers().size == 1) { // check if the player count equals zero
                    for (p in getServer().onlinePlayers) { // get all player in the server
                        if (p.name != ev.player.name
                        ) { // check if the player name equal the actual event creator name
                            p.sendMessage(
                                    "congratulation you won the match"
                            ) // send the win message

                            SendPlayerBetweenServer(
                                    "lobby",
                                    p,
                                    mainPlugin
                            ) // send the player to the location
                        } else {
                            p.sendMessage("how did you kill yourself") // send the death message
                        }
                    }
                    stopTheGame()
                }
                SendPlayerBetweenServer(
                        "lobby",
                        ev.player,
                        mainPlugin
                ) // send the player to the location
            }
        }
        if (getMinigame() == 15 && getMinigame() == 13) {
            if (Variable.serverType == 1) { // check if we are in the server 1
                SendPlayerBetweenServer(
                    "lobby",
                    ev.player,
                    mainPlugin
                ) // send the player to the location
            }
            playerCount = 0 // reset the player count
            for (p in getServer().onlinePlayers) { // getting all the player in the server
                playerCount++ // add one to the player count
            }
            if (playerCount <= 2) {
                for (p in getServer().onlinePlayers) { // getting all the player in the server
                    p.chat("congratulation you won the match") // send the win message
                    SendPlayerBetweenServer(
                        "lobby",
                        p,
                        mainPlugin
                    ) // send the player to the location
                    stopTheGame()
                }
            }
        }

            if (getMinigame() == 8){//add this so if they fight they wont respawn
                SendPlayerBetweenServer(
                    "lobby",
                   ev.player,
                    mainPlugin
                ) // send the player to the location
            }
            if (getMinigame() in 11..12){
                SendPlayerBetweenServer(
                    "lobby",
                    ev.player,
                    mainPlugin
                ) // send the player to the location
                if (getServer().onlinePlayers.size == 1){
                    for (p in getServer().onlinePlayers) { // getting all the player in the server
                       p.health = 0.0
                    }
                }
                if (getServer().onlinePlayers.isEmpty()) {
                    Variable.tag = null
                    Variable.finder = null
                    stopTheGame()
                }
            }
        if(getMinigame() == 16){
            if((ev.player as Entity).lastDamageCause!!.cause == EntityDamageEvent.DamageCause.VOID){//todo check if that work
                ev.player.chat("You won this game!")
            }
            if((ev.player as Entity).lastDamageCause!!.cause == EntityDamageEvent.DamageCause.FALL){//todo check if that work
                ev.player.chat("You didn't make it!")
            }
            SendPlayerBetweenServer(
                "lobby",
                ev.player,
                mainPlugin
            ) // send the player to the location
            if (getServer().onlinePlayers.isEmpty()) {
                stopTheGame()
            }
        }
        }
    }

