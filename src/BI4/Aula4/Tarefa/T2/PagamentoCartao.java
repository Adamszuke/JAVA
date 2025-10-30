package BI4.Aula4.Tarefa.T2;

public class PagamentoCartao implements Pagamento {
    private final double taxa;

    public PagamentoCartao(double taxa) {
        if (taxa < 0.0 || taxa > 1.0) {
            throw new IllegalArgumentException("Taxa do cartão deve estar entre 0 e 1.");
        }
        this.taxa = taxa;
    }

    @Override
    public void pagar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        System.out.println(recibo(valor));
    }

    @Override
    public double taxaAplicada() {
        return taxa;
    }
}
