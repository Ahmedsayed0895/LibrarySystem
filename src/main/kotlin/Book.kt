package org.example

import java.util.UUID

data class Book(val title:String, val id:UUID, val author:Author, val des:String, val isAvailable:Boolean ) {
}