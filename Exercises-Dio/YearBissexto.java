/*
Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto
*/

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class YearBissexto {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;
    
        ano = ent.nextInt();
        
        //TODO: Descubra se o ano é bissexto ou não
      if  ( ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) || ( ano % 400 == 0 ) ) {
				System.out.println("Bissexto");
			} else {
				System.out.println("Nao Bissexto");
			}
    }
}