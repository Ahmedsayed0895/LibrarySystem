package org.example.libImpl

import org.example.data.AllList
import org.example.lib.Search
import org.example.model.Book

class SearchImpl(private val lists: AllList): Search {
    override fun bookSearch(title: String) : Book{
      return lists.books.find { it.title==title }  ?:throw Exception("book not found")

    }
}