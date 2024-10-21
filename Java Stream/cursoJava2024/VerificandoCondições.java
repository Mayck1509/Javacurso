package cursoJava2024;

import java.util.Arrays;
import java.util.List;


public class VerificandoCondições {

	 public static void main(String[] args) {
	        // Lista de números
	        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50, 60, -5);

	        // Verificações
	        verificarCondicoes(numeros);
	    }

	    private static void verificarCondicoes(List<Integer> numeros) {
	        boolean algumMaiorQue50 = numeros.stream().anyMatch(num -> num > 50);
	        boolean todosPositivos = numeros.stream().allMatch(num -> num > 0);
	        boolean nenhumNegativo = numeros.stream().noneMatch(num -> num < 0);

	        // Exibindo os resultados
	        System.out.println("Resultados das verificações:");
	        System.out.printf("Algum número é maior que 50? %s%n", algumMaiorQue50);
	        System.out.printf("Todos os números são positivos? %s%n", todosPositivos);
	        System.out.printf("Nenhum número é negativo? %s%n", nenhumNegativo);
	    }
	
}
