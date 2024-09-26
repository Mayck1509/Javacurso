package cursoJava2024;

import java.util.Scanner;

public class TaxiCalculator {

	public static void main(String[] args) {
		 // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
     // Taxas
        double taxaFixa = 10.0; // Taxa fixa
        double custoPorKm = 2.0; // Custo por quilômetro

        // Solicita ao usuário o número de quilômetros rodados
        System.out.print("Informe os quilômetros rodados: ");
        double kmRodados = scanner.nextDouble();

        // Calcula o valor total a ser pago
        double valorTotal = taxaFixa + (custoPorKm * kmRodados);

        // Exibe o valor total
        System.out.printf("O valor a ser pago pelo táxi é: R$ %.2f%n", valorTotal);

        // Fecha o scanner
        scanner.close();
    }

	}


