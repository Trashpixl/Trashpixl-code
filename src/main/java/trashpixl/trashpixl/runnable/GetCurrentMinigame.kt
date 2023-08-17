package trashpixl.trashpixl.runnable

import java.io.IOException
import java.util.*

fun getMinigame(): Int { // check which type of minigame we are in
    var minigameData = 0 // store temporally the server type
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

    return minigameData // return the minigame data
}
