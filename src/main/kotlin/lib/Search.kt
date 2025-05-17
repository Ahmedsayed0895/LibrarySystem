package org.example.lib

import org.example.model.Book

interface Search {
    fun bookSearch(title:String): Book
}