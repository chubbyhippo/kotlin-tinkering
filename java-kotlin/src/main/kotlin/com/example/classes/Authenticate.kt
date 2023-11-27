package com.example.classes

object Authenticate {
    @JvmStatic
    fun authenticate(userName: String, password: String) {
        println("userName = $userName")
        println("password = $password")
    }
}

fun main() {
    Authenticate.authenticate("hippo", "hippo")
}


