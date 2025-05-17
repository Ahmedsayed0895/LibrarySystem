package org.example.model

import org.example.model.Author
import java.util.UUID

data class Book(
    val id: UUID= UUID.randomUUID(),
    val title:String,
    val author: Author,
    val des:String,
    var isAvailable:Boolean ) {
}