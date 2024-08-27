package lambda.interfacesFunctions;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        
        UnaryOperator<Integer> moreTwo = n -> n + 2;
        UnaryOperator<Integer> multTwo = n -> n * 2;
        UnaryOperator<Integer> vlQuad = n -> n * n;


        int result = moreTwo.andThen(multTwo).andThen(vlQuad).apply(5);
        System.out.println(result);

        int result2 = vlQuad.compose(multTwo).compose(moreTwo).apply(5);
        System.out.println(result2);

    }
}
