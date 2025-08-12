import java.util.Scanner;

public class Aula3Ex {
    static double n1; 
    static double n2;
    static double n3;
    static double media;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        
        
        
        System.out.println("Qual atividade você deseja acessar? ");
        int atv = scanner.nextInt();
        
        switch (atv) {
            case 1:
                Atv1();
                break;
            case 2:
                Atv2();
            default:
                break;
        }

        

    }

    static void Atv1()
    {
        // Desenvolva um sistema básico de login que utilize procedimentos para exibir mensagens e funções para validar credenciais.

        String user;
        String pas;

        System.out.println("Digite seu usuário: ");
        user = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        pas = scanner.nextLine();
        while (!user.equals("user1") || !pas.equals("123456")) {
            System.out.println("Usuário ou senha inválidas!");
            System.out.println("Digite seu usuário: ");
            user = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            pas = scanner.nextLine();
        }

        System.out.println("Logado com sucesso!");
        
    }

    static void Atv2(){
        // Desenvolva um sistema para gerenciar notas de estudantes, utilizando subrotinas para entrada, processamento e exibição de dados

        System.out.println("Digite a primeira nota");
        n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota");
        n3 = scanner.nextDouble();

        media();
        System.out.printf("Sua média final é: %s",media);




    }

    static void media(){
        media = (n1 + n2 + n3) / 3;
    }
}
