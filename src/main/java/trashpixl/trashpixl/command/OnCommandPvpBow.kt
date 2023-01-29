package zero.zero.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.lang.RuntimeException

 //the package for this project



class OnCommandPvpBow : CommandExecutor { //creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val fileName = "Minigame.txt"
        val actualFile = File(fileName)
        val x = 239.0
        val y = -58.0
        val z = 279.0


        for (p in getServer().onlinePlayers) {
          
            p.health = 20.0

            val w: World = p.world
            val to = Location(w, x, y, z) //move before for
            val item1 = ItemStack(Material.BOW, 1)
            val item2 = ItemStack(Material.ARROW, 64)
            p.teleport(to)
            p.inventory.clear()
            p.inventory.setItemInMainHand(item1)
            p.inventory.setItem(2, item2)

            
            
        }
        try{
            if(actualFile.exists() && actualFile.isFile){
                val dataToWrite = "1"
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