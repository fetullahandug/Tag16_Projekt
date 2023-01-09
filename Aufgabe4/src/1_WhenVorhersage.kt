fun main() {
    val birthyear: Int = 2011

    when (birthyear) {
        2010 -> println("Kind ist in Gruppe A")
        2011 -> println("Kind ist in Gruppe B")
        2012 -> println("Kind ist in Gruppe C")
        2013 -> println("Kind ist in Gruppe D")
        2014 -> println("Kind ist in Gruppe E")
        else -> println("Für dieses Geburtsjahr gibt es keine Gruppe")
    }
}

/*
    Es wird ausgegeben: "Kind ist in Grubbe B"
    2013: "Kind ist in Grubbe D"
    1995: "Für dieses Geburtsjahr gibt es keine Gruppe"
*/