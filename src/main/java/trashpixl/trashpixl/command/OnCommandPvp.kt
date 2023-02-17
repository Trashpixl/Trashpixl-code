package trashpixl.trashpixl.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack
import trashpixl.trashpixl.runnable.minigameFile
import trashpixl.trashpixl.runnable.put

//the package for this project



class OnCommandPvp : CommandExecutor { //creating the class death and implementing the listener






    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 239.0
        val y = -58.0
        val z = 279.0

        for (p in getServer().onlinePlayers) {
            
            p.health = 20.0
            val w: World = p.world
            val to = Location(w, x, y, z) //move before for
            val item = ItemStack(Material.IRON_SWORD, 1)
            p.teleport(to)
            p.inventory.clear()
            p.inventory.setItemInMainHand(item)
            

        }

        put(minigameFile, 1)
        return false

    }
}