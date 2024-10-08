package cursoJava2024;

public class Veículo {

    protected String marca;
    protected String modelo;
    protected int ano;
    
    //Método Construtor do Veículo:
    public Veículo(String marca, String modelo, int ano) {
    	this.marca = marca;
    	this.modelo = modelo;
    	this.ano = ano;
    	
    }
    
    public void exibirDetalhes() {
    	System.out.println("Marca: " + marca);
    	System.out.println("Modelo: " + modelo);
    	System.out.println("Ano: " + ano);
    
    
    
	}

}
