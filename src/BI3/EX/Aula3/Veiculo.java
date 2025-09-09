package BI3.EX.Aula3;

public class Veiculo {
    public String marca;
    public String modelo;
    public double velocidadeAtual;
    public double acelerar;
    public double frear;

    public void acelerar(double acelerar){
        velocidadeAtual += acelerar;
        
    }

    public void frear(double frear){
        
        if (frear > velocidadeAtual){
            velocidadeAtual = 0;
        } else{
            velocidadeAtual -= frear;
        }
    }

    public void parar(double velocidadeAtual){
        velocidadeAtual = 0;
    }
}
