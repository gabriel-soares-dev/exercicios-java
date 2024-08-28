package lambda.interfacesFunctions;

public class Product {
    
    final String name;
    final double price;
    final double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        double resultPrice = getPriceWithDiscount();
        return "Product "+name+" and price is "+resultPrice;
    } 

    public Double getPriceWithDiscount(){
        return price * (1 - discount);
    } 
    
}
