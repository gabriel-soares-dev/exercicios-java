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
        double resultPrice= price * (1 - discount);
        return "Product "+name+" and price is "+resultPrice;
    } 

    
}
