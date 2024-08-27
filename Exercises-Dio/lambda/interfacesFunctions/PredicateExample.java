package lambda.interfacesFunctions;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Product> isAlt = prod -> (prod.price * (1 - prod.discount)) >= 800;

        Product prd = new Product("Notebook", 4000, 0.50);
        //System.out.println(isAlt.test(prd));

        //Composition
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isThreeDigits = num -> num >= 100 && num <= 999;
    
        System.out.println(isPar.and(isThreeDigits).test(220));
        System.out.println(isPar.or(isThreeDigits).test(211));
        System.out.println(isPar.and(isThreeDigits).negate().test(200));
    }
}
