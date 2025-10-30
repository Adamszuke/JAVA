package BI4.Aula4.Tarefa.T1;

public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("[EMAIL] Para: " + destino + " | Mensagem: " + mensagem);
    }
}
