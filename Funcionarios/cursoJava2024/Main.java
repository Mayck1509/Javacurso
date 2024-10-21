package cursoJava2024;

//Main.java
public class Main {

	 public static void main(String[] args) {
	        Funcionario funcionario1 = new Funcionario("João");
	        Gerente gerente1 = new Gerente("Maria");

	        System.out.println("Funcionário: " + funcionario1.getNome());
	        System.out.println(gerente1.verificarCargo());
	    }
	}
