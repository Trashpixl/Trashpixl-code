package trashpixl.trashpixl.runnable

import java.time.LocalTime
fun timer(){
    val currentTime:LocalTime = LocalTime.now()

    if(currentTime >= Variable.time!!.plusSeconds(10)){
        Variable.time = null
    }

        if(Variable.time == null){

        }


}