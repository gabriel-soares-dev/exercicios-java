package lambda.interfacesFunctions;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Product> prints = value -> System.out.println("Your product is: "+value.name);

        Product p1 = new Product("TV", 1500, 0.10);
        //prints.accept(p1);

        List<Product> products = Arrays.asList(
            new Product("Monitor", 1000, 0.10),
            new Product("Webcam 4K", 500, 0.03),
            new Product("NVidia GTX", 3000, 0.20)
        );

        //products.forEach(prints);
        products.forEach(System.out::println);
    }
}
