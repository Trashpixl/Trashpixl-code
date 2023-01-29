package zero.zero.command //link the package to the code

import org.bukkit.Bukkit.getServer //import the getserver class
import org.bukkit.Location //import the location to get the player world
import org.bukkit.World //get the world libe
import org.bukkit.command.Command //to send a command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender //import this to get the player
import java.io.File //import that to link the file
import java.io.FileWriter //to write the file
import java.io.IOException //import ioexeption
import java.lang.RuntimeException //import the runtime exeption

class OnCommandLabi : CommandExecutor { //creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val fileName = "Minigame.txt" //create the file name val
        val actualFile = File(fileName) //create the file ref
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


        try{
            if(actualFile.exists() && actualFile.isFile){
                val dataToWrite = "4"
                val myWriter: FileWriter //create the file writer
                try {
                    myWriter = FileWriter(actualFile) //pointing the writer to the actual file
                    myWriter.write(dataToWrite) //writing the data to the file
                    myWriter.close() //closing the writer
                } catch (e: IOException) {
                    throw RuntimeException(e)
                }
            }
        }
        catch(e: IOException){
            throw RuntimeException(e)
        }

        return false

    }
}