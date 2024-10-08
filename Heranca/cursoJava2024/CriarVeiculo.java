package cursoJava2024;

public class CriarVeiculo {

	public static void main(String[] args) {
        Carro Carro1 = new Carro("Chevy Impala" , "Chevrolet", 1967, 4);
        Carro Carro2 = new Carro("dodge super charger" , "dodge" , 1970, 2);
        Carro Carro3 = new Carro("SSC Tuatara" , "SSC North America" , 2020, 2);
        
        
        //exibir o Carro:
        System.out.println("Detalhes do carro 1");
        Carro1.exibirDetalhes();
        System.out.println("-----------------------------------");
        System.out.println("Detalhes do carro 2");
        Carro2.exibirDetalhes();
        System.out.println("-----------------------------------");
        System.out.println("Detalhes do carro 3");
        Carro3.exibirDetalhes();
	}

}
