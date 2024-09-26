package cursoJava2024;

import java.util.Scanner;

public class Inverter {

	public static void main(String[] args) {
		  // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Inverte a palavra
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        // Exibe a palavra invertida
        System.out.println("Palavra invertida: " + palavraInvertida);

        // Fecha o scanner
        scanner.close();
		

	}

}
