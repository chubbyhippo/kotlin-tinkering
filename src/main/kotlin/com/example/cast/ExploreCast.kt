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
