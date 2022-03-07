package com.example.classes

open class User(val name: String) {
    fun login() {
        println("$name is Logging in")
    }
}

class Student(name: String) : User(name)

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Hippo")
    println("student.name = ${student.name}")
    student.login()
    val instructor = Instructor("Hippopo")
    println("instructor.name = ${instructor.name}")
    instructor.login()
}

