package BI3.EX.Aula6;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String Titular = sc.nextLine();
        System.out.println("Digite o número da sua conta: ");
        int Numero = sc.nextInt();
        System.out.println("Digite seu saldo inicial: ");
        double Saldo = sc.nextDouble();

        Conta conta = new Conta(Numero, Titular);
        conta.setSaldo(Saldo);
        conta.setTitular(Titular);
        
        

        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Titular da conta: " + conta.getTitular());
        System.out.printf("Saldo atual: R$%.2f %\n", conta.getSaldo());

        System.out.println("Digite o valor do seu primeiro saque: ");
        double Quantia = sc.nextDouble();
        conta.setQuantia(Quantia);


        System.out.print("\nInforme o valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.print("\nInforme o valor para saque: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);
        




        sc.close();
    }
    

}
