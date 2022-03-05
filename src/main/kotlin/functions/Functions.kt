package functions

import java.time.LocalDate

fun main() {
    printName("Hippo")
    val result: Int = addition(1, 2)
    println("result = $result")
    printPersonDetails(name = "Hippo")
}

fun addition(x: Int, y: Int) = x + y

fun printName(s: String) {
    println(s)
}

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
    println("name = $name")
    println("email = $email")
    println("dob = $dob")
}
