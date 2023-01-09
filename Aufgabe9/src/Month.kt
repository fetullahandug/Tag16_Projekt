fun main() {
    val month: Int = 1
    println(printMonth(14))
}

fun printMonth(month: Int): String{
    when(month){
        1 -> return "Januar"
        2 -> return "Februar"
        3 -> return "März"
        4 -> return "April"
        5 -> return "Mai"
        6 -> return "Juni"
        7 -> return "Juli"
        8 -> return "August"
        9 -> return "September"
        10 -> return "Oktober"
        11 -> return "November"
        12 -> return "Dezember"
    }
    return "Error"
}