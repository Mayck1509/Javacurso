package cursoJava2024;

public class CopasDoMundo {

	public static void main(String[] args) {
		  // 1. Criando a estrutura básica do programa
        int anoAtual = 2024; // Atualize este valor conforme o ano atual
        int ano;

        // 2. Utilizando a estrutura for, começando em 1930
        for (ano = 1930; ano <= anoAtual; ano += 4) {
            // 3. Considerando os anos de 1942 e 1946 em que não houve copas
            if (ano == 1942 || ano == 1946) {
                continue; // Pula para o próximo ano
            }
            // Imprime o ano da Copa do Mundo
            System.out.println("Copa do Mundo: " + ano);
        }

	}

}
