package com.example.functions

const val name = "Hippo"

fun main() {
    val topLevelFunction = topLevelFunction()
    println("topLevelFunction = $topLevelFunction")
}

fun topLevelFunction(): Int {
    return (0..100).random()
}

