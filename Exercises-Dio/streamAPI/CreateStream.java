package streamAPI;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "C# ", "PHP ");
        langs.forEach(print);

        String[] moreLangs = {"Python ", "Rust ", "Javascript "};
        Stream.of(moreLangs).forEach(print);
        //Arrays.stream(moreLangs).forEach(print);
        Arrays.stream(moreLangs, 1, 3).forEach(print);

        // Stream.generate(() -> "a").forEach(print);
        // Stream.iterate(0, n -> n + 1).forEach(print);
        
    }
}
