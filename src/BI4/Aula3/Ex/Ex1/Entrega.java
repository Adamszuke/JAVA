package BI4.Ex.Ex1;

public abstract class Entrega {
    protected int codigo = 12345678;
    protected double frete = 15;
    protected double distancia = 100;

    abstract double calcularValorFrete();

    public String exibirResumo(){
        return "Código: " + codigo + ", Frete: R$" + frete;
    }
}
