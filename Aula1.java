import java.util.Scanner;
public class Aula1{
    public static void main(String[] args) {
        // Chamar a biblioteca
        Scanner scanner = new Scanner(System.in);

        // Print
        System.out.println("Informe sua idade: ");
        int idade =  scanner.nextInt();
        if(idade >= 18){
            // Atalho = sout
            System.out.println("Você é maior de idade");
        }
        else if (idade >=12){
            System.out.println("Você é Adolescente");
        }
        else if(idade <12)
        {
            System.out.println("Você é criança");
        }
    }
}