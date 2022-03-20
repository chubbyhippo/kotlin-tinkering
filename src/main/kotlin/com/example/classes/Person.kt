package com.example.classes

class Person(
    val name: String = "",
    val age: Int = 20
) {
    var email = ""
    var nameLength = 0

    init {
        println("Init")
        nameLength = name.length
    }

    constructor(email: String) : this() {
        this.email = email
    }

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

    val person2 = Person("hippo@gmail.com")
    println(
        """
        Name: ${person2.name}
        Age: ${person2.age}
        email: ${person2.email} 
        name length: ${person2.nameLength}
    """.trimIndent()
    )
}
