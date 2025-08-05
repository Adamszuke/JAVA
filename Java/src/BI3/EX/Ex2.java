import java.util.Scanner;
public class Ex2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //  Enunciado:
        //  A empresa fictícia TechFitness está desenvolvendo um sistema para controle de alunos 
        //  matriculados em sua academia. O sistema será responsável por registrar informações básicas 
        //  dos alunos e permitir que alguns dados sejam acessados ou atualizados.
        //  A seguir, veja a descrição do que deve ser armazenado e controlado para cada aluno:

        //  Cada aluno da academia possui um nome completo, um CPF, uma idade, um peso atual (em kg), 
        //  uma altura (em metros) e um plano de treino que ele está seguindo 
        //  (por exemplo: “Hipertrofia”, “Emagrecimento”, “Funcional”, etc).
        //  A academia precisa de um sistema simples que permita:
        //  Armazenar essas informações de forma organizada;
        //  Calcular o IMC (Índice de Massa Corporal) do aluno com base no peso e altura;
        //  Exibir um resumo com os dados cadastrados do aluno.

        //  Sua Tarefa:
        //  Identificar e elabora a classe para este projeto.



    
    
    }

    public class User {
        int id;
        String name;
        double weight;
        double height;
        String treino;

        double IMC = weight / (height * height);
        
    }
}
