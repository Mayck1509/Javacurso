package cursoJava2024;

public class Bike implements VeiculoDuasRodas{
	  //construtor sem parametros (necessário para a linha 'new Bike')
		public Bike() {
			
		}
		@Override
		public void acelerar() {
			System.out.println("A Bike está acelerando...");
		}
		@Override
		public void freiar() {
			System.out.println("A Bike está freiando...");
		}
}
