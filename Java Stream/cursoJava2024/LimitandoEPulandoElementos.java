package cursoJava2024;

import java.util.Arrays;
import java.util.List;

public class LimitandoEPulandoElementos {

	public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Exibindo os três primeiros elementos
        System.out.println("Três primeiros elementos:");
        numeros.stream()
               .limit(3)
               .forEach(System.out::println);

        // Pulando os dois primeiros elementos e exibindo o restante
        System.out.println("\nPulando os dois primeiros elementos:");
        numeros.stream()
               .skip(2)
               .forEach(System.out::println);
    }
	
}
