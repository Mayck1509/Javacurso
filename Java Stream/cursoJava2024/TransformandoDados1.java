package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformandoDados1 {

	public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Transformando os números em seus quadrados
        List<Integer> quadrados = numeros.stream()
                                          .map(num -> num * num)
                                          .collect(Collectors.toList());

        // Exibindo os quadrados
        System.out.println(quadrados);
        
        
        
    }
	
}
