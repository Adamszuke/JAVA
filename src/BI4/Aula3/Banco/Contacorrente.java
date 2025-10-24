package BI4.Aula3.Banco;

public class Contacorrente extends Conta{

    @Override
    int getTaxa(){
        return this.total * 2;
    }
    
}
