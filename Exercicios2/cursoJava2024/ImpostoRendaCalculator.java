package cursoJava2024; 

import java.util.Scanner;

public class ImpostoRendaCalculator {

	 // Método para calcular o Imposto de Renda
    public static double calcularImpostoRenda(double salario) {
        double imposto;

        // Definição das faixas de salário e suas respectivas alíquotas
        if (salario <= 1903.98) {
            imposto = 0.0; // Isento
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075; // 7.5%
        } else if (salario <= 3751.05) {
            imposto = (salario - 2826.65) * 0.15 + 93.66; // 15%
        } else if (salario <= 4664.68) {
            imposto = (salario - 3751.05) * 0.225 + 270.29; // 22.5%
        } else {
            imposto = (salario - 4664.68) * 0.275 + 552.91; // 27.5%
        }

        return imposto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitar o salário do usuário
                System.out.print("Digite seu salário (em R$): ");
                double salario = scanner.nextDouble();

                // Verificar se o valor é válido
                if (salario < 0) {
                    System.out.println("O salário deve ser um valor positivo. Tente novamente.");
                    continue;
                }

                // Calcular o Imposto de Renda
                double imposto = calcularImpostoRenda(salario);
                System.out.printf("O Imposto de Renda a ser pago é: R$ %.2f%n", imposto);

            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next(); // Limpa o buffer
            }

            // Perguntar se o usuário deseja calcular novamente
            System.out.print("Deseja calcular novamente? (s/n): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        // Fechar o scanner
        scanner.close();
        System.out.println("Obrigado por usar o calculador de Imposto de Renda!");
    }
}
