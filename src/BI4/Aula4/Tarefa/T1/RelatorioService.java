package BI4.Aula4.Tarefa.T1;

public class RelatorioService {
    private final Notificador notificador;
    private final Exportavel exportavel;

    public RelatorioService(Notificador notificador, Exportavel exportavel) {
        this.notificador = notificador;
        this.exportavel = exportavel;
    }

    public void gerarEEnviar(String destino) {
        String conteudo = exportavel.exportar();
        notificador.enviar(destino, conteudo);
    }
}
