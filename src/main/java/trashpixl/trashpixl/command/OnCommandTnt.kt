package trashpixl.trashpixl.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.minigameFile
import trashpixl.trashpixl.runnable.put


//the package for this project


class OnCommandTnt : CommandExecutor { //creating the class death and implementing the listener


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {



        val x = 247.0
        val y = -58.0
        val z = 250.0

        for (p in getServer().onlinePlayers) { //get all the player in the server
                p.health = 20.0 //set the health to 20
                val w: World = p.world //get the player world
                val to = Location(w, x, y, z) //put together all the info
                p.teleport(to) //tp him
                p.inventory.clear() //clear his inventory
        }
      put(minigameFile, 1)


            return false

    }
}