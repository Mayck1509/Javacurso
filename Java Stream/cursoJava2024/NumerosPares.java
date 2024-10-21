package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerosPares {

	public static void main(String[] args) {
        // Lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Lista para armazenar os números pares
        List<Integer> numerosPares = new ArrayList<>();

        // Filtrando números pares
        for (int num : numeros) {
            if (num % 2 == 0) {
                numerosPares.add(num);
            }
        }

        // Exibindo os números pares
        System.out.println(numerosPares);
    }
	
}
