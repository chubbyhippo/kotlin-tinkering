package com.example.classes

class Person(
    val name: String = "",
    val age: Int = 20
) {
    fun action() {
        println("Hippo walks")
    }
}

fun main() {
    val person = Person("Hippo", 99)
    person.action()
    println(
        """
        Name: ${person.name}
        Age: ${person.age}
    """.trimIndent()
    )
}