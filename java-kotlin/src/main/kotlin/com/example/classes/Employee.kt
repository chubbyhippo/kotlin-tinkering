package com.example.classes

data class Employee(
    val id: Int,
    val name: String
)

fun main() {
    val firstEmployee = Employee(1, "Hippo")
    println(firstEmployee)
    val secondEmployee = Employee(1, "Hippo")
    println(firstEmployee == secondEmployee)
    val thirdEmployee = firstEmployee.copy(id = 2, name = "Kangaroo")
    println(thirdEmployee)
    println(secondEmployee == thirdEmployee)

}
