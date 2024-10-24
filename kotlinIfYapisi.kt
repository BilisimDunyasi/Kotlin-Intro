package com.example.myapplication

fun main() {
    println("-----if yapısı-----")

    val score = 40

    if (score < 20) {
        println("kaybettin")
    } else if (score >= 20 && score < 40) {
        println("kazandın")
    } else {
        println("harika")
    }

    println("-----when-----")

    val puan = 3
    when (puan) {
        0 -> println("geçersiz")
        1 -> println("başarısız")
        2 -> println("geçer")
        else -> println("geçersiz")
    }

}