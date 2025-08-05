import java.util.Scanner;
public class Aula1{
    // Atalho = PSVM
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
        

        System.out.println("Digite um número de 1 a 7");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break; 
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                throw new AssertionError();
        }
        scanner.close();
    }
}