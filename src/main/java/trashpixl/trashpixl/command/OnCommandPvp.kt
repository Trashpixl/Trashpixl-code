package trashpixl.trashpixl.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack




class OnCommandPvp : CommandExecutor { //creating the class death and implementing the listener

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val x = 239.0//the x coord of the game
        val y = -58.0//the y coord of the game
        val z = 279.0//the z coord of the game
        for (p in getServer().onlinePlayers) {//get all the player in the server
            p.health = 20.0//set the health to 20
            val w: World = p.world//get the player world
            val to = Location(w, x, y, z)//put together all the info
            val sword = ItemStack(Material.IRON_SWORD, 1)//create the sword
            p.teleport(to)//tp him
            p.inventory.clear()//clear his inventory
            p.inventory.setItemInMainHand(sword)//give him the sword
        }
        return false
    }
}