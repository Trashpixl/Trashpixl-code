package trashpixl.trashpixl.runnable

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World

fun removeTntStartBlock() {
    val xBlock = 0.0
    val yBlock = 0.0
    val zBlock = 0.0
    var w: World
    if (Variable.tntIsPlaced) {
        for (x in 0..12) {
            for (y in 0..12) {
                for (z in 0..12) {
                    // place a bedrock block
                    w = Bukkit.getServer().getWorld("world")!!
                    val placeToPutTheBlock = Location(w, xBlock + x, yBlock + y, zBlock + z)
                    w.getBlockAt(placeToPutTheBlock).type = Material.AIR
                }
            }
        }
        Variable.tntIsPlaced = false // set the tnt is placed to false
    }
}
