import java.util.Scanner;
public class Atv1 {

    public static void main(String[] args) {
        // Objetivo: Desenvolver um programa que registre notas, calcule a média e informe a situação do aluno.
        // _Declarar um vetor para armazenar as notas de 4 disciplinas.
        // _Solicitar ao usuário que digite as 4 notas.
        // Usar um laço de repetição para armazenar essas notas no vetor.
        // _Criar uma função que receba esse vetor e retorne a média aritmética das notas.
        // _Com base na média calculada, usar uma estrutura condicional (se, senao se, senao) para determinar:
        // "Aprovado" se a média for ≥ 7.0
        // "Recuperação" se a média for entre 5.0 e 6.9
        // "Reprovado" se a média for < 5.0
        // _Exibir na tela:
        // As 4 notas
        // A média calculada
        // A situação do aluno

        double[] notas = new double[4];
        Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota da disciplina " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double media = calcularMedia(notas);
        System.out.println("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\nMédia: " + media);
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
        scanner.close();
        

    }
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / 4;
    }
}