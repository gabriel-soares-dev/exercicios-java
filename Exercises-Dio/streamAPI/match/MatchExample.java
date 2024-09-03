package streamAPI.match;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        } else if (!note.equals(other.note))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Aluno [name=" + name + ", note=" + note + "]";
    }

}

public class MatchExample {
    
    public static void main(String[] args) {

         List<Aluno> students = Arrays.asList(
            new Aluno("Ana",7.1),
            new Aluno("Gab",8.0),
            new Aluno("Kil",7.8),
            new Aluno("Dan",10.0),
            new Aluno("Leo",7.7),
            new Aluno("Ana",7.1)
        );

        Predicate<Aluno> isApproved = s -> s.note >= 7;
        Predicate<Aluno> isReproved = isApproved.negate();

        System.out.println(students.stream().allMatch(isApproved));
        System.out.println(students.stream().noneMatch(isReproved));

        List<Aluno> students1 = Arrays.asList(
            new Aluno("Ana",7.1),
            new Aluno("Gab",6.1)
        );

        System.out.println(students1.stream().anyMatch(isApproved));

        //Min and Max

        Comparator<Aluno> comparatorNote = (a1, a2) -> {
            if (a1.note > a2.note) return 1;
            if (a1.note < a2.note) return -1; 
            return 0;       
        };

        System.out.println(students.stream().max(comparatorNote).get());
        System.out.println(students.stream().min(comparatorNote).get());

        //distinct
        students.stream().distinct().forEach(System.out::println);

        //skip Limit
        System.out.println("\n");
        students.stream().distinct().skip(2).limit(2).forEach(System.out::println);

        //skip Limit
        System.out.println("\n");
        students.stream().distinct().skip(2).takeWhile(a -> a.note >= 7).forEach(System.out::println);
    }
}
