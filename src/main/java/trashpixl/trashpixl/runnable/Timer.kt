package trashpixl.trashpixl.runnable//  package of the file

import org.bukkit.Bukkit.getLogger//import the logger
import org.bukkit.Bukkit.getServer//import the server
import java.time.LocalTime//import the time

fun timer() {//function that run every tick
    if (Variable.time != null) {//check if the time is not null
        if (LocalTime.now() >= Variable.time?.plusSeconds(10) && environment() == 1 && minigame() == 10) {//check if time is up and the server is 1 and the minigame is 10
            // getLogger().severe("time is up")
            //Variable.time = null
            if (Variable.playerArray?.size!! <= Variable.playerArrayNumber) {//check if it went trough all player in the array
                Variable.playerArrayNumber = 0//reset the array count
                //getLogger().warning("reset")
            } else {
                val p = Variable.playerArray?.get(Variable.playerArrayNumber)//get the player from the array
                //getLogger().warning("continue")

                for (player in getServer().onlinePlayers) {//go trough all player in the server
                    getLogger().warning("scanning")//log that it is scanning
                    if (player.name == p) {//check if player name equals the current player from the array
                        player.health = 0.0//if it equal it kill it
                        // getLogger().warning("found")
                    }
                }
            }
        }
    } else {
        //  getLogger().severe("time is null")
    }


}