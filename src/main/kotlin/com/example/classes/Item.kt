package com.example.classes


class Item {
    var name : String = ""

    constructor(name: String) {
        this.name = name
    }
}

fun main() {
    val item = Item(name = "Hippo")
    println("name = ${item.name}")
}