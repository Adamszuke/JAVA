package BI4.Aula4.Tarefa.T2;

class Main {
    public static void main(String[] args) {
        Pagamento p;

        // Pagamento com cartão (taxa 2.9%)
        p = new PagamentoCartao(0.029);
        p.pagar(100.00);

        System.out.println();

        // Pagamento com Pix (sem taxa)
        p = new PagamentoPix();
        p.pagar(100.00);

        System.out.println();

        // Exemplos de validação (captura exceções)
        try {
            p = new PagamentoCartao(1.5); // taxa inválida
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            p = new PagamentoPix();
            p.pagar(-10); // valor inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
