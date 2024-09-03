package streamAPI.reduce;

public class ReduceMedia {

    public static void main(String[] args) {
        
        Media m1 = new Media().add(8.3).add(6.0);
        Media m2 = new Media().add(7.5).add(3.9);
        System.out.println(m1.getValue());
        System.out.println(m2.getValue());

        System.out.println(Media.combine(m1, m2).getValue());
    }
}
