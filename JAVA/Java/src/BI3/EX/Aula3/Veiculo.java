package BI3.EX.Aula3;

public class Veiculo {
    public String marca;
    public String modelo;
    public double velocidadeAtual;

    public double acelerar(double acelerar){
        return velocidadeAtual + acelerar;
    }

    public double frear(double frear){
        return velocidadeAtual - frear;
    }

    public double parar(){
        return velocidadeAtual = 0;
    }
}
