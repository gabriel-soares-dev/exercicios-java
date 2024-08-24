package lambda;

public class Functional {

    interface Numeral {
        double getValueDouble();
    }

    interface NumeralBool {
        boolean test(int num);
    }

    public static void main(String[] args) {

        //using lambda express as a constant
        Numeral numeralDouble;
        numeralDouble = () -> 2*3.14;
        System.out.println(numeralDouble.getValueDouble());

        //using class Math with structure lambda 
        Numeral num1 = () -> Math.random() * 100;
        System.out.println(num1.getValueDouble());
        System.out.println(num1.getValueDouble());

        //using boolean with arguments of the lambda
        NumeralBool isPar = (int n) -> (n % 2) == 0;
        System.out.println(isPar.test(2));
        System.out.println(isPar.test(3));
    }
}