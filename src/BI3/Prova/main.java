package BI3.Prova;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Super-Herói ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Poder: ");
        String poder = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Nível de Força (1 a 100): ");
        int nivelForca = scanner.nextInt();

        System.out.print("Rua: ");
        String rua = scanner.next(); 
        scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("País: ");
        String pais = scanner.nextLine();


        Endereco endereco = new Endereco(rua, cidade, pais);
        Cadastro heroi = new Cadastro(nome, poder, idade, nivelForca, endereco);    

        System.out.println("\n=== Dados do Super-Herói ===");
        heroi.exibirCadastro();

        System.out.println("\n=== Cadastro do Líder da Liga ===");
        System.out.print("Nome: ");
        String nomeL = scanner.nextLine();

        System.out.print("Idade: ");
        int idadeL = scanner.nextInt();

        System.out.print("Super Poder: ");
        String poderL = scanner.nextLine();
        scanner.nextLine();
        
        System.out.print("Nível de Poder (1 a 100): ");
        int nivelL = scanner.nextInt();
        
        System.out.print("Tempo de Liderança (anos): ");
        int tempoL = scanner.nextInt(); 
        
        System.out.print("Rua: ");
        String ruaL = scanner.next();
        scanner.nextLine();

        System.out.print("Cidade: ");
        String cidadeL = scanner.nextLine();

        System.out.print("País: ");
        String paisL = scanner.nextLine();

        Endereco endLider = new Endereco(ruaL, cidadeL, paisL);
        Lider lider = new Lider(nomeL, poderL, idadeL, nivelL, endLider, tempoL);

        lider.exibirCadastro();
        lider.liderarMissao();
        scanner.close();

    }
}
