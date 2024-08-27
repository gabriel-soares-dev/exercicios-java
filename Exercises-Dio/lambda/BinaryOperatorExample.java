package lambda;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> { return x + y; }; 
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> { return x * y; }; 
        System.out.println(calc.apply(2.0, 3.0));

        //BiFunction
        BiFunction<Double, Double, String> biFunc = (n1, n2) -> ( (n1+n2) / 2 ) >= 7 ? "Approved" : "NotApproved";
        System.out.println(biFunc.apply(9.8,0.1));
        
    }
}
