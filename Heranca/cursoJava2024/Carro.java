package cursoJava2024;

public class Carro extends Veículo {
   private int numeroDePortas;
	
	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
	super(marca,modelo,ano);
	this.numeroDePortas = numeroDePortas;
	
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Numero De Portas:" + numeroDePortas );
	}
	
	
}
