package cursoJava2024;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		//Instanciando a classe(usando a classe):
		Scanner Scanner = new Scanner (System.in);
		
		//entrada de valores:
		System.out.println("---------------------------");
		System.out.println("Calculadora de Juros Simples");
		System.out.println("---------------------------");
		System.out.println("Digite o capital:");
		double capital = Scanner.nextDouble();
		
		System.out.println("Informe a taxa de Juros(%):");
		double taxa = Scanner.nextDouble();
		
		System.out.println("Informe o tempo de Aplicação(em anos):");
		int tempo = Scanner.nextInt();
		
		//Calculando os juros:
		double Juros = ( capital * taxa * tempo )/100;
		System.out.println("O valor dos juros são: "+Juros);

		//resultado:
		double total = capital + Juros;
		System.out.println("O total investido + Juros é de:" + total);
		
		Scanner.close();
	}

}
