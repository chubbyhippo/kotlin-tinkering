package com.example.nulls

fun main() {
    var nameNullable: String? = null
//    println("nameNullable = ${nameNullable?.length}")
//    printName(nameNullable!!)
//    val length = nameNullable?.length?.toLong() ?: 0
//    println("length = $length")

    nameNullable?.run {
        println("length = $length")
    }

    nameNullable = "Hippo"
    println("nameNullable = $nameNullable")

    val movie = Movie(null, "The Batman")
    val savedMovie = saveMovie(movie)
    println("movie = $movie")
    println("savedMovie = $savedMovie")

}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}

data class Movie(
    val id: Int?,
    val name: String
)

fun printName(name: String) {
    println("name = [${name}]")
}
