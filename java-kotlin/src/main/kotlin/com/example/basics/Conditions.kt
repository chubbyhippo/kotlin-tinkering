package com.example.basics

import kotlin.random.Random

fun main() {
    val name = readln()
    val s = if (name.length == 4) {
        println("name = 4 chars")
        name
    } else {
        println("name != 4 chars")
        name
    }
    println(s)

    val medal = when (Random.nextInt(1, 4)) {
        1 -> {
            "GOLD"
        }
        2 -> {
            "SILVER"
        }
        3 -> {
            "BRONZE"
        }
        else -> {
            "NO MEDAL"
        }
    }

    println(medal)

}
