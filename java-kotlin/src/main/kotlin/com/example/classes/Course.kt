@file:JvmName("CourseUtils")

package com.example.classes

import com.example.CourseJava

data class Course @JvmOverloads constructor(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
) {
    @JvmField
    var noOfCourses = 10

    companion object {
        @JvmStatic
        fun printInCompanion(name: String = "default") {
            println("name : $name")
        }
    }
}

enum class CourseCategory {
    DEVELOPMENT,
    DESIGN,
    MARKETING

}

@JvmName("print")
@JvmOverloads
fun printName(name: String = "default") {
    println("name: $name")
}

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

    val course3 = Course(
        3,
        "Marketing",
        "Marketing Hippo",
        CourseCategory.MARKETING
    )

    println("course3 = $course3")

    val courseJava = CourseJava(
        3,
        "Marketing",
        "Marketing Hippo"
    )

    println("course java = $courseJava")
    courseJava.id = 99
    println("course java = $courseJava")

}
