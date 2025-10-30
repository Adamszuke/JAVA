package BI4.Aula4.Tarefa.T1;

public class RelatorioVendas implements Exportavel {
    @Override
    public String exportar() {
        StringBuilder sb = new StringBuilder();
        sb.append(cabecalho()).append("\n");
        sb.append("id,produto,quantidade,preco\n");
        sb.append("1,Caneta,10,1.5\n");
        sb.append("2,Caderno,5,8.0\n");
        return sb.toString();
    }
}
