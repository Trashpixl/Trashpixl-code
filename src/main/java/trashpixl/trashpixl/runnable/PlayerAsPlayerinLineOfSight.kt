package trashpixl.trashpixl.runnable // package of the file

import org.bukkit.Bukkit // import the bukkit

fun lineOfSight() {
    if (getMinigame() == 11) { // check if the ongoing minigame is the 11
        Bukkit.getOnlinePlayers().forEach { player -> // run this for each player for ever
            if (player != Variable.finder &&
                            Variable.finder!!.hasLineOfSight(player) &&
                            !Variable.isBlindFinder
            ) { // check if itd id not the finder check if the finder see him and if the finder is
                // blind
                player.health = 0.0 // set player health to zero
            }
        }
    }
}
