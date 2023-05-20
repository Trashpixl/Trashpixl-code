package trashpixl.trashpixl.command

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack
import trashpixl.trashpixl.runnable.Variable

class OnCommandDodgeBall : CommandExecutor { //creating the class death and implementing the listener

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        //coord for the game
        val xR = 0.0//todo add real coord
        val yR = 0.0
        val zR = 0.0
        val xB = 0.0//todo add real coord
        val yB = 0.0
        val zB = 0.0
        var playerCount = 0 //count the number of player
        for (p in Bukkit.getServer().onlinePlayers) { //get all the player in the server
            playerCount++//add 1 to the player count
            p.health = 20.0 //set the health to 20
            val w: World = p.world //get the player world
            //put the player in the blue team if it pair and red if odd
            if(playerCount % 2 == 0){//if the player is pair
                val to = Location(w, xB, yB, zB) //put together all the info
                p.teleport(to) //tp him
                Variable.blueTeam?.add(p.name)//add player to a list of the blue team's member

            }else{
                val to = Location(w, xR, yR, zR) //put together all the info
                p.teleport(to) //tp him
                Variable.redTeam?.add(p.name)//add player to a list of red team
            }
            p.inventory.clear() //clear his inventory
            val snowball = ItemStack(Material.SNOWBALL, 64)//create 64 snowball
            p.setItemOnCursor(snowball)//give him the snowball
        }
        return false
    }
}