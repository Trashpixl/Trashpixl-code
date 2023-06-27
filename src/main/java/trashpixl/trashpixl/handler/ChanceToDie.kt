package trashpixl.trashpixl.handler

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.environment
import trashpixl.trashpixl.runnable.getMinigame

class ChanceToDie (plugin: Trashpixl?) : Listener {//creating the class
init {//the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!)//register the event
}

    @EventHandler//say that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) {//describes what the event is
        val p = ev.player//creating the player variable
        if (ev.action == Action.RIGHT_CLICK_BLOCK) {//check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_BUTTON && environment() == 1) {//compare what the player pushed to the stone button
                if (getMinigame() == 10) {//check if the minigame is 10
                    if (p.name == Variable.playerArray?.get(Variable.playerArrayNumber)) {//check if the player is the one that is supposed to be playing
                        if ((1..10).random() == 1) {//check if the player is lucky
                            p.health = 0.0//if not kill the player
                        }
                        else{ if (Variable.playerArray!!.size >= Variable.playerArrayNumber) {//check if the player array number is smaller than the array
                            Variable.playerArrayNumber++//if it is add one to the array number
                        } else {
                            Variable.playerArrayNumber = 0//if not set the array number to 0
                        }
                            for (player in Bukkit.getServer().onlinePlayers) {//loop through all the players
                                if (player.name == Variable.playerArray?.get(Variable.playerArrayNumber)) {//check if the player is the one that is supposed to be playing
                                    player.chat("its your turn")//then tell the player that it is their turn

                                }
                            }
                        }


                    } else {
                        p.chat("its not your turn yet, its ${Variable.playerArray?.get(Variable.playerArrayNumber)} turn")//tell the player that it is not their turn
                    }
                }
            }
            }
        }
    }
