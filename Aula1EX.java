import java.util.Scanner;
public class Aula1EX {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 1");

        System.out.println("Informe sua idade: ");
        int idade =  scanner.nextInt();
        if(idade >= 18){
            // Atalho = sout
            System.out.println("Você é maior de idade");
        }

        System.out.println("Exercício 2");

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2)
        {
            System.out.println( num1 + " é maior do que " + num2);
        }
        else if (num1 == num2)
        {
            System.out.println("Os números são iguais");
        }
        else{
            System.out.println(num2 + " é maior do que " + num1);
        }

    }
}
