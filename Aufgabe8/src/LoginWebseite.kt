
fun main(){
    println(loginCheck(false, false, true))

}

fun loginCheck(userAccepted: Boolean, passwordOk: Boolean, connectionSecure: Boolean): String{
    if(!userAccepted) return "User denied"
    else if (userAccepted && !passwordOk) return "False password!"
    else if(userAccepted && passwordOk && !connectionSecure) return "Unsafe Connection"
    else if(userAccepted && passwordOk && connectionSecure) return "Ok"
    return "No Answer"
}

/*
    false, false, false     "User denied."
    true,  false, false     "False password."
    true,  true,  false     "Unsafe connection."
    true,  true,  true      "Ok."
*/