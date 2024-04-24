/** Classe base para descontos (aberto para extensões) */
class Discount {
    public double calculateDiscount(double originalValue) {
        return originalValue; // No default discount
    }
}

/** Classe derivada para desconto de estudante (10%). */
class StudentDiscount extends Discount {
    // TODO: Substituir o método aberto "calculateDiscount" com base nesta
    // responsabilidade final da classe.
    public double calculateDiscount(double originalValue) {
        return originalValue - (originalValue * 10) / 100;
    }
}

/** Classe derivada para desconto de afiliado (15%). */
class MembershipDiscount extends Discount {
    // Substitua o método aberto "calculateDiscount" com base nesta responsabilidade
    // final da classe.
    public double calculateDiscount(double originalValue) {
        return originalValue - (originalValue * 15) / 100;
    }
}

public class PrecoDesconto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String discountType = scanner.next();
            double originalValue = scanner.nextDouble();

            // Aplicação OCP: Criando uma instância com base no tipo de desconto fornecido
            Discount discount = new Discount();
            if ("student".equals(discountType)) {
                discount = new StudentDiscount();
            } else if ("membership".equals(discountType)) {
                discount = new MembershipDiscount();
            }

            double discountValue = discount.calculateDiscount(originalValue);
            System.out.printf("%.2f", discountValue);
        }
    }
}
