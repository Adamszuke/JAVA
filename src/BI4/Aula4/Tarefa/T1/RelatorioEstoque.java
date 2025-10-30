package BI4.Aula4.Tarefa.T1;

public class RelatorioEstoque implements Exportavel {
    @Override
    public String exportar() {
        StringBuilder sb = new StringBuilder();
        sb.append(cabecalho()).append("\n");
        sb.append("{");
        sb.append("\"estoque\":[");
        sb.append("{\"id\":1,\"produto\":\"Caneta\",\"quantidade\":10},");
        sb.append("{\"id\":2,\"produto\":\"Caderno\",\"quantidade\":5}");
        sb.append("]}");
        return sb.toString();
    }
}
