package streamAPI.reduce;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> sum = (ac , n) -> ac + n;

        System.out.println(nums.stream().reduce(sum).get());
        System.out.println(nums.parallelStream().reduce(100, sum));
        nums.stream()
            .filter(n -> n > 5)
            .reduce(sum)
            .ifPresent(System.out::println);
    }
    
}
