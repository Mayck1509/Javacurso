package cursoJava2024;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		//1.crinado a estrutura basica do progama
				Scanner Scanner = new Scanner(System.in);
				
				
				//2.declarando a variavel 'numero'
				  System.out.print("Digite um número para verificar se é primo: ");
			        int numero = Scanner.nextInt();
			        
			        // 3. Contando o número de divisores
			        int contadorDivisores = 0;
			        
			        for (int i = 1; i <= numero; i++) {
			            if (numero % i == 0) {
			                contadorDivisores++;
			            }
			        }
			        
			        // 4. Verificando se o número é primo
			        if (contadorDivisores > 2) {
			            System.out.println(numero + " não é um número primo.");
			        } else {
			            System.out.println(numero + " é um número primo.");
			        }
			        
			        // Fechando o scanner
			        Scanner.close();

	}

}
