package trashpixl.trashpixl // the package of this project

// import zero.zero.command.store.* //import all the class in store
// import zero.zero.handler.shop.* //import all the handler related to store
import java.io.File // importing java file class for writing the file
import java.io.FileWriter // importing the file writer
import java.io.IOException // importing the io exception class
import java.util.* // importing all the java util class
import org.bukkit.plugin.java.JavaPlugin
import trashpixl.trashpixl.command.* // importing all the command
import trashpixl.trashpixl.handler.* // importing all the handler
import trashpixl.trashpixl.runnable.environment

class Trashpixl : JavaPlugin() {
        // creating the main class
        override fun onEnable() { // plugin startup logic
                server.messenger.registerOutgoingPluginChannel(
                                this,
                                "BungeeCord"
                ) // register the chanel
                // getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord")
                // //register the chanel
                val fileName = "Minigame.txt" // creating the file name variable
                val actualFile = File(fileName) // creating the file variable
                // val fileName2 = "Store.txt"
                // val actualFile2 = File(fileName2)
                //logger.info("good jar ") // say that it's starting the plugin
                LauncherJoin(this) // init the launcher
                Death(this, this) // init the death handler
                RaceTimer(this) // init the race timer handler
                Loot(this) // init the loot handler
                // SellHandlerInventory(this) //init the sell handler
                PlateHandler(this, this) // init the plate handler
                WoodPlateHandler(this) // init the wood plate handler
                Laucher(this, this) // init the launcher handler
                FirstToFinish(this, this) // init the first to finish handler
                Punch(this) // init the punch handler

                if (environment() == 0) { // check if server equals 0
                }
                if (environment() == 1) { // check if server equal 1

                        this.getCommand("onCommandPvp")
                                        ?.setExecutor(
                                                        OnCommandPvp()
                                        ) // init the command for the pvp game
                        this.getCommand("onCommandTnt")
                                        ?.setExecutor(
                                                        OnCommandTnt()
                                        ) // init the command for capture the flag
                        this.getCommand("onCommandPvpBow")
                                        ?.setExecutor(
                                                        OnCommandPvpBow()
                                        ) // init the command for pvp bow
                        this.getCommand("onCommandPvpSumo")
                                        ?.setExecutor(
                                                        OnCommandPvpSumo()
                                        ) // init the command for pvp sumo
                        this.getCommand("onCommandDontDie")
                                        ?.setExecutor(
                                                        OnCommandDontDie()
                                        ) // init the command for pvp don't die
                        this.getCommand("onCommandPvpKnockBack")
                                        ?.setExecutor(
                                                        OnCommandPvpKnockBack()
                                        ) // init the command for pvp knock back
                        this.getCommand("onCommandPvpLoot")
                                        ?.setExecutor(
                                                        OnCommandPvpLoot()
                                        ) // init the command for pvp loot
                        this.getCommand("onCommandParkour")
                                        ?.setExecutor(
                                                        OnCommandParkour()
                                        ) // init the command for the parkour
                        this.getCommand("onCommandChaiseMusical")
                                        ?.setExecutor(
                                                        OnCommandChaiseMusical()
                                        ) // init the command for chaise musical
                        this.getCommand("onCommandClimbFast")
                                        ?.setExecutor(
                                                        OnCommandClimbFast()
                                        ) // init the command for climb fast
                        this.getCommand("onCommandCpsTest")
                                        ?.setExecutor(
                                                        OnCommandCpsTest()
                                        ) // init the command for cps test
                        this.getCommand("onCommandDodgeBall")
                                        ?.setExecutor(
                                                        OnCommandDodgeBall()
                                        ) // init the command doe the dodge-ball
                        this.getCommand("onCommandElytraRace")
                                        ?.setExecutor(
                                                        OnCommandElytraRace()
                                        ) // init the command for the elytra race
                        this.getCommand("onCommandFallTrap")
                                        ?.setExecutor(
                                                        OnCommandFallTrap()
                                        ) // init the command for fall trap
                        this.getCommand("onCommandFindMe")
                                        ?.setExecutor(
                                                        OnCommandFindMe()
                                        ) // init the command for find me
                        this.getCommand("onCommandFireTrap")
                                        ?.setExecutor(
                                                        OnCommandFireTrap()
                                        ) // init the command for the firetrap
                        this.getCommand("onCommandHideAndSeek")
                                        ?.setExecutor(
                                                        OnCommandHideAndSeek()
                                        ) // init the command for hide and seek
                        this.getCommand("onCommandHorseRace")
                                        ?.setExecutor(
                                                        OnCommandHorseRace()
                                        ) // init tha command for the horse race
                        this.getCommand("onCommandMlg")
                                        ?.setExecutor(
                                                        OnCommandMlg()
                                        ) // init the command for the mlg race
                        this.getCommand("onCommandRockPaperCisor")
                                        ?.setExecutor(
                                                        OnCommandRockPaperCisor()
                                        ) // init the command for rock paper scissor
                        this.getCommand("onCommandSkywars")
                                        ?.setExecutor(
                                                        OnCommandSkywars()
                                        ) // init the command for sky-wars
                        this.getCommand("onCommandSwimFast")
                                        ?.setExecutor(
                                                        OnCommandSwimFast()
                                        ) // init the command for swimming race
                        this.getCommand("onCommandTag")
                                        ?.setExecutor(
                                                        OnCommandTag()
                                        ) // init the command for the tag
                        this.getCommand("onCommandBridgeRace")
                                        ?.setExecutor(
                                                        OnCommandBridgeRace()
                                        ) // init the command for the tag
                        this.getCommand("onCommandLabi")
                                        ?.setExecutor(
                                                        OnCommandLabi()
                                        ) // init the command for the tag
                }
                try { // trying the following code
                        if (actualFile.exists() && actualFile.isFile) { // check if the file exist
                        } else {
                                if (actualFile.createNewFile()) { // creating the new file
                                        val dataToWrite = "0" // creating the data to write var
                                        val myWriter: FileWriter // create the file writer
                                        try { // trying the following code
                                                myWriter =
                                                                FileWriter(
                                                                                actualFile
                                                                ) // pointing the writer to the
                                                // actual file
                                                myWriter.write(
                                                                dataToWrite
                                                ) // writing the data to the file
                                                myWriter.close() // closing the writer
                                        } catch (e: IOException) { // catching the exeption
                                                throw RuntimeException(e) // throwing it the hardest we can, so it won't come back
                                        }
                                }
                        }
                } catch (e: IOException) { // catching the exception
                        throw RuntimeException(e) // create the actual error message
                }
                /*try { //trying the following code
                    if (actualFile2.exists() && actualFile2.isFile) { //check if the file exist
                    } else {
                        if (actualFile2.createNewFile()) { //creating the new file
                            val dataToWrite2 = "0" //creating the data to write var
                            val myWriter2: FileWriter //create the file writer
                            try { //trying the following code
                                myWriter2 = FileWriter(actualFile2) //pointing the writer to the actual file
                                myWriter2.write(dataToWrite2) //writing the data to the file
                                myWriter2.close() //closing the writer
                            } catch (e: IOException) { //catching the exception
                                throw RuntimeException(e) //throwing it the hardest we can, so it won't come back
                            }
                        } else {
                            println("something went wrong while creating the file") //says that something went from while creating the file
                        }
                    }
                } catch (e: IOException) { //catching the exception
                    throw RuntimeException(e) //create the actual error message
                }*/

        }
        override fun onDisable() {
                // Plugin shutdown logic
                this.server.messenger.unregisterOutgoingPluginChannel(this) // unregister the chanel
                this.server.messenger.unregisterIncomingPluginChannel(this) // unregister the chanel
        }
}
