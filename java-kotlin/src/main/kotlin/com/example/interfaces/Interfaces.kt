package com.example.interfaces

import com.example.classes.Course

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("course = $course")
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course = Course(
        id,
        "Hippo sql study",
        "Hippo"
    )

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course = Course(
        id,
        "Hippo nosql study",
        "Hippo"
    )

    override fun save(course: Course): Int {
        isCoursePersisted = true
        println("Course in NoSqlCourseRepository : $course")
        return course.id
    }

}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("sqlCourseRepository = $course")
    val courseId = sqlCourseRepository.save(
        Course(
            3, "New Hippo sql",
            "Hippo"
        )
    )
    println("courseId = $courseId")
    println(sqlCourseRepository.isCoursePersisted)

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(2)
    println("course1 = $course1")
    val courseId1 = noSqlCourseRepository.save(
        Course(
            4, "new Hippo nosql",
            "Hippo"
        )
    )
    println("courseId1 = $courseId1")

    val ab = AB()
    ab.doSomething()
}
