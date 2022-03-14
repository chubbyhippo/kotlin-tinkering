package com.example.cast

import com.example.classes.Course

fun main() {
    val course = Course(
        1,
        "Hippo study",
        "Hippo"
    )

    checkType(course)
    checkType("HIPPO")

    castNumber(1.0)
    castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    println("numberDouble = $numberDouble")
}

fun castNumber(any: Any) {
    when (any) {
        any as Double -> println("Value is Double")
    }
}

fun checkType(type: Any) {
    when (type) {
        is Course -> {
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }
    }
}
