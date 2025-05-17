package org.example.libImpl

import org.example.data.AllList
import org.example.lib.Borrow
import org.example.model.Book

class BorrowImpl( private val lists: AllList): Borrow {
    override fun bookBorrow(title: String): Book {
        val wantedBook=lists.books.find { it.title==title }
       if (wantedBook?.isAvailable==true){
           wantedBook.isAvailable=false
           return wantedBook
       }
        else
            throw Exception("book is not found or not avaliable")

    }
}