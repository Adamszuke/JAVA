package Ex;
import java.util.Scanner;
public class Aula4Ex {
    static Scanner scanner = new Scanner(System.in);
    static int[] vet1 = new int[10];
    static double soma;
    static double maior = 0;
    static double menor = 50000;
    static String[] nome = {"Raul", "Davi", "Nandinho", "Sakuta", "Alex"};
    static int[] idade = {18, 19, 20, 21, 22};
    static double[] sal = {1900.00, 2000.00, 1200.00, 800.00, 2500.00};
    static int[][] mat = new int[3][3];

    public static void main(String[] args) {
        int atv;
        System.out.println("Qual atividade você deseja acessar? ");
        atv = scanner.nextInt();

        switch (atv) {
            case 1:
                Atv1();
                break;
            case 2:
                Atv2();
                break;
            default:
                break;
        }
        
    }

    static void Atv1(){
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Digite o %sº número: \n", i +1);
            vet1[i] = scanner.nextInt();
            soma += vet1[i];

            if (maior < vet1[i]){
                maior = vet1[i];
            }

            if (vet1[i] < menor) {
                menor = vet1[i];
            }
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A ordem inversa é: ");
        for (int i = 9; i >= 0; i--){
            System.out.println(vet1[i]);
        }
        System.out.println("O maior número é: " + maior + " e o menor é: " + menor);
    }

    static void Atv2(){
        for( int i = 0; i< 5; i++)
        {
            System.out.printf("Meu nome é %s, tenho %s anos e meu salário é %s \n", nome[i], idade[i], sal[i]);
        }
    }

    static void Atv3(){
        // Crie uma matriz quadrática de 3
        // _some e apresente a diagonal principal
        // _some e apresente todos os valores da matriz
        

    }

    
}
