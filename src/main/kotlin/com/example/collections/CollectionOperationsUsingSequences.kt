package com.example.collections

fun main() {
    val namesListUsingSequence = listOf("Hippo", "Kangaroo", "Giraffe", "Lion")
        .asSequence()
        .filter { it.length >= 5 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence = $namesListUsingSequence")
}