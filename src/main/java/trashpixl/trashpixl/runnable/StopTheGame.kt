package trashpixl.trashpixl.runnable

fun stopTheGame(){
    if(Variable.serverType == 1){
        put(os(), 0)
        Variable.activeMinigame = false
    }
}