package org.example.libImpl

import org.example.data.AllList
import org.example.lib.Library
import org.example.model.Book
import java.util.UUID

class LibraryImpl( private val lists: AllList): Library {


    override fun addBook(book: Book) {
                lists.books.add(book)
    }

    override fun getBooks(): List<Book> {
      return lists.books.toList()
    }

    override fun deleteBook(id: UUID) {
        lists.books.removeIf {
            it.id==id
        }
    }

    override fun update(id: UUID, book: Book) {
     val oldBook=  lists.books.find { it.id==id }
        if(oldBook != null){
            lists.books.remove(oldBook)
            lists.books.add(book)
        }

    }
}