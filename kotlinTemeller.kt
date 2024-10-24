package com.example.myapplication

fun main() {
    // değişken ve sabit tanımlama
    // var ile değişken tanımlama
    // değişkenin değeri değişecek ise var ile tanımlanır
    var age = 13
    var city = "Burhaniye"

    println(age)
    println(city)

    age = 15
    city = "Ayvalık"

    println(age)
    println(city)

    // değişkenin değeri aynı kalacaksa val ile tanımlanır
    val school = "MTAL"
    println(school)

    val e = 2.7182818284

    val name = "Ayşe"
    val surName = "Fatma"
    println(name.plus(surName))

    surName.forEach {
        println(it)
    }

    val yeniDeger: String
    yeniDeger = "elma"

    val ageString = "16"
    val newAge = ageString.toInt()
    println(newAge)

}