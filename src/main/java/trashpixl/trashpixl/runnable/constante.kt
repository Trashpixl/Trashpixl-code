package trashpixl.trashpixl.runnable

import java.io.File
import java.io.IOException
import java.util.*




    const val minigameFileName = "Minigame.txt" //create a var with the filename in it
    val minigameFile = File(minigameFileName) //create the file reference
    const val serverFileName = "Server.txt" //create a var with the filename in it
    val serverFile = File(serverFileName) //create the file reference
    fun environment(): Int {
        var serverType = 0
        try { // trying the code
            if (serverFile.exists() && serverFile.isFile
            ) { // checking if actual file is a file
                try {
                    val reader = Scanner(serverFile) // creating the scanner
                    serverType = reader.nextLine().toInt() // converting the data to an int
                    reader.close() // closing the reader
                } catch (e: IOException) { // catching the exception
                    throw RuntimeException(e) // trowing the exception
                }
            }
        } catch (e: IOException) { // catching the exception
            throw RuntimeException(e) // trowing it again
        }
        return serverType
    }
fun minigame(): Int {
    var minigameData = 0
    try { // trying the code
        if (minigameFile.exists() && minigameFile.isFile) { // checking if actual file is a file
            try {
                val reader = Scanner(minigameFile) // creating the scanner
                minigameData = reader.nextLine().toInt() // reading the first line
                reader.close() // closing the reader
            } catch (e: IOException) { // catching the exception
                throw RuntimeException(e) // trowing the exception
            }
        }
    } catch (e: IOException) { // catching the exception
        throw RuntimeException(e) // trowing it again
    }
    return minigameData
}




