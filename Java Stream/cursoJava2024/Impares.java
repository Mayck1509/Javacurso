package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Impares {

	public static void main(String[] args) {
        // Lista de numeros não inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Lista para armazenar os números impares
        List<Integer> Impares = new ArrayList<>();

        // Filtrando números impares
        for (int num : numeros) {
            if (num % 2 == 1) {
                Impares.add(num);
            }
        }

        // Exibindo os números pares
        System.out.println(Impares);
    }
	
}
