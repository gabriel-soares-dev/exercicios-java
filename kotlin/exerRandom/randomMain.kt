import java.util.Scanner
import kotlin.random.Random

fun main() {
    val targetNumber = Random.nextInt(1, 101)
    val scanner = Scanner(System.`in`)
    var guess: Int
    var attempt = 0

    do{
        print("Advinhe o numero entre 1 e 101:")
        while(!scanner.hasNextInt()){
            println("Isto nao e um numero inteiro. tente novamente.")
            scanner.next() 
        }
        guess = scanner.nextInt()
        attempt++

        when{
            guess < targetNumber -> println("Alto")
            guess > targetNumber -> println("Baixo")
            else -> println("Acertou!")
        }
        
    } while (guess != targetNumber)
    
    println("Voce adivinhou o numero correto em $attempt tentativas.")
}