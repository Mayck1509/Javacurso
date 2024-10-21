package cursoJava2024;

public class ExecutaIterFace {
	
	 public static void main(String[] args) {
		 
   Veiculo1 Carro = new Carro5();
   VeiculoDuasRodas Bike = new Bike();
   
  
	
  //Usando o carro:
   Carro.acelerar();
   Carro.freiar();
   
   //Usando a Bike:
   Bike.acelerar();
   Bike.freiar();
}
}