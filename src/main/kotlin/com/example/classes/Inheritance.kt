package com.example.classes

open class User(val name: String) {
    open var isLoggedIn = false
    open fun login() {
        println("$name is Logging in")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn = false
    override fun login() {
        println("Inside Student Login")
        super.login()
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Hippo")
    println("student.name = ${student.name}")
    student.login()
    student.isLoggedIn = true
    val instructor = Instructor("Hippopo")
    println("instructor.name = ${instructor.name}")
    instructor.login()
}

