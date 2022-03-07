package com.example.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(
        1,
        "Webflux Course",
        "Hippo"
    )

    val course2 = Course(
        1,
        "Webflux Course",
        "Hippo"
    )

    println(course)
    println(course == course2)
}
