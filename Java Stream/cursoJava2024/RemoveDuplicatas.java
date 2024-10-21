package cursoJava2024;
//Exercicio para remover duplicatas(distint)
//apaga valores repetidos em uma lista de inteiros
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatas {

	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,1,2,2,3,3,4,4,5,5);
		
        //Removendo Duplicatas:
        numeros.stream().distinct().forEach(System.out::println);
        
	}

}
