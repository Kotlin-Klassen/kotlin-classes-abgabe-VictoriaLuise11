package com.example.kotlin_classes.abschluss_abgabe

sealed class BookStatus {
    object Available : BookStatus()
    data class CheckedOut(val dueDate: String) : BookStatus()
    data class Reserved(val reservedBy: String) : BookStatus()

    fun printStatus(): String {
        return when (this) {
            is Available -> "The book is available."
            is CheckedOut -> "The book is checked out. Due date: $dueDate."
            is Reserved -> "The book is reserved by $reservedBy."
        }
    }
}
