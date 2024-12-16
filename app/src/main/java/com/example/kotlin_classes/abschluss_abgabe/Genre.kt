package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Based on real facts and information"),
    SCIENCE("Books on scientific topics"),
    HISTORY("Books about historical events"),
    CHILDREN("Books intended for children");

    fun printDescription() {
        println(description)
    }
}
