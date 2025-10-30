package BI4.Aula4.Tarefa.T1;

public class SmsNotificador implements Notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("[SMS] Para: " + destino + " | Mensagem: " + mensagem);
    }
}
