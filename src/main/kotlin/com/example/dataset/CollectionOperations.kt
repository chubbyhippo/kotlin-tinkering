package com.example.dataset

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }

    exploreFilter(courseList, devPredicate)
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    courseList
//        .filter { it.category == CourseCategory.DEVELOPMENT }
//        .filter(predicate)
        .filter { predicate.invoke(it) }
        .forEach { println("developmentCourses : $it") }
}
