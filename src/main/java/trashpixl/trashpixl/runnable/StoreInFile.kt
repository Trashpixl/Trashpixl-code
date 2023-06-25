package trashpixl.trashpixl.runnable

import java.io.File
import java.io.FileWriter
import java.io.IOException



fun put(file: File, data: Int) {
    //function to send packet to database
    try {//trying the following code
        if (file.exists() && file.isFile) {//checking if the file exist

            val myWriter: FileWriter//create the file writer
            try {//trying the following code
                myWriter = FileWriter(file)//pointing the writer to the actual file
                myWriter.write(data.toString())//writing the data to the file
                myWriter.close()//closing the writer
            } catch (e: IOException) {//catching the exception
                throw java.lang.RuntimeException(e)//throwing the exception
            }
        }
    } catch (e: IOException) {//catching it...
        throw java.lang.RuntimeException(e)//throwing it the hardest we can, be gone exception no one like you anyways
    }
}

