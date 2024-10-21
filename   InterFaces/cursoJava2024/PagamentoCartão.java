package cursoJava2024;

public class PagamentoCartão implements Pagamento {
	private String numeroCartao;
    private String nomeTitular;

    public void PagamentoCartao(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com cartão de crédito.");
    }

    @Override
    public String obterDetalhes() {
        return "Pagamento com cartão de crédito: " + nomeTitular;
    }
}
