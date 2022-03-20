package com.example.dataset

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }

    exploreFilter(courseList, devPredicate)

    exploreMap(courseList, devPredicate)

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    println(list)
    println(list.flatten())
    println(exploreFlatMap(courseList, KAFKA))

    exploreHashMap()
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Hippo" to 33, "Kangaroo" to 5)
    nameAgeMutableMap
        .forEach { (k, v) ->
            println("k = [${k}], v = [${v}]")
        }

    val value = nameAgeMutableMap["Hippo"]
    println("value = $value")

    val getOrElse = nameAgeMutableMap.getOrElse("Lion") { 3 }
    println("getOrElse = $getOrElse")

    val filteredMap = nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }

    println("filteredMap = $filteredMap")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    return courseList.flatMap { course: Course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }
}

fun exploreMap(courseList: MutableList<Course>, devPredicate: (Course) -> Boolean) {
    courseList
        .filter(devPredicate)
        .map {
            """
            ${it.name} - ${it.category}
        """.trimIndent()
        }.forEach {
            println(it)
        }

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
