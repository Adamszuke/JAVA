package BI3.Aulas.Aula1;
import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.print("Lado a: ");
        x.A = sc.nextDouble();
        System.out.print("Lado b: ");
        x.B = sc.nextDouble();
        System.out.print("Lado c: ");
        x.C = sc.nextDouble();

        System.out.println("Area X = " + x.calcularArea());

        System.out.print("Lado a: ");
        y.A = sc.nextDouble();
        System.out.print("Lado b: ");
        y.B = sc.nextDouble();
        System.out.print("Lado c: ");
        y.C = sc.nextDouble();

        System.out.println("Area Y = " + y.calcularArea());

        sc.close();
    }


}