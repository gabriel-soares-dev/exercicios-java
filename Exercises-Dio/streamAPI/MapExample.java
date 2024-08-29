package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MapExample {

    public static void main(String[] args) {
        
        Consumer<String> print = System.out::print;

        List<String> logos = Arrays.asList("Audi ","Honda ", "Byd ", "Fiat ");

        logos.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> upper = n -> n.toUpperCase();
        UnaryOperator<String> firstWord = n -> n.charAt(0) + "";
        UnaryOperator<String> explain = n -> n + "!!! ";

        logos.stream().map(upper).map(firstWord).map(explain).forEach(print);
    }
    
}
