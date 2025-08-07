package Aula2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        funcionario funcionario;
        funcionario = new funcionario();


        System.out.print("Digite seu nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Digite seu salário: ");
        funcionario.salario = sc.nextInt();
        System.out.print("Digite o imposto em %: ");
        funcionario.imposto = sc.nextInt();

        System.out.println("Digite seu novo salário: ");
        funcionario.novoSalario(funcionario.salario = sc.nextDouble());
        
        System.out.println("Digite quanto seu salário aumentou em %: ");
        funcionario.aumentarSalario(funcionario.porcentagem = sc.nextDouble(), funcionario.salario);


        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());

        
        
    }
        
}
