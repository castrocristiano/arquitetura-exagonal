package br.com.castrosoft.exagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class ExagonalApplication

fun main(args: Array<String>) {
	runApplication<ExagonalApplication>(*args)
}
