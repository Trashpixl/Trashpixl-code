package trashpixl.trashpixl.handler // the package for this project

// the import for this project
import java.io.File // importing the java file var
import java.io.IOException // importing the io exception
import java.util.* // importing all the java util class
import org.bukkit.Bukkit // import bukkit for reference
import org.bukkit.Location // import the location class
import org.bukkit.Material // import all the bukkit material
import org.bukkit.event.EventHandler // import the event handler
import org.bukkit.event.Listener // import the listener class
import org.bukkit.event.block.Action // import all the action for block
import org.bukkit.event.player.PlayerInteractEvent // import the player event
import trashpixl.trashpixl.Zero // import zero

class WoodPlateHandler(plugin: Zero?) : Listener { // create the class and implement the listener

    init { // the constructor for the handler
        Bukkit.getPluginManager()
                .registerEvents(this, plugin!!) // says that this need the plugin base model
    }

    @EventHandler // define that the methode is an event handler
    fun pressurePlateHandler(
            ev: PlayerInteractEvent
    ) { // create the function with the argument the player event
        if (ev.action == Action.PHYSICAL
        ) { // check if the action is physical like step on or software like open the inventory
            if (ev.clickedBlock!!.type == Material.OAK_PRESSURE_PLATE
            ) { // compare the event to an oak pressure plate
                val p = ev.player // create the local variable player
                val fileName = "Server.txt" // creating the file name var
                val actualFile = File(fileName) // creating the file
                var serv = 0 // creating the actual data var
                try { // trying the code
                    if (actualFile.exists() && actualFile.isFile
                    ) { // checking if actual file is a file
                        try {
                            val reader = Scanner(actualFile) // creating the scanner
                            val data = reader.nextLine() // reading the first line
                            serv = data.toInt() // converting the data to an int
                            reader.close() // closing the reader
                        } catch (e: IOException) { // catching the exception
                            throw RuntimeException(e) // trowing the exception
                        }
                    }
                } catch (e: IOException) { // catching the exception
                    throw RuntimeException(e) // trowing it again
                }
                if (serv == 0) {
                    val to: Location = p.bedSpawnLocation!! // get his bed location

                    p.teleport(to) // tp him to his bed
                }
            }
        }
    }
}
