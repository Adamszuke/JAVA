package BI4.Aula3.Banco;

public class ContaPoupanca extends Conta{
    @Override
    int getTaxa(){
        return this.total * 3;
    }    
}
