package com.example.kotlin_classes.abschluss_abgabe

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun searchBooks(query: String): List<Book> {
        return books.filter { it.title.contains(query, ignoreCase = true) || it.author.contains(query, ignoreCase = true) }
    }

    fun displayBookStatus() {
        books.forEach { println("${it.title}: ${it.status.printStatus()}") }
    }

    class LibraryAddress(val street: String, val city: String, val zipCode: String) {
        fun printAddress() {
            println("Library Address: $street, $city, $zipCode")
        }
    }

    inner class LibraryMember(val name: String, val memberID: String) {
        fun checkoutBook(book: Book, dueDate: String) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.CheckedOut(dueDate)
                println("$name checked out '${book.title}'. Due date: $dueDate.")
            } else {
                println("The book '${book.title}' is not available.")
            }
        }

        fun reserveBook(book: Book) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.Reserved(name)
                println("$name reserved '${book.title}'.")
            } else {
                println("The book '${book.title}' is not available for reservation.")
            }
        }
    }
}
