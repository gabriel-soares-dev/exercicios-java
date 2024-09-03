package streamAPI.reduce;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

class Aluno {

    final String name;
    final Double note;
    final boolean isGood;

    public Aluno(String name, Double note) {
        this.name = name;
        this.note = note;
        this.isGood = true;
    }

}

public class Reduce2Example {
    
    public static void main(String[] args) {
        List<Aluno> students = Arrays.asList(
            new Aluno("Ana",7.1),
            new Aluno("Gab",6.9),
            new Aluno("Kil",8.8),
            new Aluno("Dan",10.0),
            new Aluno("Leo",4.7)
        );

        Predicate<Aluno> isApproved = s -> s.note >= 7;
        Function<Aluno, Double> onlyNote = s -> s.note;

        BinaryOperator<Double> sumFull = (a,b) -> a + b;
        students.stream()
        .filter(isApproved)
        .map(onlyNote)
        .reduce(sumFull)
        .ifPresent(System.out::println);

        BiFunction<Media, Double, Media> calculateMedia = (media, note) -> media.add(note);

        BinaryOperator<Media> combineMedia = (m1, m2) -> Media.combine(m1, m2);

        Media mediaResult =  students.stream()
        .filter(isApproved)
        .map(onlyNote)
        .reduce(new Media(), calculateMedia, combineMedia);
        
        System.out.println("The media of students is: "+mediaResult.getValue());
    }
}
