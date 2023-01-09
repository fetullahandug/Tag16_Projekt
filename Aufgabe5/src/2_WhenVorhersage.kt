fun main() {
    val nationality: String = "japanese"

    when (nationality) {
        "german" -> println("Nationalität: Deutsch")
        "italian" -> println("Nationalität: Italienisch")
        "japanese" -> println("Nationalität: Japanisch")
        "namibian" -> println("Nationalität: Namibisch")
        "brazilian" -> println("Nationalität: Brasilianisch")
        else -> println("Nationalität nicht in Datenbank")
    }
}

/*
    Es wird ausgegeben was ich gedacht hatte
    Bei dem Wert "canadian" wird der Wert in der Liste nicht gefunden und "Nationalität nicht in Datenbank" ausgegeben
*/