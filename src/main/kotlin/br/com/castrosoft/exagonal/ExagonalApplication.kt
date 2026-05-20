package br.com.castrosoft.exagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExagonalApplication

fun main(args: Array<String>) {
	runApplication<ExagonalApplication>(*args)
}
