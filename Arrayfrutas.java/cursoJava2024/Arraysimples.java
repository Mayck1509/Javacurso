package cursoJava2024;

public class Arraysimples {

	public static void main(String[] args) {
      //criando um array de supermercado(lista de compras);
		String[]mercado = {"arroz", "açucar", "danone", "cafe", "leite", "pão"};
		
		//exibindo apenas o terceiro item da lista:
		System.out.println("Item Selecionado: "+ mercado[3]);//Danone!
		//todo array começa com zero!
		
		//exibindo todos os itens do array
		for (int i = 0; i < mercado.length; i++) {
		System.out.println(mercado [i]);
		
		
		}
		
	}

}
