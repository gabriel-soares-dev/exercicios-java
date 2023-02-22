
/**
Supondo que a população de um país A tenha N habitantes com uma taxa anual de crescimento de 3% e que a população de B M habitantes com uma taxa de crescimento de 1.5%. 
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

Obs: O valor inicial da população A deverá ser sempre menor que do país B
*/
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class GrowthRate {
    public static void main(String[] args) {
	        double A, B;

	        Scanner input = new Scanner(System.in);
	        A = input.nextInt();
	        B = input.nextInt();
	               

	        int anos = 0;
	        double taxa_crescimentoA = 0.03;
	        double taxa_crescimentoB = 0.015;
	        

	        //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B
	        do{
				A = A+(A*taxa_crescimentoA);
				B = B+(B*taxa_crescimentoB);
				anos++;
			}while (A < B);
	        
	        System.out.println(anos + " anos");
    }
}