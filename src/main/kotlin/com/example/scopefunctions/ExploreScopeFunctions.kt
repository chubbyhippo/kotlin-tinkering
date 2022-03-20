package com.example.scopefunctions

import com.example.classes.Course
import com.example.classes.CourseCategory

fun main() {

    exploreApply()
    exploreAlso()
    exploreLet()

}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = numbers
        .map { it * 2 }
        .filter { it > 5 }
        .let {
            println("it = $it")
            it.sum()
        }
    println("result = $result")

    var name:String? = null
    name = "Hippo"

    val result1 = name?.let {
        println("it = $it")
        it.uppercase()
    }
    println("result1 = $result1")
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

fun exploreAlso() {
    Course(
        1,
        "Learning Hippo",
        "Hippo"
    ).apply {
        courseCategory = CourseCategory.DESIGN
    }.also {
        println("it = $it")
    }

}