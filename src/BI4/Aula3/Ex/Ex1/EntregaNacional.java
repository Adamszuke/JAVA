package BI4.Ex.Ex1;

public class EntregaNacional extends Entrega{

    @Override
    double calcularValorFrete(){
        return distancia * 1.5;
    }

    
}
