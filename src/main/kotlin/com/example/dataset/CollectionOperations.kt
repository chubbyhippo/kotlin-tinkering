package com.example.dataset

fun main() {
    val courseList = courseList()

    exploreFilter(courseList)
}

fun exploreFilter(courseList: MutableList<Course>) {
    courseList.filter { it.category == CourseCategory.DEVELOPMENT }
        .forEach { println("developmentCourses : $it") }
}
