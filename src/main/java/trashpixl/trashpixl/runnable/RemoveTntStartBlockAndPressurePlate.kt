package trashpixl.trashpixl.runnable

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World

fun removeTntStartBlockAndPressurePlate() {
    val xBlockTnt = -38.0
    val yBlockTnt = -38.0
    val zBlockTnt = -40.0
    var w: World
    if (Variable.tntIsPlaced) {
        for (x in 0..10) {
            for (y in 0..10) {
                for (z in 0..10) {
                    // place a bedrock block
                    w = Bukkit.getServer().getWorld("world")!!
                    val placeToPutTheBlock = Location(w, xBlockTnt + x, yBlockTnt + y, zBlockTnt + z)
                    w.getBlockAt(placeToPutTheBlock).type = Material.AIR
                }
            }
        }
        Variable.tntIsPlaced = false // set the tnt is placed to false
        val xBlockPlate = -33.0
        val yBlockPlate = -49.0
        val zBlockPlate = -32.0
        for (x in 0..3){
            for(z in 0..3){
                w = Bukkit.getServer().getWorld("world")!!
                val placeToPutTheBlock = Location(w, xBlockPlate + x, yBlockPlate, zBlockPlate - z)
                w.getBlockAt(placeToPutTheBlock).type = Material.AIR
            }
        }
        Variable.PressurePlateIsPlaced = false
    }
}
