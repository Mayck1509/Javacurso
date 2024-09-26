package cursoJava2024;

import java.util.Scanner;

public class Relogio {
	
	public static void main(String[] args) {
		 int hora = obterHora();
	        exibirSaudacao(hora);
	    }

	    // Método para obter a hora do usuário
	    private static int obterHora() {
	        Scanner scanner = new Scanner(System.in);
	        int hora = -1; // Inicializa com um valor inválido

	        while (hora < 0 || hora > 23) {
	            System.out.print("Digite a hora do dia (0-23): ");
	            if (scanner.hasNextInt()) {
	                hora = scanner.nextInt();
	                if (hora < 0 || hora > 23) {
	                    System.out.println("Hora inválida! Por favor, insira uma hora entre 0 e 23.");
	                }
	            } else {
	                System.out.println("Entrada inválida! Por favor, insira um número.");
	                scanner.next(); // Limpa a entrada inválida
	            }
	        }
	        
	        scanner.close();
	        return hora;
	    }

	    // Método para exibir a saudação com base na hora
	    private static void exibirSaudacao(int hora) {
	        switch (hora) {
	            case 6: case 7: case 8: case 9: case 10: case 11:
	                System.out.println("Bom dia vamo acordar!");
	                break;
	            case 12: case 13: case 14: case 15: case 16: case 17:
	                System.out.println("Boa tarde!");   
	                break;
	            case 18: case 19: case 20: case 21: case 22: case 23:
	                System.out.println("Boa noite!");
	                break;
	            case 0: case 1: case 2: case 3: case 4: case 5:
	                System.out.println("Madrugada vai dormir!");
	                break;
	        }
	    }
	}
