package trashpixl.trashpixl.runnable

import org.bukkit.Bukkit


fun lineOfSight(){
    if(minigame() == 11) {
        Bukkit.getOnlinePlayers().forEach { player ->
            if (player != Variable.finder && Variable.finder!!.hasLineOfSight(player) && !Variable.isBlindFinder) {
                player.health = 0.0
            }
        }

    }
}