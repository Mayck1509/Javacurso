package cursoJava2024;

import java.util.Scanner;

public class Palídromo {

	public static void main(String[] args) {
		// Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        // Remove espaços e converte para minúsculas
        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();

        // Inverte a palavra
        String palavraInvertida = new StringBuilder(palavraFormatada).reverse().toString();

        // Verifica se a palavra é um palíndromo
        if (palavraFormatada.equals(palavraInvertida)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        // Fecha o scanner
        scanner.close();
		
	}

}
