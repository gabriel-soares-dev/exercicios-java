package br.acc.empregados

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmpregadosApplication

fun main(args: Array<String>) {
	runApplication<EmpregadosApplication>(*args)
}
