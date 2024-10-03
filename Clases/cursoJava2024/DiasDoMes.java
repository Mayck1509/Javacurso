package cursoJava2024;

import java.util.Scanner;

public class DiasDoMes {

	public static void main(String[] args) {
		 // 1. Criando a estrutura básica do programa
        Scanner scanner = new Scanner(System.in);
        
        // 2. Declarando a variável 'mes' e armazenando o nome do mês
        System.out.print("Digite o nome de um mês: ");
        String mes = scanner.nextLine().trim().toLowerCase(); // Padronizando para minúsculas
        
        // 3. Estrutura de decisão múltipla switch
        int dias;
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                System.out.println("O mês escolhido tem " + dias + " dias.");
                break;
            case "fevereiro":
                dias = 28; // Não considerando ano bissexto
                System.out.println("O mês escolhido tem " + dias + " dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                System.out.println("O mês escolhido tem " + dias + " dias.");
                break;
            default:
                // 4. Item default para meses inexistentes
                System.out.println("Mês inválido! Por favor, insira um mês correto.");
        }
        
        // Fechando o scanner
        scanner.close();
    }


}


