package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenandoElementos {

	public static void main(String[] args) {
        // Lista de nomes
        List<String> nomes = Arrays.asList("Carlos", "Ana", "Pedro", "Beatriz", "Fernando");

        // Ordenando os nomes em ordem alfabética
        List<String> nomesOrdenados = nomes.stream()
                                             .sorted()
                                             .collect(Collectors.toList());

        // Exibindo os nomes ordenados
        System.out.println(nomesOrdenados);
    }
	
	
}
