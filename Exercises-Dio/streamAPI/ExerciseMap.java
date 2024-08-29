package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ExerciseMap {

    /*
     * Número para string binária ... 6 => "110"
     * Inverter a string... "110" => "011"
     * Converter de volta para inteiro => "011" => 3
    */
    public static void main(String[] args) {
        Consumer<Integer> println = System.out::println;
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Function<Integer,String> intToBinaryString = (num) -> Integer.toBinaryString(num); 
        UnaryOperator<String> binaryStringRevert = num -> new StringBuilder(num).reverse().toString();
        Function<String,Integer> binaryToInt = (num) -> Integer.parseInt(num, 2);
        
        nums.stream().map(intToBinaryString).map(binaryStringRevert).map(binaryToInt).forEach(println);
    }
    
}
