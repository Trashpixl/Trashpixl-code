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
import trashpixl.trashpixl.runnable.copyGame

class OnCommandDodgeBall :
        CommandExecutor { // creating the class death and implementing the listener

    override fun onCommand(
            sender: CommandSender,
            command: Command,
            label: String,
            args: Array<out String>?
    ): Boolean {
        if (Bukkit.getServer().onlinePlayers.size == Variable.numberOfPlayerDodgeBall) {
            Variable.activeMinigame = true // set the activeMinigame to true
          
            val xR = -23.0 
            val yR = -60.0
            val zR = -10.0
            val xB = -23.0 
            val yB = -60.0
            val zB = -34.0
            var playerCount = 0 // count the number of player
            Variable.blueTeam?.clear() // clear the blue team
            Variable.redTeam?.clear() // clear the red team
            Variable.redTeam = mutableListOf()
            Variable.blueTeam = mutableListOf()
            copyGame("dodgeball") // copy the game
            for (p in Bukkit.getServer().onlinePlayers) { // get all the player in the server
                playerCount++ // add 1 to the player count
                p.health = 20.0 // set the health to 20
                val w: World = p.world // get the player world
                // put the player in the blue team if it pair and red if odd
                if (playerCount % 2 == 0) { // if the player is pair
                    val to = Location(w, xB, yB, zB) // put together all the info
                    p.teleport(to) // tp him
                    Variable.blueTeam!!.add(p.name) // add player to a list of the blue team's member
                } 
                if(playerCount % 2 == 1) {
                    val to = Location(w, xR, yR, zR) // put together all the info
                    p.teleport(to) // tp him
                    Variable.redTeam!!.add(p.name) // add player to a list of red team
                }
                p.inventory.clear() // clear his inventory
                val snowball = ItemStack(Material.SNOWBALL, 64) // create 64 snowball
                p.inventory.setItem(0, snowball) // give him the snowball
            }
            Variable.preventBreakedBlock = true // set the preventBreakedBlocks to true
            Variable.preventPlacedBlock = true // set the preventPlacedBlock to true
        }
        return true
    }
}
