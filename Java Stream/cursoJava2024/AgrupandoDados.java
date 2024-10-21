package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandoDados {

	 public static void main(String[] args) {
	        // Lista de nomes
	        List<String> nomes = Arrays.asList("Ana", "Carlos", "Beatriz", "Pedro", "Fernando");

	        // Agrupando os nomes pelo tamanho
	        Map<Integer, List<String>> nomesAgrupados = nomes.stream()
	                                                          .collect(Collectors.groupingBy(String::length));

	        // Exibindo os nomes agrupados
	        System.out.println(nomesAgrupados);
	    }
	
}
