package jeps;
import java.util.random.*;

public class ExemploJEP356 {
    public static void main(String[] args) {
        RandomGeneratorFactory<RandomGenerator> factory = RandomGeneratorFactory.of("L64X128MixRandom");
        RandomGenerator randomGenerator = factory.create(1994);
        int randomNumber = randomGenerator.nextInt();

        System.out.println(randomNumber);
    }
}
