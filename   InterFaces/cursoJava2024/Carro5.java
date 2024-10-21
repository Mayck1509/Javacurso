package cursoJava2024;

public class Carro5 implements Veiculo1{
   //construtor sem parametros (necessário para a linha 'new Carro')
	public Carro5() {
		
	}
	@Override
	public void acelerar() {
		System.out.println("O carro está acelerando...");
	}
	@Override
	public void freiar() {
		System.out.println("O carro está freiando...");
	}
}
