import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val filmes = arrayOf(
        arrayOf("O Poderoso Chefão", "1972", "Crime"),
        arrayOf("Clube da Luta", "1999", "Drama"),
        arrayOf("Interestelar", "2014", "Ficção científica")
    )

    println("Digite 1 para pesquisar por título ou 2 para pesquisar por gênero:")
    val opcao = scanner.next()

    when (opcao) {
        "1" -> {
            println("Digite o título do filme:")
            val titulo = scanner.next()
            filmes.filter { it[0].contains(titulo, ignoreCase = true) }
                  .forEach { println("Título: ${it[0]}, Ano: ${it[1]}, Gênero: ${it[2]}") }
        }
        "2" -> {
            println("Digite o gênero do filme:")
            val genero = scanner.next()
            filmes.filter { it[2].equals(genero, ignoreCase = true) }
                  .forEach { println("Título: ${it[0]}, Ano: ${it[1]}, Gênero: ${it[2]}") }
        }
        else -> println("Opção inválida.")
    }
}
