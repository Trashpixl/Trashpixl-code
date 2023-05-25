package trashpixl.trashpixl.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import trashpixl.trashpixl.runnable.Variable
import java.time.LocalTime

class OnCommandButton4 : CommandExecutor { //creating the class death and implementing the listener

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 187.0//the x coord of the game
        val y = -58.0//the y coord of the game
        val z = 261.0//the z coord of the game
        for (p in getServer().onlinePlayers) { //get all the player in the server
            p.health = 20.0//set the health to 20
            val w: World = p.world//get the player world
            val to = Location(w, x, y, z)//put together all the info
            p.teleport(to)//tp him
            p.inventory.clear()//clear his inventory
        }

        Variable.playerArray = mutableListOf()//clear the array

        for (player in getServer().onlinePlayers) {//get all the player in the server
            Variable.playerArray!!.add(player.name)//add the player name to the array
        }

        Variable.playerArray!!.sort()//sort the array
        Variable.time = LocalTime.now()//set the time
        Variable.playerArrayNumber = 0//set the player number to 0
        for (p in getServer().onlinePlayers) {//get all the player in the server

            if (p.name == Variable.playerArray?.get(Variable.playerArrayNumber)) {//if the player name is the same of the array
                p.sendMessage("you start the round click the button one time")//send the message
            }
        }
        return false
    }
}