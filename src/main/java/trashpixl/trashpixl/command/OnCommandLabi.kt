package trashpixl.trashpixl.command //link the package to the code

import org.bukkit.Bukkit.getServer //import the get server class
import org.bukkit.Location //import the location to get the player world
import org.bukkit.World //get the world lib
import org.bukkit.command.Command //to send a command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender //import this to get the player
import trashpixl.trashpixl.runnable.minigameFile
import trashpixl.trashpixl.runnable.put

class OnCommandLabi : CommandExecutor { //creating the class death and implementing the listener


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 284.5 //the x coord of the game
        val y = -60.0 //the y coord of the game
        val z = 284.5 //the z coord of the game

        for (p in getServer().onlinePlayers) {
            //println(p.name)


            p.health = 20.0
            val w: World = p.world
            val to = Location(w, x, y, z) //move before for
            p.teleport(to)
            p.inventory.clear()

        }


        put(minigameFile, 4)
        return false

    }
}