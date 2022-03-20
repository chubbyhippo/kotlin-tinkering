package com.example.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING

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


}
