package lambda;

public class LambdaPraticeBasic{
    public static void main(String[] args) {
        System.out.println("=== Begin tests ===");
        //class anonymous
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Studying lambda express: no lambda");
            }
        };
        //syntax: (<args>) ->  body;
        Runnable r2 = () -> System.out.println("Studying lambda express: with lambda");
        r1.run();
        r2.run();
    }


}