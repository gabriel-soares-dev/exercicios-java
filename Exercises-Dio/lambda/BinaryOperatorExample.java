package lambda;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> { return x + y; }; 
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> { return x * y; }; 
        System.out.println(calc.apply(2.0, 3.0));
    }
}
