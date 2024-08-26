package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {

    public static void filter(List<String> list, Predicate<String> predicate){
        // extern iterate
        // for (String s : list) {
        //     if (predicate.test(s)) {
        //         System.out.println(s);
        //     }
        // }

        //intern iterate
        list.stream().filter(predicate::test)
        .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pernambuco","Bahia","Ceará","Alagoas","Paraíba");
        //1º option: list.forEach(x -> System.out.println(x));
        //2º option: list.forEach(System.out::println);
        
        // Predicate
        System.out.println("States begin with 'P':");
        filter(list, (s) -> s.startsWith("P"));

        System.out.println("\nStates with more of 6 chars");
        filter(list, (s) -> s.length() > 6);

        // list iterate with sorting stream
        //list.stream().sorted().forEach(System.out::println);
    }
}