import java.util.Scanner
import kotlin.random.Random

/**
Create a program to do the following:
1. The targetNumber is generated using the Random, which generates a random integer between 1 and 10 
(inclusive).
2. The program enters a do-while loop that continues until the user guesses the correct number.
3. Inside the loop, the program prompts the user to guess a number using
4. If the user input is not a valid integer, the loop continues.
5. The program keeps track of the number of attempts in the attempts variable.
6. The program compares the user's guess with the targetNumber and provides a hint based on the 
comparison: If the user's guess is lower than the target number, the program prints "Higher". If the user's 
guess is higher than the target number, the program prints "Lower". If the user's guess is equal to the target 
number, the program prints "Correct!".
7. The loop continues until the user guesses the correct number

Created by Microsoft Copilot

*/

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