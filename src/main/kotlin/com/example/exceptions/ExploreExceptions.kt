package com.example.exceptions

fun main() {
    println(nameLength("Hippo"))
    println(nameLength(null))
}

fun nameLength(name: String?): Int? = try {
    name!!.length
} catch (ex: Exception) {
    println("ex = $ex")
    null
}