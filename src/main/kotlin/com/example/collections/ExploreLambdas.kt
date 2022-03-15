package com.example.collections

fun main() {
    val addLambda = { x: Int -> x + x }

    val addResult = addLambda(3)
    println("addResult = $addResult")

    val multiplyLambda = { x: Int, y: Int -> x * y }

    val multiplyResult = multiplyLambda(3, 4)
    println("multiplyResult = $multiplyResult")
}
