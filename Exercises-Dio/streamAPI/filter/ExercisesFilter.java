package streamAPI.filter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Product {
    final String name;
    final double price;
    final double discount;
    final double tax;

    public Product(String name, double price, double discount, double tax) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.tax = tax;
    }

}

public class ExercisesFilter {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Wireless Headpset", 29.99, 0.05, 0.2),
            new Product("Tv Box", 79.90, 0.05, 09.00),
            new Product("Shoes Black", 64.90, 0.05, 0.70),
            new Product("Port USB Adapter", 9.99, 0.00, 0.25),
            new Product("Magicube 4K Wifi and Bluethooh", 43.35, 0.10, 00),
            new Product("Wireless Mini Speaker", 0.99, 0.00, 00),
            new Product("Monitor 4K", 499.99, 0.31, 00),
            new Product("iPhone 14", 699.99, 0.25, 00),
            new Product("AirFryer Philco", 500.00, 0.00, 00)
        );

        Predicate<Product> greatDiscount = p -> p.price >= 30;
        Predicate<Product> freeTax = p -> p.tax == 0;
        Predicate<Product> priceRelevant = p -> p.price >= 500;
        Function<Product, String> callDiscount = p -> "Let's GO! "+p.name+" in U$ "+p.price;

        products.stream()
        .filter(greatDiscount)
        .filter(freeTax)
        .filter(priceRelevant)
        .map(callDiscount)
        .forEach(System.out::println);

    }
    
}
