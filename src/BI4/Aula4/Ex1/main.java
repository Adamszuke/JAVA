public class main {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao(0.5);
        cartao.pagar(1000);
        Pagamento pix = new PagamentoPix();
        System.out.println("--------------------------");
        pix.pagar(500);

        
    }
}