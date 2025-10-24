package BI4.Aula3.Banco;

public class Main {
    public static void main(String[] args) {
        Conta c;
        c = new Contacorrente();
        c.mostrarDados();
        System.out.println(c.getTaxa());

        c = new ContaPoupanca();
        c.mostrarDados();
        System.out.println(c.getTaxa());
    }
}
