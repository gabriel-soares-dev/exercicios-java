import java.util.Scanner
import kotlin.random.Random

fun main() {
    val sc = Scanner(System.`in`)

    print("Informe primeiro valor 1: ")
    var value1 = sc.nextInt()
    
    print("Informe o operador: ")
    var operator = sc.next()

    print("Informe primeiro valor 2: ")
    var value2 = sc.nextInt()

    val result = if("+".equals(operator)){
        value1+value2
    } else if ("-".equals(operator)){
        value1-value2
    }else if ("*".equals(operator)){
        value1*value2
    }else if ("/".equals(operator)){
        value1/value2
    }else{
        "Operador invalido!"
    }

    println(result)
}