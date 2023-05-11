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
        var playerCount = 0
        for (p in Bukkit.getServer().onlinePlayers) { //get all the player in the server
            playerCount++
            p.health = 20.0 //set the health to 20
            val w: World = p.world //get the player world
            //put the player in the blue team if it pair and red if odd
            if(playerCount % 2 == 0){
                val to = Location(w, xB, yB, zB) //put together all the info
                p.teleport(to) //tp him
                //add player to a list of blue team
                Variable.blueTeam?.add(p.name)

            }else{
                val to = Location(w, xR, yR, zR) //put together all the info
                p.teleport(to) //tp him
                //add player to a list of red team
                Variable.redTeam?.add(p.name)
            }
            p.inventory.clear() //clear his inventory
            //give the player snowball
            val item = ItemStack(Material.SNOWBALL, 64)
            p.setItemOnCursor(item)
        }
        return false
    }
}