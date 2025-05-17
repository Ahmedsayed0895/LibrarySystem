package org.example.lib

import org.example.model.Book

interface Borrow {
    fun bookBorrow(title:String): Book

}