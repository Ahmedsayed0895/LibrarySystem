package org.example.model

import java.util.UUID

data class Author(val id: UUID= UUID.randomUUID(), val name:String) {
}