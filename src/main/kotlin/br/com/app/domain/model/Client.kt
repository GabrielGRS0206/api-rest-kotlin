package br.com.app.domain.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Client(
    @Id
    val id: Long? = null,
    val name: String,
    val document: String,
    val contact: String,
    val email: String
) {
}