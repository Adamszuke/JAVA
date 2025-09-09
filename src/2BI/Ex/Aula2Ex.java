package Ex;
import java.util.Scanner;
public class Aula2Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int soma = 0;
        System.out.println("Atividade 1");
        for (n = 1; n <= 10; n++)
        {
            System.out.println(n);
        }   

        System.out.println("Atividade 2");

        while (n <= 100) {
            soma += n;
            n++;
        }
        System.out.println(soma);

        System.out.println("Atividade 3");

        int opt;
        int num1;
        int num2;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();


        System.out.println("Menu de Opções:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Sair");
        do {
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Saindo do menu.");
                    break;
            
                default:
                    break;
            }
            System.out.println("Menu de Opções:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
        }
        while (opt != 3);

        System.out.println("Atividade 4");

        System.out.println("Digite um número: ");
        int num3 = scanner.nextInt();

        for (n = 2; n <= 10; n++)
        {
            System.out.println(num3 * n);
        }

        System.out.println("Atividade 5");

        n = 10;
        while (n > 0) {
            System.out.println(n);
            n = n -1;
            
        }

        System.out.println("Atividade 6");

        int num4;

        do {
            System.out.println("Digite um número");
            num4 = scanner.nextInt();
        } while (num4 > 10 || num4 < 1);

        System.out.println("Atividade 7");
        
        
        for (n = 1; n <= 10; n++)
        {
            System.out.println(n * 2);
        }

        System.out.println("Atividade 8");

        int num5 = scanner.nextInt();
        n = 1;
        int fatorial = 1;

        while (n < num5) {
            fatorial = fatorial + (fatorial * (num5 - 1));
            num5 --;
            System.out.println(fatorial);
        }

        System.out.println("Atividade 9");

        String pas;

        do {
            System.out.println("Digite sua senha: ");
            pas = scanner.nextLine();

            if (!pas.equals("123456")) {
                System.out.println("Senha incorreta, digite novamente");
            }

        } while (!pas.equals("123456"));

        System.out.println("Senha correta");

        System.out.println("Atividade 10");
        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        


        
    }
}
