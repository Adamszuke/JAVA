package BI4.Aula4.Tarefa.T1;

public interface Exportavel {
    String exportar();

    default String cabecalho() {
        return "---EXPORT---";
    }
}
