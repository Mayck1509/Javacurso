package cursoJava2024;

import java.util.Scanner;

public class CalculadoraIMC {

	 // Método para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para classificar o IMC
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso.";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal.";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso.";
        } else {
            return "Obesidade.";
        }
    }

    // Método para calcular o peso ideal
    public static double[] calcularPesoIdeal(double altura) {
        double pesoMinimo = 18.5 * (altura * altura);
        double pesoMaximo = 24.9 * (altura * altura);
        return new double[]{pesoMinimo, pesoMaximo};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitar o peso e a altura do usuário
                System.out.print("Digite seu peso (em kg): ");
                double peso = scanner.nextDouble();
                System.out.print("Digite sua altura (em metros): ");
                double altura = scanner.nextDouble();

                // Verificar se os valores são válidos
                if (peso <= 0 || altura <= 0) {
                    System.out.println("Peso e altura devem ser valores positivos. Tente novamente.");
                    continue;
                }

                // Calcular o IMC
                double imc = calcularIMC(peso, altura);
                System.out.printf("Seu IMC é: %.2f%n", imc);
                System.out.println("Classificação: " + classificarIMC(imc));

                // Calcular e exibir o peso ideal
                double[] pesoIdeal = calcularPesoIdeal(altura);
                System.out.printf("Para uma altura de %.2f metros, o peso ideal está entre %.2f kg e %.2f kg.%n",
                        altura, pesoIdeal[0], pesoIdeal[1]);

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
        System.out.println("Obrigado por usar o calculador de IMC!");
    }
}
