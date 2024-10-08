package cursoJava2024;

import java.util.Scanner;

public class CrudArray {
	// Array para armazenar nomes e idades:
	static String[] nomes = new String[10];
	static int[] idades = new int[10];
	static int contador = 0;

	public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);
    int opcao;
    
    do {
    	System.out.println("\n--- MENU ---");
    	System.out.println("1. Adicionar Usuário");
    	System.out.println("2. Exibir Usuário");
    	System.out.println("3.Atualizar Usuário");
    	System.out.println("4.Deletar Usuário");
    	System.out.println("5.Sair");
    	System.out.println("Escolha uma opção");
    	opcao = Scanner.nextInt();
    	
    	switch(opcao) {
    	case 1:
    		AdicionarUsuario(Scanner);
    			break;
    			
    	case 2:
    		exibirUsuarios();
    			break;
    				
    	case 3:
    		atualizarUsuario(Scanner);
    		    break;
    		    
    	case 4:
    		deletarUsuário(Scanner);
    		    break;
    		    
    	case 5:
    		System.out.println("Saindo do Sistema...!");
    		    break;
    		    
    	default:
    		System.out.println("Opção Invalida");
    		
  				
    		}
    	}
    	while (opcao != 5);
    	Scanner.close();
    	
    
    }

	// criar todos os métodos:
	// Adicionar Usuario:
	public static void AdicionarUsuario(Scanner Scanner) {
		if (contador < nomes.length) {
			// pegando o nome do usuário
			System.out.println("Digite o Nome: ");
			String nome = Scanner.next();
			// Pegando a idade do usuario:
			System.out.println("Digite a idade: ");
			int idade = Scanner.nextInt();
			// adicionando as variáveis dentro do array:
			nomes[contador] = nome;
			idades[contador] = idade;
			contador++;
			System.out.println();
			System.out.println("Usuário adicionado com sucesso");
		} else {
			System.out.println("Limite de usuário atingido! ");
	  }

	}

	//Exibir Usuário:
	public static void exibirUsuarios() {
		if (contador == 0) {
			System.out.println("Nenhum usuário cadastrado! ");
		} else {
			for (int i = 0; i < contador; i++) {
System.out.println((i + 1) +"Nome: "+ nomes[i] +" Idade: "+idades[i]);
			}
		}
	}
	
	//Atualizar Usário:
	public static void atualizarUsuario(Scanner Scanner) {
		System.out.println("Digite o numero do usuario a ser atualizado: ");
		int index = Scanner.nextInt() - 1;
		
		if ( index >= 0 && index < contador ) {
			
			System.out.println("Digite o novo nome: ");
			String nome = Scanner.next();
					System.out.println("Digite a nova idade ");
					int idade = Scanner.nextInt();
			//jogando nome e idade novos no array:
					nomes[index] = nome;
					idades[index] = idade;
			System.out.println("Usuário atualizado com sucesso!");
			
		}else {
			System.out.println("Usuário não encontrado!");
		}
		
		
	}
	
	//Deletar:
	public static void deletarUsuário(Scanner Scanner) {
		
		System.out.println("Digite o número do usuário a ser deletado: ");
		int index = Scanner.nextInt() - 1;
		
		if (index >= 0 && index < contador ) {
			for (int i = index; i < contador -1; i++) {
				nomes[i] = nomes[i+1];
				idades[i] = idades[i+1];
			}
			nomes[contador -1] = null;
			idades[contador -1] = 0;
			System.out.println("Usuário deletado com sucesso!");
		}else {
			System.out.println("Usuario não localizado!");
		}
		
		
	}
	
	
}

