package trashpixl.trashpixl.runnable//  package of the file

import org.bukkit.Bukkit.getLogger//import the logger
import org.bukkit.Bukkit.getServer//import the server
import java.time.LocalTime//import the time

fun timer() {//function that run every tick
        if (Variable.time != null &&
        LocalTime.now() >= Variable.time?.plusSeconds(10) &&
        environment() == 1 &&
        minigame() == 10) {//check if time is up and the server is 1 and the minigame is 10
                val p = Variable.playerArray?.get(Variable.playerArrayNumber)//get the player from the array
                for (player in getServer().onlinePlayers) {//go trough all player in the server
                    if (player.name == p) {//check if player name equals the current player from the array
                        player.health = 0.0//kill him
                }
            }
        }
    }
