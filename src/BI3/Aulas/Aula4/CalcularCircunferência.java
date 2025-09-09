package BI3.Aulas.Aula4;
import java.util.Scanner;

public class CalcularCircunferência {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FiguraGeometrica fg = new FiguraGeometrica();

        System.out.println("Informe o raio: ");
        fg.raio = sc.nextDouble();

        System.out.printf("Circunferência: %.2f ", fg.circunferencia());
        System.out.printf("Volume: %2.f ", fg.volume());
        System.out.printf("Valor de PI: %.2f ", fg.pi());

        sc.close();
    }
}
