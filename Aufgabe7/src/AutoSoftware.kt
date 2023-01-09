fun main(){

    checkUpStartConditions(true,false)

}

fun start(){
    println("Software gestartet.")
}

fun closeDoors(){
    println("Bitte alle Türen schließen.")
}

fun checkUpStartConditions(isMotorRunning: Boolean, doorsAreClosed: Boolean){
    if(isMotorRunning && doorsAreClosed){
        start()
    }
    else if(isMotorRunning && !doorsAreClosed){
        closeDoors()
    }
}
