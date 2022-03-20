package com.example.collections

import com.example.dataset.Course
import com.example.dataset.CourseCategory
import com.example.dataset.courseList

fun main() {
    val namesListUsingSequence = listOf("Hippo", "Kangaroo", "Giraffe", "Lion")
        .asSequence()
        .filter { it.length >= 5 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence = $namesListUsingSequence")

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }

    exploreFilterUsingSequence(courseList(), devPredicate)

    val range = 1 .. 1_000_000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach{
            println("it = $it")
        }

}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, devPredicate: (Course) -> Boolean) {
    courseList
        .asSequence()
        .filter(devPredicate)
        .forEach {
            println("Courses = $it")
        }
}
