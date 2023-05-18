package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import trashpixl.trashpixl.runnable.Variable
import kotlin.random.Random

class OnCommandTag : CommandExecutor { //creating the class death and implementing the listener

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val x = 355.0//the x coord of the game
        val y = -58.0 //the y coord of the game
        val z = 339.0 //the z coord of the game
        for (p in Bukkit.getServer().onlinePlayers) { //get all the player in the server
            p.health = 20.0 //set the health to 20
            val w: World = p.world //get the player world
            val to = Location(w, x, y, z) //put together all the info
            p.teleport(to) //tp him
            p.inventory.clear() //clear his inventory
        }
        Variable.tag = getRandomPlayer()//get a random player
        Variable.tag?.sendMessage("your are the tag")//send to message to indicate that the player is the tag
        return false
    }
    private fun getRandomPlayer(): Player? {//a function that return a random player in the server
        val players = mutableListOf<Player>()//create a list of player
        for (player in Bukkit.getOnlinePlayers()) {//get all the player in the server
            players.add(player)//add the player to the list
        }
        return if (players.isNotEmpty()) {//if the list is not empty
            players[Random.nextInt(players.size)]//return a random player
        } else {//if the list is empty
            null
        }
    }
}