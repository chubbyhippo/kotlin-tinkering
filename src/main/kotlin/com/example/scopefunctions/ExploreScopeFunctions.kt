package com.example.scopefunctions

import com.example.classes.Course
import com.example.classes.CourseCategory

fun main() {

    exploreApply()

}

fun exploreApply() {
    val course = Course(
        1,
        "Learning Hippo",
        "Hippo"
    ).apply {
        courseCategory = CourseCategory.DESIGN
    }

    println("course = $course")
}
