package trashpixl.trashpixl.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.lang.RuntimeException


 //the package for this project


class OnCommandTnt : CommandExecutor { //creating the class death and implementing the listener



    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val fileName = "Minigame.txt" //create a var with the filename in it
        val actualFile = File(fileName) //create the file reference

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
        try{
            if(actualFile.exists() && actualFile.isFile){ //check if the file exist
                val dataToWrite = "1" //create the var with the data to write in it 
                val myWriter: FileWriter //create the file writer
                try { //try the following code
                    myWriter = FileWriter(actualFile) //pointing the writer to the actual file
                    myWriter.write(dataToWrite) //writing the data to the file
                    myWriter.close() //closing the writer
                } catch (e: IOException) { //catch the ioexception
                    throw RuntimeException(e) //trow it in the console
                }
            }
        }
        catch(e: IOException){ //catch the exception
            throw RuntimeException(e) //and trow it in the console
        }




            return false

    }
}