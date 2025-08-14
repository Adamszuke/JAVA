package BI3.EX.Aula3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        int opt;
        double acelerar;
        double frear;

        System.out.println("Digite a marca do carro: ");
        veiculo.marca = sc.nextLine();
        System.out.println("Digite o modelo do veiculo: ");
        veiculo.modelo = sc.nextLine();
        System.out.println("Digite quantas portas o carro tem: ");
        carro.portas = sc.nextInt();
        System.out.println("Digite a velocidade Atual do veículo: ");
        veiculo.velocidadeAtual = sc.nextDouble();

        opt();
        opt = sc.nextInt();
        
        do {
            switch (opt) {
            case 1:
                System.out.println("Digite a velocidade que você está acelerando: ");
                acelerar = sc.nextDouble();
                veiculo.acelerar(acelerar);
                System.out.printf("Você está a %.2f Km/h",veiculo.velocidadeAtual);

                opt();
                opt = sc.nextInt();
               
                
                break;
            case 2:
                System.out.println("Digite a velocidade que você está freiando");
                frear = sc.nextDouble();
                veiculo.frear(frear);
                System.out.printf("Você está a  %.2f Km/h ",veiculo.velocidadeAtual);
                
                opt();
                opt = sc.nextInt();
                break;

            case 3:
                veiculo.parar(veiculo.velocidadeAtual);
                System.out.println("Você parou!");

                opt();
                opt = sc.nextInt();
                break;
            case 4: 
                carro.buzinar();

                opt();
                opt = sc.nextInt();
                break;
            default:
                break;
        }
        } while (opt != 5);
        

          
    }    
    public static void opt(){
        System.out.println("\nO que você deseja fazer?" +
                "\n1 - Acelerar" +
                "\n2 - Frear" +
                "\n3 - Parar" +
                "\n4 - Buzinar" + 
                "\n5 - Encerrar");  
    }
      
}
