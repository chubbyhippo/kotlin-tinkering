package com.example.exceptions

fun main() {
    println(nameLength("Hippo"))
    println(nameLength(null))

    returnNothing()
}

fun nameLength(name: String?): Int? = try {
    name!!.length
} catch (ex: Exception) {
    println("ex = $ex")
    null
}

fun returnNothing(): Nothing {
    throw RuntimeException("Exception")
}