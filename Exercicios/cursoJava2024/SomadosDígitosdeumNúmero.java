package cursoJava2024;

import java.util.Scanner;

public class SomadosDígitosdeumNúmero {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        // Solicita um número ao usuário
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();
	        
	        int soma = somaDosDigitos(numero);
	        
	        System.out.println("A soma dos dígitos do número " + numero + " é: " + soma);
	    }
	    
	    public static int somaDosDigitos(int numero) {
	        int soma = 0;
	        
	        // Enquanto o número for maior que 0
	        while (numero > 0) {
	            soma += numero % 10; // Adiciona o último dígito à soma
	            numero /= 10; // Remove o último dígito
	        }
	        
	        return soma;
	    }
	

	}


