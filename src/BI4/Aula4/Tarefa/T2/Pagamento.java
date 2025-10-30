package BI4.Aula4.Tarefa.T2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public interface Pagamento {
    void pagar(double valor);

    default String recibo(double valor) {
        double taxa = taxaAplicada();
        double taxaValor = valor * taxa;
        double total = valor + taxaValor;
        String meio = this.getClass().getSimpleName();
        String valorF = String.format(Locale.getDefault(), "R$ %.2f", valor);
        String taxaF = String.format(Locale.getDefault(), "R$ %.2f (%.2f%%)", taxaValor, taxa * 100);
        String totalF = String.format(Locale.getDefault(), "R$ %.2f", total);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return String.format("Recibo\nMeio: %s\nValor: %s\nTaxa: %s\nTotal: %s\nEmitido: %s", meio, valorF, taxaF, totalF, timestamp);
    }

    default double taxaAplicada() {
        return 0.0;
    }
}
