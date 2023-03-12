package trashpixl.trashpixl.runnable

import org.bukkit.Bukkit.getLogger
import org.bukkit.Bukkit.getServer
import java.time.LocalTime

fun timer(){
    if(Variable.time != null) {
        if (LocalTime.now() >= Variable.time?.plusSeconds(10) && environment() == 1 && minigame() == 10) {
           // getLogger().severe("time is up")
            //Variable.time = null
            if(Variable.playerArray?.size!! <= Variable.playerArrayNumber){
                Variable.playerArrayNumber = 0
                //getLogger().warning("reset")
            }
            else{
            val p = Variable.playerArray?.get(Variable.playerArrayNumber)
                //getLogger().warning("continue")

            for (player in getServer().onlinePlayers) {
                getLogger().warning("scanning")
                if (player.name == p) {
                    player.health = 0.0
                   // getLogger().warning("found")
                }
            }
            }
        }
    }
    else{
      //  getLogger().severe("time is null")
    }




}