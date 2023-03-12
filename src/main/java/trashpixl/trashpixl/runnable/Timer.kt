package trashpixl.trashpixl.runnable

import org.bukkit.Bukkit
import java.time.LocalTime
fun timer(){

    if(LocalTime.now() >= Variable.time!!.plusSeconds(10)){
        //Variable.time = null
        val p = Variable.playerArray?.get(Variable.playerArrayNumber)
        for (player in Bukkit.getServer().onlinePlayers) {
            if(player.name == p){
                player.health = 0.0
            }
        }
    }

        if(Variable.time == null){
            Variable.time = LocalTime.now()
        }


}