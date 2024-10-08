package cursoJava2024;

public class Moto extends Veículo{
    private boolean temBagageiro;
    
	public Moto(String marca, String modelo, int ano, boolean temBagageiro) {
	     super(marca, modelo, ano);
	     this.temBagageiro = temBagageiro;
	
	
	     
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("tem Bagageiro: " + (temBagageiro ? "Sim" : "Não"));
	}
	
	
	
}
