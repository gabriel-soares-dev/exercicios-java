/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moedareais;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class CentavoReais {

    static double valor_total;
    static double[] moedas_centavos;
    static int contador;

    public static void main(String args[]) {
        int numero_moedas = 0;
        double numero_reais, numero_centavos;

        contador = 0;
        valor_total = 0;

        numero_reais = counterReais(numero_moedas);
        numero_centavos = counterCentavos(numero_reais);

        System.out.printf("Valor em reais: %.2f\n", numero_reais);
        System.out.printf("Valor em centavos: %.0f", numero_centavos);

    }

    public static double counterReais(int numero_moedas) {
        Scanner input = new Scanner(System.in);
        moedas_centavos = new double[6];
        moedas_centavos[0] = 0.01;
        moedas_centavos[1] = 0.05;
        moedas_centavos[2] = 0.10;
        moedas_centavos[3] = 0.25;
        moedas_centavos[4] = 0.50;
        moedas_centavos[5] = 1.0;

        while (contador < 6) {
            System.out.printf("Quantas moedas de %.2f: ", moedas_centavos[contador]);
            numero_moedas = input.nextInt();
            if (numero_moedas < 0) {
                continue;
            }
            valor_total = valor_total + numero_moedas * moedas_centavos[contador];
            contador++;
        }
        return valor_total;
    }

    public static double counterCentavos(double numero_reais) {
        double total_centavos = numero_reais * 100;
        return total_centavos;
    }

}
