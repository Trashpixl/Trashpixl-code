package trashpixl.trashpixl.handler//the package for this project

import org.bukkit.Bukkit//importing bukkit
import org.bukkit.event.EventHandler//importing the event handler
import org.bukkit.event.Listener//importing all the event listener
import org.bukkit.event.player.PlayerQuitEvent//importing the player quit event
import trashpixl.trashpixl.Trashpixl//importing the main class
import trashpixl.trashpixl.runnable.Variable//importing the variable class

class Quit (plugin: Trashpixl?) : Listener {//the implements for the listener
    init {//the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//linking it to the main code
    }

    @EventHandler//says that this is an event handler
    fun onPlayerQuit(ev: PlayerQuitEvent) {//execute when a player quit the server


        if(Bukkit.getOnlinePlayers().isEmpty()){//check if the player count is 0
          Variable.activeMinigame = false//set the active minigame to false
           }

    }
}