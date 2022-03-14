package com.example.nulls

fun main() {
    var nameNullable: String? = null
    println("nameNullable = $nameNullable")

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
