package cursoJava2024;

public class PagamentoPayPal implements Pagamento{
	 private String email;

	    public PagamentoPayPal(String email) {
	        this.email = email;
	    }

	    @Override
	    public void processarPagamento(double valor) {
	        System.out.println("Processando pagamento de R$ " + valor + " com PayPal.");
	    }

	    @Override
	    public String obterDetalhes() {
	        return "Pagamento com PayPal: " + email;
	    }
}
