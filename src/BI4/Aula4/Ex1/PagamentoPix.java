public class PagamentoPix implements Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println(this.recibo(valor));
    }
}
