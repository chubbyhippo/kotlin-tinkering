package com.example.collections

fun main() {
    val addLambda = { x: Int -> x + x }

    val addResult = addLambda(3)
    println("addResult = $addResult")

    val multiplyLambda = { x: Int, y: Int ->
        println("x = [${x}], y = [${y}]")
        x * y
    }

    val multiplyResult = multiplyLambda(3, 4)
    println("multiplyResult = $multiplyResult")

    val calculate = calculate(2, 3) { x: Int, y: Int -> x * y }
    println("calculate = $calculate")


    val add = calculate(2, 3) { x: Int, y: Int -> x + y }
    println("add = $add")
}

fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    return op(x, y)
}
