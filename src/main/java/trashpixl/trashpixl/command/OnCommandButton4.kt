package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable
import java.time.LocalTime

class OnCommandButton4: CommandExecutor { //creating the class death and implementing the listener

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 187.0
        val y = -58.0
        val z = 261.0
        for (p in Bukkit.getServer().onlinePlayers) { //get all the player in the server
            p.health = 20.0 //set the health to 20
            val w: World = p.world //get the player world
            val to = Location(w, x, y, z) //put together all the info
            p.teleport(to) //tp him
            p.inventory.clear() //clear his inventory
        }
        Variable.time = LocalTime.now()
        return false
    }
}