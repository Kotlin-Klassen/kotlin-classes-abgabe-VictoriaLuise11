package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    // Bibliothek erstellen
    val library = Library()

    // Bücher hinzufügen
    library.addBook(Book("1984", "George Orwell", Genre.FICTION, BookStatus.Available))
    library.addBook(Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE, BookStatus.Available))
    library.addBook(Book("The Cat in the Hat", "Dr. Seuss", Genre.CHILDREN, BookStatus.Available))
    library.addBook(Book("Napoleon", "History Guy", Genre.HISTORY, BookStatus.Reserved("John Doe")))
    library.addBook(Book("Lexicon of earth", "Mother Earth", Genre.NON_FICTION, BookStatus.CheckedOut("2024-12-15")))

    // Adresse hinzufügen und anzeigen
    val address = Library.LibraryAddress("66 Wall St", "Lalaland", "935803")
    address.printAddress()

    // Mitglied erstellen
    val member = library.LibraryMember("Victoria", "M001")

    // Buch ausleihen
    val book1 = library.searchBooks("1984").firstOrNull()
    book1?.let { member.checkoutBook(it, "2024-12-20") }

    // Buch reservieren
    val book2 = library.searchBooks("A Brief History of Time").firstOrNull()
    book2?.let { member.reserveBook(it) }

    // Buchstatus anzeigen
    library.displayBookStatus()
}
