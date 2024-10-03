package cursoJava2024; 



public class ArrayFrutas {

		   private String nome;
		    private String cor;
		    private double peso; // em gramas

		    // Construtor da Classe Frutas:
		    public ArrayFrutas(String nome, String cor, double peso) {
		        this.nome = nome;
		        this.cor = cor;
		        this.peso = peso;
		    }

		    // Métodos para acessar os atributos:
		    // Acessando o nome:
		    public String getNome() {
		        return nome;
		    }

		    // Acessando a cor:
		    public String getCor() {
		        return cor;
		    }

		    // Acessando o peso:
		    public double getPeso() {
		        return peso;
		    }

		    // Método para imprimir as informações das frutas:
		    public void imprimirInfos() {
		        System.out.println("Fruta: " + nome + ", Cor: " + cor + ", Peso: " + peso + " g");
		    }

		    // Classe principal:
		    public static void main(String[] args) {
		        // Criação de um array de objetos da classe ArrayFrutas:
		        ArrayFrutas[] arrayFrutas = {
		            new ArrayFrutas("Maçã", "vermelha", 150.5),
		            new ArrayFrutas("Banana", "amarela", 125.5),
		            new ArrayFrutas("Pera", "verde", 190.5),
		            new ArrayFrutas("Uva", "roxa", 200.5)
		        };

		        // Exibindo informações de cada fruta:
		        System.out.println("Informações sobre as frutas: ");
		        for (int i = 0; i < arrayFrutas.length; i++) {
		            arrayFrutas[i].imprimirInfos();
		        }
		    }
		}