package acc.br.notas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotasApplication

fun main(args: Array<String>) {
	runApplication<NotasApplication>(*args)
}
