package trashpixl.trashpixl.runnable

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World

fun placeTntPressurePlate() {
    val xBlockPlate = -33.0
    val yBlockPlate = -49.0
    val zBlockPlate = -32.0
    var w: World
    for (x in 0..3){
        for(z in 0..3){
            w = Bukkit.getServer().getWorld("world")!!
            val placeToPutTheBlock = Location(w, xBlockPlate + x, yBlockPlate, zBlockPlate - z)
            w.getBlockAt(placeToPutTheBlock).type = Material.OAK_PRESSURE_PLATE
        }
    }
    Variable.PressurePlateIsPlaced = true
}

