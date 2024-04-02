import java.util.Scanner;
import java.lang.Double;

// Interface Strategy
interface Operation {
    double execute(double num1, double num2);
}

// Implementações concretas do Strategy
class AddOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 + num2;
    }
}

class SubtractOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 - num2;
    }
}

class MultiplyOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 * num2;
    }
}

// TODO: Implementar uma nova estratégia de divisão sem tratamento de divisão por zero
class DivideOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        // TODO: Implementar lógica de divisão sem tratamento de divisão por zero
        if (num2 == 0.0) {
            // Se o denominador for zero, retornamos NaN (Not-a-Number)
            return Double.NaN;
        } else {
            // Realizamos a divisão e retornamos o resultado
            return num1 / num2;
        }
    }
}

// Contexto que utiliza a estratégia
class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double performOperation(double num1, double num2) {
        return operation.execute(num1, num2);
    }
}

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operation addOperation = new AddOperation();
        Operation subtractOperation = new SubtractOperation();

       //TODO: Criar instâncias do restante das operações
       Operation multiplyOperation = new MultiplyOperation();
       Operation divideOperation = new DivideOperation();

        // Criando a calculadora
        Calculator calculator = new Calculator();

        // Obtendo os números do usuário
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Obtendo a operação desejada
        String operationChoice = scanner.next();

        // Configurando a operação na calculadora
        switch (operationChoice) {
            case "+":
                calculator.setOperation(addOperation);
                break;
            case "-":
                calculator.setOperation(subtractOperation);
                break;
            case "*":
                calculator.setOperation(multiplyOperation);
                break;
            case "/":
                calculator.setOperation(divideOperation); // TODO: Utilizar a nova implementação de divisão
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        // Realizando a operação e exibindo o resultado
        double result = calculator.performOperation(num1, num2);
        System.out.println(result);
    }
}