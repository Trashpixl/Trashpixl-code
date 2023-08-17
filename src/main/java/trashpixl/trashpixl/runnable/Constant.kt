package trashpixl.trashpixl.runnable // package of the file

import java.io.File // import the file
import java.io.IOException // import the io exception
import java.util.* // import the util

const val minigameFileNameWindows =
        "F:\\testServer\\Minigame.txt" // create a var with the filename in it
val minigameFileWindows = File(minigameFileNameWindows) // create the file reference
const val minigameFileNameLinux =
        "/home/server/Documents/server/Minigame.txt" // create a var with the filename in it
val minigameFileLinux = File(minigameFileNameLinux) // create the file reference
const val serverFileName = "Server.txt" // create a var with the filename in it
val serverFile = File(serverFileName) // create the file reference
const val minigameFileNameNull = "" // create a var with the filename in it
val minigameFileNull = File(minigameFileNameNull) // create the file reference

fun environment(): Int { // check which type of server we are in
    var serverType = 0 // store temporally the server type
    try { // trying the code
        if (serverFile.exists() && serverFile.isFile) { // checking if actual file is a file
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
    return serverType // return the server type
}

fun os(): File { // check which type of os we are in
    if (System.getProperty("os.name") == "Windows 11") { // check if we are in windows
        return minigameFileWindows // return the windows file
    }
    return if (System.getProperty("os.name") == "Linux") { // check if we are in linux
        minigameFileLinux // return the linux file
    } else {
        minigameFileNull // return the null file
    }
}
