package cursoJava2024;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
        String texto = "Bem vindo ao curso de Java,";
        String texto2 = "Vamos apender sobre String ?";
        
        
        //1.Comprimento da String:
        System.out.println("Comprimento da String: "+texto.length());
        
        //2.Concatenar String:
        String textoCompleto = texto + " " +texto2;
        System.out.println("texto completo: " + textoCompleto);
//        String nome2 = "Mayck";
//        String sobrenome = " Cardoso";
//        System.out.println("Nome2 + sobrenome");
        
        //3.Converter para MAIÚSCULAS E minúsculas:
        System.out.println(" MAIÚSCULAS: " + texto.toUpperCase());
        System.out.println("minúsculas "+ texto.toLowerCase());
        
        //4.Substituir uma parte da String:
        String novotexto = texto.replace("Java", "Mayck");
        System.out.println("texto após substituição:" + novotexto); 
        
        //5.Buscar por uma SubString:
        int posição = texto.indexOf("curso");
        System.out.println("Posição da palavra 'curso': "+ posição);
        
        //6.verificar se uma String começa ou termina com 1 subString:
        System.out.println("Começa com 'bem': " + texto.startsWith("bem"));
        System.out.println("Termina com 'Java': " + texto.endsWith("Java"));
        
        
        //7.Dividir String
        String[] palavras = textoCompleto.split(" ");
        System.out.println("Palavras No Texto Completo:");
         for (String palavra : palavras ) {
        	 System.out.println(palavra);
        	 
        	 //8.Removaer espaçços em branco:
        	 String textoComEspaços =  "     texto com espaços    ";
        	 System.out.println("texto sem espaços: '"+textoComEspaços.trim() + "'"); 
         }
	}

}
