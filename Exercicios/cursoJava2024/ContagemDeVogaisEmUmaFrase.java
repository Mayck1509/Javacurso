package cursoJava2024;

import java.util.Scanner;

public class ContagemDeVogaisEmUmaFrase {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		//solicitar uma frase do usuário
		System.out.println("digite uma frase: ");
		String  frase = Scanner.nextLine();
		
		int contador = contarVogais(frase);
		
		System.out.println("A frase contém" + contador + "vogais.");
	}
	
	public static int contarVogais(String frase) {
		int contador = 0;
		String vogais = "aeiouAEIOU";
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (vogais.indexOf(letra) != -1) {
				contador++;
			}
		}
		
		return contador;
	
	}

}
