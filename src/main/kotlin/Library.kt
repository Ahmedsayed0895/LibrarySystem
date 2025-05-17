package org.example

import java.util.UUID

interface Library {
    fun addBook(book:Book)
    fun getBooks():List<Book>
    fun deleteBook(id:UUID)
    fun update(id:UUID,book: Book)
}