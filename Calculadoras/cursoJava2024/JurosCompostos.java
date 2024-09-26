package cursoJava2024;

import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		// Instanciando a classe(usando a classe):
		Scanner Sc = new Scanner(System.in);

		// entredas do usuário:
		// Pegando o capital inicial:
		System.out.println("---------------------------");
		System.out.println("Calculadora de Juros Composto");
		System.out.println("---------------------------");
		System.out.println("Digite o capital:");
		double capital = Sc.nextDouble();

		// Pegando a Taxa de Juros:
		System.out.println("Qual é a taxa de juros:");
		double taxa = Sc.nextDouble();

		// pegando o tempo:
		System.out.println("Digite o tempo em juros:");
		int tempo = Sc.nextInt();

		// calculando juros compostos:
		double montante = capital * Math.pow(1 + (taxa / 100), tempo);
		// saída final
		System.out.println("O montante final será de R$ " + montante);
		Sc.close();

	}

}
