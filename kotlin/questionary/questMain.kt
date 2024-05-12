import java.util.Scanner

data class Questao(val pergunta: String, val opcoes: Map<Char, String>, val respostaCorreta: Char)

fun main() {
    val scanner = Scanner(System.`in`)
    var acertos = 0 
    var errados = 0
    val questoes = listOf(
        Questao(
            "Qual a capital do Brasil atual?",
            mapOf('a' to "São Paulo", 'b' to "Rio de Janeiro", 'c' to "Brasília", 'd' to "Salvador"),
            'c'
        ),
        Questao(
            "Em que ano implementou o plano REAL?",
            mapOf('a' to "1988", 'b' to "1994", 'c' to "1996", 'd' to "2000"),
            'b'
        ),
        Questao(
            "Quantos presidentes sofreram o impeachment no Brasil?",
            mapOf('a' to "0", 'b' to "1", 'c' to "2", 'd' to "3"),
            'c'
        )
    )

    questoes.forEach { questao ->
        println("Pergunta: ${questao.pergunta}")
        questao.opcoes.forEach { (letra, opcao) ->
            println("$letra. $opcao")
        }
        print("Digite a letra da resposta correta: ")
        val respostaUsuario = scanner.next().first()
        if (respostaUsuario == questao.respostaCorreta) {
            println("Resposta correta!")
            acertos++
        } else {
            println("Resposta incorreta. A resposta correta é: ${questao.respostaCorreta}")
            errados++
        }
        println()
    }
    println("total respostas acertas: $acertos")
    println("total respostas errados: $errados")
}
