package trashpixl.trashpixl.runnable

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World

fun anvilSpawner(){
    if(getMinigame() == 17){
        val x = 0.0
        val y = 0.0
        val z = 0.0
        val world = Bukkit.getWorld("world")
        val location = Location(world, x + (0..20).random(), y, z + (0..20).random())
        
        location.block.type = Material.DAMAGED_ANVIL// set the block to anvil
    }
}
