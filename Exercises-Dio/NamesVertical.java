/**
Faça um programa que solicite o nome do usuário e imprima-o de forma a mostrar o nome em formato de escada.
**/

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,  
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".  
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 


import java.util.*;

public class NomesVertical {
    
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
	     String palavra = scanner.next();
	        
	     // TODO: Faça um programa que solicite o nome do usuário e imprima-o de forma a mostrar o nome em formato de escada
	     StringBuilder str = new StringBuilder();
	     char[] charArray = palavra.toCharArray();
	     for (int i = 0; i < palavra.length(); i++) {
	        	str.append(charArray[i]);
				    System.out.println(str);
			 }
    }
}