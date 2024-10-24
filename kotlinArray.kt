package com.example.myapplication

import kotlin.math.sin

// kotlin array 10.10.2024

fun main() {
    val newArray= arrayOf(1,2,3,4,5)
    newArray.forEach {
       // println(it)
    }
    println(newArray[3])
    newArray.set(3,44)
    println(newArray[3])
    println(newArray.get(3))

    val fruits= arrayListOf<String>()
    fruits.add("elma")
    fruits.add("armut")
    println(fruits[0])
    fruits.add("ananas")
    fruits.forEach {
        println(it)
    }

    fruits.remove("armut")
    fruits.forEach {
        println(it)
    }

    println("-----set-----")
    val fruitSet= setOf("kivi","ananas","kivi","ananas","muz","muz")
    println(fruitSet.elementAt(2))
    println(fruitSet.size)

    println("-----map-----")
    // anahtar değer eşleşmesi key-value

    val sinifMevcut= hashMapOf<String,Int>()
    sinifMevcut.put("9a",20)
    sinifMevcut.put("9b",25)
    sinifMevcut.put("9c",23)

    println(sinifMevcut["9a"])
    println(sinifMevcut.get("9a"))
    println(sinifMevcut)
}