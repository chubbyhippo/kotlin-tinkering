package com.example.scopefunctions

import com.example.classes.Course
import com.example.classes.CourseCategory

fun main() {

    exploreApply()
    exploreAlso()
    exploreLet()
    exploreWith()
    exploreRun()

}

fun exploreRun() {
    var numbers: MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("result = $result")

    val length = run {
        val name = "Hippo"
        println("name = $name")
        name.length
    }

    println("length = $length")

}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4)
    val result = with(numbers) {
        println("size = $size")
        val list = this.plus(9)
            .plus(10)
        list.sum()
    }
    println("result = $result")

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

    val name: String?
    name = "Hippo"

    val result1 = name.let {
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