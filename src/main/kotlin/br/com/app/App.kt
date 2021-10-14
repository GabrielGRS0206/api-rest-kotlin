package br.com.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalcAppApplication

fun main(args: Array<String>) {
	runApplication<CalcAppApplication>(*args)
	println("Iniciando com Kotlin.")
}
