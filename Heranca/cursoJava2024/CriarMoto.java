package cursoJava2024;

public class CriarMoto {

	public static void main(String[] args) {
        Moto Moto1 = new Moto ("  Kawasaki Ninja H2R" , "Kawasaki", 2015, false );
        Moto Moto2 = new Moto ("Neiman Marcus Limited Edition Fighter" , "Ecosse Cycles" , 2008, false);
        Moto Moto3 = new Moto ("R1250 GS" , "BMW" , 2019, false);
        
        //exibir o Moto:
        System.out.println("Detalhes da Moto 1");
        Moto1.exibirDetalhes();
        System.out.println("-----------------------");
        System.out.println("Detalhes da Moto 2");
        Moto2.exibirDetalhes();
        System.out.println("-----------------------");
        System.out.println("Detalhes da Moto 3");
        Moto3.exibirDetalhes();
	}
	
	
	
	
	
}
