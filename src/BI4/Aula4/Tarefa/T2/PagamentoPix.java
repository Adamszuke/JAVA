package BI4.Aula4.Tarefa.T2;

public class PagamentoPix implements Pagamento {

    public PagamentoPix() {
    }

    @Override
    public void pagar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        System.out.println(recibo(valor));
    }

}
