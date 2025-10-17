package BI4.Aula2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();
        Quadrado q = new Quadrado(lado);
        System.out.println("Área do quadrado: " + q.area());

        System.out.print("Digite a base do triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = sc.nextDouble();
        Triangulo t = new Triangulo(base, altura);
        System.out.println("Área do triângulo: " + t.area());

        sc.close();
    }
}
