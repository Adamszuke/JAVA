import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public interface Pagamento {

    void pagar(double valor);
    default String recibo(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Error");
        }
        String meio = getClass().getSimpleName();
        double taxa = taxaAplicada();
        if (taxa<0 || taxa > 1) {
            throw new IllegalArgumentException("Taxa deve estar entre 0 e 1");
        } 
        String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd: HH:mm:ss"));
        double total = valor + valor * taxa;
        return "+++ RECIBO === \n" + 
                "Meio: " + meio + "\n" +
                "Data: " + data + "\n" + 
                "Valor: R$" + String.format("%.2f", valor)+ "\n" + 
                "Total: R$ " + String.format("%.2f", total)+ "\n";
    }

    default double taxaAplicada(){
        return 0.0;
    }
    
}
