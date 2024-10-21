package cursoJava2024;

public class main1 {
	 public static void main(String[] args) {
	        Pagamento pagamentoCartao = new PagamentoCartão();
	        pagamentoCartao.processarPagamento(100.0);
	        System.out.println(pagamentoCartao.obterDetalhes());

	        Pagamento pagamentoPayPal = new PagamentoPayPal("joao.silva@email.com");
	        pagamentoPayPal.processarPagamento(50.0);
	        System.out.println(pagamentoPayPal.obterDetalhes());
	    }
}
