package Aulas;
import java.util.Scanner;
public class Aula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // . significa conteúdo interno da classe - System -> out -> println

        // Pega um número aleatório entre 0 e 100
        System.out.println(Math.random() * 100);

        // Pega um número aleatório inteiro entre 0 a 100
        System.out.println((int) Math.random() * 100);

        int min = 50, max = 100, dif = 0;
        dif = max - min;
        System.out.println((int)(Math.random()*dif)+min);
        
        mensagem();

    }

    static void mensagem()
    {
        System.out.println("Bem Vindos!");
    }

}
