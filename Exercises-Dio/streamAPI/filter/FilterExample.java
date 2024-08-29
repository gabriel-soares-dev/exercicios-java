package streamAPI.filter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterExample {

    public static void main(String[] args) {
        List<Aluno> students = Arrays.asList(
            new Aluno("Ana",7.1),
            new Aluno("Gab",6.9),
            new Aluno("Kil",8.8),
            new Aluno("Dan",10.0),
            new Aluno("Leo",4.7)
        );

        Predicate<Aluno> isApproved = a -> a.note >= 7;
        Function<Aluno, String> printApproved = a -> "Congratulations "+a.name+"! You are approved!";
    
        students.stream().filter(isApproved).map(printApproved).forEach(System.out::println);
    }

}
