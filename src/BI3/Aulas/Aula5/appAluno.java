package BI3.Aulas.Aula5;
import java.util.Scanner;

public class appAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno:");
        String nome = sc.nextLine();
        System.out.print("Informe a nota do aluno:");
        double nota = sc.nextDouble();

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setNota(nota);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Nota do aluno: " + aluno.getNota());

        sc.close();
    }
}
