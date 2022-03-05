package functions

fun main() {
    printName("Hippo")
    val result: Int = addition(1, 2)
    println("result = $result")
}

fun addition(x: Int, y: Int) = x + y

fun printName(s: String) {
    println(s)
}
