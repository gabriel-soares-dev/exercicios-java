package lambda.interfacesFunctions;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> parOrImpar = num -> num % 2 == 0 ? "Par" : "Impar";

        //System.out.println(parOrImpar.apply(4));

        Function<String, String> resultIs = value -> "The result is: "+value;
        
        String resultFinal = parOrImpar
                            .andThen(resultIs)
                            .apply(4);
        
        System.out.println(resultFinal);
    }
}
