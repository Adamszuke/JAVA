import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);
        Fibonacci fibonacci= new Fibonacci();

        System.out.println("Informe um numero para o calculo Fibonacci: ");
        numero = sc.nextInt();
        System.out.println();
    }
}
