package org.example

import org.example.data.AllList
import org.example.lib.Library
import org.example.libImpl.LibraryImpl
import org.example.model.Author
import org.example.model.Book

fun main() {
    val author1= Author(name = "ahmed")
    val author2= Author(name = "alaa")
    val book1= Book(title = "algorithm", author =author1, des = "ahla book", isAvailable = true )
    val book2= Book(title = "clean book", author =author2, des = "ahla book", isAvailable = true )
    val list= AllList()
    val library: Library= LibraryImpl(list)


    library.addBook(book1)
    library.update(book1.id,book2)
    library.getBooks().forEach {
        println("${it.des} by ahla ${it.author.name}")
    }


}