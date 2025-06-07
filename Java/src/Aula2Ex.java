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
        
        do {
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Digite um número: ");
                    num1 = scanner.nextInt();
                    break;
            
                default:
                    break;
            }
        }
        while (opt != 3);
    }
}
