package trashpixl.trashpixl.runnable//package of the file

import java.io.File//import the file
import java.io.IOException//import the io exception
import java.util.*//import the util


const val minigameFileNameWindows = "C:\\Users\\thier\\Desktop\\testServer\\Minigame.txt" //create a var with the filename in it
val minigameFileWindows = File(minigameFileNameWindows) //create the file reference
const val minigameFileNameLinux = "C:\\Users\\thier\\Desktop\\testServer\\Minigame.txt" //create a var with the filename in it
val minigameFileLinux = File(minigameFileNameLinux) //create the file reference
const val serverFileName = "Server.txt" //create a var with the filename in it
val serverFile = File(serverFileName) //create the file reference
const val minigameFileNameNull = "" //create a var with the filename in it
val minigameFileNull = File(minigameFileNameNull) //create the file reference


fun environment(): Int {//check which type of server we are in
    var serverType = 0//store temporally the server type
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
    return serverType
}

fun minigame(): Int {
    var minigameData = 0
    try { // trying the code
        if (os().exists() && os().isFile) { // checking if actual file is a file
            try {
                val reader = Scanner(os()) // creating the scanner
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
fun os(): File {
    if (System.getProperty("os.name") == "Windows 11") {
        return minigameFileWindows
    }
    return if (System.getProperty("os.name") == "Linux") {
        minigameFileLinux
    } else{
        minigameFileNull
    }
}







