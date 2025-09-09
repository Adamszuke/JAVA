package BI3.EX.Aula2;

public class funcionario {
    public String nome;
    public double salario;
    public double imposto;
    public double porcentagem;
    public double newSalario;

    public static double novoSalario(double salario){
        return salario;
    }

    public static void aumentarSalario(double porcentagem, double salario){
        salario = salario * (1 + (porcentagem/100));
    }

    public static void calcularImposto(double imposto, double salario){
        salario = salario * (imposto/100);
    }
    @Override
    public String toString(){
        return String.format(   
                                "Nome: %s" + 
                                "\nNovo salário: R$%.2f",
                                nome, salario
                            );
    }
}
