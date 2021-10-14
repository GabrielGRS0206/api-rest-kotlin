package br.com.app.domain.model

class Client(
    val id: Long? = null,
    val name: String,
    val document: String,
    val contact: String,
    val email: String
) {
}