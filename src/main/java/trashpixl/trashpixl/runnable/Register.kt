package trashpixl.trashpixl.runnable

import java.io.File
import java.io.FileWriter
import java.io.IOException

//defining the class package


    fun put(file: File, data: Int){
    //function to send packet to database
        try { // trying the following code
            if (file.exists() && file.isFile) { // checking if the file exist
                val myWriter: FileWriter // create the file writer
                try { // trying the following code
                    myWriter = FileWriter(file) // pointing the writer to the actual file
                    myWriter.write(data) // writing the data to the file
                    myWriter.close() // closing the writer
                } catch (e: IOException) { // catching the exception
                    throw java.lang.RuntimeException(e) // trowing it
                }
            }
        } catch (e: IOException) { // catching it...
            throw java.lang.RuntimeException(e) // throwing it the hardest we can, be gone exception you have no friend
        }
    }

