package trashpixl.trashpixl.runnable //  package of the file

import java.time.LocalTime
import org.bukkit.Bukkit.getServer

fun timer() { // function that run every tick
    if (Variable.time != null && LocalTime.now() >= Variable.time?.plusSeconds(10) && Variable.serverType == 1 && getMinigame() == 10) { // check if time is up and the server is 1 and the minigame is 10
        val p = Variable.playerArray?.get(Variable.playerArrayNumber) // get the player from the array
        for (player in getServer().onlinePlayers) { // go trough all player in the server
            if (player.name == p) { // check if player name equals the current player from the array
                player.health = 0.0 // kill him
            }
        }
        Variable.playerArray?.removeAt(Variable.playerArrayNumber)
        //Variable.playerArrayNumber = 0
        Variable.time = LocalTime.now()
        for (player in getServer().onlinePlayers) {
            if (player.name == Variable.playerArray?.get(Variable.playerArrayNumber)) {
                player.chat("its your turn")
            }
        }
    }

    if(Variable.time != null && LocalTime.now() >= Variable.time?.plusSeconds(25) && Variable.serverType == 1 && getMinigame() == 12){
        for (player in getServer().onlinePlayers) {
            if(player == Variable.tag){
                player.chat("You were not fast enough!")
            }
            else{
                player.chat("You won!")
            }
            player.health = 0.0
            Variable.time = LocalTime.now()
            //stopTheGame()
        }
    }
    if(Variable.time != null && LocalTime.now() >= Variable.time?.plusSeconds(25) && Variable.serverType == 1 && getMinigame() == 11){
        for (player in getServer().onlinePlayers) {
            if(player == Variable.finder){
                player.chat("You were not fast enough!")
            }
            else{
                player.chat("You won!")
            }
            player.health = 0.0
            Variable.time = LocalTime.now()
            //stopTheGame()
          
        }
    }
}
