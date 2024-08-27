package lambda.interfacesFunctions;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        
        Supplier<List<String>> list = () -> Arrays.asList("Biel","Glau","Ane","Nay");

        System.out.println(list.get());
    }
}
