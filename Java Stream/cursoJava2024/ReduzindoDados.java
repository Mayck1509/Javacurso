package cursoJava2024;

import java.util.Arrays;
import java.util.List;

public class ReduzindoDados {

	 public static void main(String[] args) {
	        // Lista de números
	        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	        // Calculando a soma usando reduce
	        int soma = numeros.stream()
	                          .reduce(0, Integer::sum);

	        // Exibindo a soma
	        System.out.println("Soma: " + soma);
	    }
	
}
