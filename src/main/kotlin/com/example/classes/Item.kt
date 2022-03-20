package com.example.classes

class Item {
    var name: String = ""
    var price: Double = 0.0
        get() {
            println("Inside Getter")
            return field
        }
        set(value) {
            println("Inside Setter")
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("Negative price is not allowed")
            }
        }

    constructor(name: String) {
        this.name = name
    }
}

fun main() {
    val item = Item("Ipad")
    println("item = $item")
    println(item)
    item.price = -1.0
    item.price = 2.0
    println(item.price)
}
