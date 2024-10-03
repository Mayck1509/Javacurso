package cursoJava2024;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SortearPessoas {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		String nome; //Variável para guardar cada nome digitado
		
		System.out.println("Digite os nomes das pessoas [ou 'sair' para encerrar]: ");
		
		while(true) {
			System.out.println("Digite o nome: ");
			nome = Scanner.nextLine();
			
			if (nome.equalsIgnoreCase("sair"))
				break;
			
		}
     
		if( !nome.trim().isEmpty()) {
			nomes.add(nome);
		}else {
			System.out.println("Nome Invalido, Tente Novamente!");
		}
	 //Verificar se existem nomes da lista:
	 if (nome.isEmpty() ) {
		 System.out.println("Nenhum nome foi inserido!");
	 }else {
		 //sorteio:
		 Random Random = new Random();
		 int indiceSorteado = Random.nextInt(nomes.size());
		 String nomeSorteado = nomes.get(indiceSorteado);
		 
		 //exibe o nome sorteado:
		 System.out.println("A pessoa sorteada foi: "+ nomeSorteado);
	 }
	 
	 Scanner.close();
		
		
		
		
		
		
		
		
		
		
	}

}
