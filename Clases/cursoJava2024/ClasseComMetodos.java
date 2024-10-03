package cursoJava2024;

public class ClasseComMetodos {
	
	//Método 01: calcula a soma de 2 numeros:
	public int soma( int a, int b ) {
		return a + b;
	}
	
	//método 02: verificar se 1 numero é par:
	public boolean ehpar(int numero) {
		return numero % 2 == 0;
	}
	
	//método 03: inverter uma string
	public static String

	public static void main(String[] args) {
		//Istanciando a classe:
		ClasseComMetodos utilidades = new ClasseComMetodos();
		
		
		//Chanmando os metodos
		System.out.println("A soma de 5 e 3 é: " + utilidades.soma(5, 3));
		System.out.println("O numero 19 é par?: "+utilidades.ehpar(19));
		System.out.println("");
		
		
		
	
	}
}