package BI3.EX.Aula3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();

        System.out.println("Digite o modelo do carro: ");
        veiculo.marca = sc.nextLine();
        System.out.println("Digite o modelo do veiculo: ");
        veiculo.modelo = sc.nextLine();
        
    }    
}
