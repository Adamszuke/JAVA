package BI3.Aulas.Aula3; 

import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();


        System.out.println("Nome do estudante: ");
        estudante.nome = sc.nextLine();
        System.out.println("Nota do 1° trimestre");
        estudante.nota1 = sc.nextDouble();
        System.out.println("Nota do 2° trimestre");
        estudante.nota2 = sc.nextDouble();
        System.out.println("Nota do 3° trimestre");
        estudante.nota3 = sc.nextDouble();


        System.out.println("Estudante: " + estudante.nome);
        System.out.println("Nota final: " + estudante.notaFinal());
        if (estudante.aprovado()) {
            System.out.println("Resultado: Aprovado");
        }else{
            System.out.println("Resultado: Reprovado!");
            System.out.printf("Faltaram %.2f pontos para atingir a média!", estudante.pontosFaltantes());
        }

        sc.close();
    }
}