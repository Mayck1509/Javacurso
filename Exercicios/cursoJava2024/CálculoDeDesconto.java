package cursoJava2024;

import java.util.Scanner;

public class CálculoDeDesconto {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Solicita o preço original do produto
        System.out.print("Digite o preço original do produto: R$ ");
        double precoOriginal = scanner.nextDouble();
        
        // Solicita o percentual de desconto
        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();
        
        // Calcula o preço final após o desconto
        double desconto = (percentualDesconto / 100) * precoOriginal;
        double precoFinal = precoOriginal - desconto;
        
        // Exibe o preço final
        System.out.printf("O preço final após o desconto é: R$ %.2f%n", precoFinal);
		

	}

}
