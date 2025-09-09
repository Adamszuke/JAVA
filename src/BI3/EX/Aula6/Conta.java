package BI3.EX.Aula6;

public class Conta {
    private int Numero;
    private String Titular;
    private double Saldo;
    private double Quantia;
    private static final double TAXA_SAQUE = 5.00;

    public Conta(int Numero, String Titular, double Saldo){
        this.Numero = Numero;
        this.Titular = Titular;
        this.Saldo = Saldo;
    }
    public Conta(int Numero, String Titular){
        this.Numero = Numero;
        this.Titular = Titular;
        this.Saldo = 0;
    }

    public int getNumero(){
        return Numero;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular){
        this.Titular = Titular;
    }

    public double getSaldo(){
        return Saldo;
    }

    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }

    public double getQuantia(){
        return Quantia;
    }

    public void setQuantia(double Quantia){
        this.Quantia = Quantia;
    }

    public void saque(double Quantia) {
        Saldo -= Quantia + TAXA_SAQUE;
    }

    public void deposito(double Quantia) {
        if (Quantia > 0) {
            Saldo += Quantia;
        }
    }
}
