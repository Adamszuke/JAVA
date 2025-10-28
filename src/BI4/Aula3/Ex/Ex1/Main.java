package BI4.Ex.Ex1;


public class Main {
    public static void main(String[] args) {
        Entrega e;

        e = new EntregaLocal();
        System.out.println(e.calcularValorFrete());

        e = new EntregaNacional();
        System.out.println(e.calcularValorFrete());

        System.out.println(e.exibirResumo());

        
    }
}
