package lambda.interfacesFunctions;

import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.math.BigDecimal;

public class ExerciseBinaryOperator {

    /*
     * A paritr do produto calcular o preço real(com desconto)
     * Imposto Municipal: >= 2500 (8,5%) / < 2500(Isento)
     * Frete: >= 3000(100)/ < 3000 (50)
     * Arredondar: Deixar duas casas decimais
     * Formatar: R$1234,56
    */
    public static void main(String[] args) {

        Function<Product, Double> priceResult = (p) -> p.getPriceWithDiscount();
        UnaryOperator<Double> taxCity = (price) -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> fret =  price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> round = price -> {
            BigDecimal bd = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
            double val2 = bd.doubleValue();
            return val2;
        };
        Function<Double, String> format = price -> ("R$" + price).replace(".", ",");

        Product prd = new Product("iPad", 3235.89, 0.13);

        String priceFinal = priceResult
        .andThen(taxCity)
        .andThen(fret)
        .andThen(round)
        .andThen(format)
        .apply(prd);


        System.out.println("The price final of the product is "+priceFinal);


    }


}
