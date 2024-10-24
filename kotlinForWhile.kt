package com.example.myapplication

fun main() {
    println("-----while döngüsü-----")
    var i=0
    while (i<5){
        println(i)
        i++
    }
    println("-----for döngüsü-----")
    val myNumberArray= arrayOf(5,10,15,20,25,30)
    for (i in myNumberArray){
        println("${i/5}")
    }

    for (i in 0..9){
        println("${i*3}")
    }

    myNumberArray.forEach {
        println(it)
    }
}