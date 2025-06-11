package Ex;
import java.util.Scanner;

public class Aula3Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual atividade você deseja acessar? ");
        int atv = scanner.nextInt();

        switch (atv) {
            case 1:
                Atv1();
                break;
        
            default:
                break;
        }
        
        

    }

    static void Atv1()
    {
        Scanner scanner = new Scanner(System.in);
        
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


}
