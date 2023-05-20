package trashpixl.trashpixl.handler//the package for this project

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import trashpixl.trashpixl.Trashpixl
import trashpixl.trashpixl.runnable.Variable
import trashpixl.trashpixl.runnable.os
import trashpixl.trashpixl.runnable.put

class Quit(plugin: Trashpixl?) : Listener {//the implements for the listener
init {//the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!)//linking it to the main code
}

    @EventHandler//says that this is an event handler
    fun onPlayerQuit(ev: PlayerQuitEvent) {//execute when a player quit the server


        if (Bukkit.getOnlinePlayers().isEmpty() && Variable.activeMinigame) {//check if the player count is 0
            Variable.activeMinigame = false//set the active minigame to false
            put(os(), 0)
        }

    }
}