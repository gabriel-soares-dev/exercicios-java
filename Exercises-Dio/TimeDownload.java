/**
Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps). 
Calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). 
 */

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class TimeDownload {

  public static void main(String[] Args) {

		   Scanner sc = new Scanner(System.in);
		   double tmhMB = sc.nextFloat();
		   double tmhMbps = sc.nextFloat();

		   //TODO: Calcule o tempo aproximado de download:
		   double resultTempo = tmhMB / tmhMbps;

		   //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais:
		    System.out.println(String.format("%.2f", resultTempo/60));
	 }
}