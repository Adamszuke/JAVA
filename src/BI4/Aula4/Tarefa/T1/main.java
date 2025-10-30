package BI4.Aula4.Tarefa.T1;

public class main {
    public static void main(String[] args) {
        Notificador email = new EmailNotificador();
        Exportavel vendas = new RelatorioVendas();
        RelatorioService service1 = new RelatorioService(email, vendas);
        service1.gerarEEnviar("cliente@exemplo.com");

        System.out.println();

        Notificador sms = new SmsNotificador();
        Exportavel estoque = new RelatorioEstoque();
        RelatorioService service2 = new RelatorioService(sms, estoque);
        service2.gerarEEnviar("+5511999999999");
    }
}
