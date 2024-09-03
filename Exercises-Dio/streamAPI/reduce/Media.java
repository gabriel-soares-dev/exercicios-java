package streamAPI.reduce;

public class Media {
    private double total;
    private int qtd;

    public Media add(double value){
        total += value;
        qtd++;
        return this;
    }

    public double getValue(){
        return total / qtd;
    }

    public static Media combine(Media m1, Media m2){
        Media result = new Media();
        result.total = m1.total + m2.total;
        result.qtd = m1.qtd + m2.qtd; 
        return result;
    }

}
