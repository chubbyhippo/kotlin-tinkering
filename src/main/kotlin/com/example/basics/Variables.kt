package com.example.basics

import com.example.functions.topLevelFunction

fun main() {
    val name = "Hippo"
    println("name = $name")

    var age = 99
    println("age = $age")
    age = 55
    println("age = $age")

    val salary = 55555L
    println("salary = $salary")

    println("name = ${name.length}")

    val multiline = """
        a
        b
        c
    """.trimIndent()

    println(multiline)
    println(num)
    println(name)

}

val num = topLevelFunction()
val name = com.example.functions.name
