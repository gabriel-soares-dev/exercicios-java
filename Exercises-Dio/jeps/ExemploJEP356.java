package jeps;

import java.util.Random;
import java.util.SplittableRandom;
import java.util.stream.IntStream;

public class ExemploJEP356 {
    public static void main(String[] args) {
        
         int numIterations = 1_000_000;

        // Usando Random
        long startTimeRandom = System.nanoTime();
        Random random = new Random();
        IntStream.range(0, numIterations)
                .map(i -> random.nextInt(10))
                .forEach(number -> {}); // Não fazemos nada com os números
        long endTimeRandom = System.nanoTime();
        long durationRandom = endTimeRandom - startTimeRandom;

        // Usando SplittableRandom
        long startTimeSplittableRandom = System.nanoTime();
        SplittableRandom splittableRandom = new SplittableRandom();
        IntStream.range(0, numIterations)
                .map(i -> splittableRandom.nextInt(10))
                .forEach(number -> {}); // Não fazemos nada com os números
        long endTimeSplittableRandom = System.nanoTime();
        long durationSplittableRandom = endTimeSplittableRandom - startTimeSplittableRandom;

        System.out.println("Tempo de execução (Random): " + durationRandom + " ns");
        System.out.println("Tempo de execução (SplittableRandom): " + durationSplittableRandom + " ns");
    }
}
