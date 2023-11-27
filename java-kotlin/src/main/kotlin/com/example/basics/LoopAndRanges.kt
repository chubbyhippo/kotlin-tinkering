package com.example.basics

fun main() {
    val range = 1..10
    for (i in range) {
        println("i = $i")
    }

    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("i = $i")
    }

    for (i in reverseRange step 2) {
        println("i = $i")
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    print("input: ")
    var x = readln().toInt()
    do {
        println("x = $x")
        x++

    } while (x < 100)
}

fun exploreWhile() {
    print("input: ")
    var x = readln().toInt()
    while (x < 100) {
        println("x = $x")
        x++
    }
}
