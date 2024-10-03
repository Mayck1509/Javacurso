package cursoJava2024;

import java.util.Scanner;

public class IACCalculator {


    // Método para calcular o IAC
    public static double calcularIAC(double altura, double cintura, double pescoço) {
        return (cintura - pescoço) / altura;
    }

    // Método para classificar o IAC
    public static String classificarIAC(double iac) {
        if (iac < 0.1) {
            return "Abaixo do peso.";
        } else if (iac >= 0.1 && iac < 0.3) {
            return "Peso normal.";
        } else if (iac >= 0.3 && iac < 0.5) {
            return "Sobrepeso.";
        } else {
            return "Obesidade.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitar a altura, circunferência da cintura e do pescoço
                System.out.print("Digite sua altura (em metros): ");
                double altura = scanner.nextDouble();
                System.out.print("Digite a circunferência da cintura (em cm): ");
                double cintura = scanner.nextDouble();
                System.out.print("Digite a circunferência do pescoço (em cm): ");
                double pescoço = scanner.nextDouble();

                // Verificar se os valores são válidos
                if (altura <= 0 || cintura <= 0 || pescoço <= 0) {
                    System.out.println("Os valores devem ser positivos. Tente novamente.");
                    continue;
                }

                // Calcular o IAC
                double iac = calcularIAC(altura, cintura, pescoço);
                System.out.printf("Seu IAC é: %.2f%n", iac);
                System.out.println("Classificação: " + classificarIAC(iac));

            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira números válidos.");
                scanner.next(); // Limpa o buffer
            }

            // Perguntar se o usuário deseja calcular novamente
            System.out.print("Deseja calcular novamente? (s/n): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        // Fechar o scanner
        scanner.close();
        System.out.println("Obrigado por usar o calculador de IAC!");
    }
}
