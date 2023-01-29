package trashpixl.trashpixl.handler // the package for this project

import java.io.File // importing the file class
import java.io.IOException // importing the ioexception class
import java.util.* // importing all java utils
import org.bukkit.Bukkit // importing bukkit
import org.bukkit.entity.Player // importing the info about the player
import org.bukkit.event.EventHandler // importing the event handler
import org.bukkit.event.Listener // importing all the event listener
import org.bukkit.event.entity.EntityDamageByEntityEvent // importing both damage event
import org.bukkit.event.entity.EntityDamageEvent
import trashpixl.trashpixl.Zero // importing zero

class Punch(plugin: Zero?) : Listener { // the implements for the listener
    init { // the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) // init the handler
    }
    @EventHandler // say that it is an event handler
    fun pressurePlateHandler(ev: EntityDamageByEntityEvent) { // describes what the event is
        val fileName2 = "Server.txt" // creating the file name var
        val actualFile2 = File(fileName2) // creating the file
        var serv = 0 // creating the actual data var
        try { // trying the code
            if (actualFile2.exists() && actualFile2.isFile) { // checking if actual file is a file
                try {
                    val reader2 = Scanner(actualFile2) // creating the scanner
                    val data2 = reader2.nextLine() // reading the first line
                    serv = data2.toInt() // converting the data to an int
                    reader2.close() // closing the reader
                } catch (e: IOException) { // catching the exception
                    throw RuntimeException(e) // trowing the exception
                }
            }
        } catch (e: IOException) { // catching the exception
            throw RuntimeException(e) // trowing it again
        }
        if (serv == 1) {
            val fileName = "Minigame.txt" // define the file name
            val actualFile = File(fileName) // create the file reference
            var actualdata = 0 // create the var to store the data of the file
            try { // trying the following code
                if (actualFile.exists() && actualFile.isFile) { // check if the file exist
                    try { // try the following code
                        val reader = Scanner(actualFile) // create the reader
                        val data = reader.nextLine() // read the first line of the file
                        actualdata = data.toInt() // convert the data to int
                        reader.close() // closing the reader
                    } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // throwing it
                    }
                }
            } catch (e: IOException) { // catching it
                throw RuntimeException(e) // throwing it in the trash because no one read it anyway
            }
            if (actualdata == 6) { // check if the data equal 6
                if (ev.entity is Player) {
                    if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK ||
                                    ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK
                    ) { // check if the damage is caused by an entity attack or sweep attack
                        (ev.entity as Player).health = 20.0 // set the player health to 20
                    }
                    if (ev.cause == EntityDamageEvent.DamageCause.VOID
                    ) { // check if the damage is caused by the void
                        (ev.entity as Player).health = 0.0 // set the player health to 0
                    }
                }
            }
            if (actualdata == 10) {
                if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK ||
                                ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK
                ) {
                    ev.entity.velocity = ev.entity.location.direction.multiply(2)
                }
            }
        }
    }
}
