import java.util.Scanner;
public class Aula1EX {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 1");

        System.out.println("Informe sua idade: ");
        int idade =  scanner.nextInt();
        if(idade >= 18){
            // Atalho = sout
            System.out.println("Você é maior de idade");
        }

        System.out.println("Exercício 2");

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2)
        {
            System.out.println( num1 + " é maior do que " + num2);
        }
        else if (num1 == num2)
        {
            System.out.println("Os números são iguais");
        }
        else{
            System.out.println(num2 + " é maior do que " + num1);
        }

        System.out.println("Atividade 3");

        System.out.println("Digite sua nota: ");
        float nota = scanner.nextInt();
        if(nota > 8.9){
            System.out.println("Sua nota é A");
        }
        else if(nota < 8.9 && nota > 7){
            System.out.println("Sua nota é B");
        }
        else if (nota < 7 && nota > 5){
            System.out.println("Sua nota é C");
        }
        else if (nota < 5 && nota > 3){
            System.out.println("Sua nota é D");
        }
        else{
            System.out.println("Sua nota é F");
        }

        System.out.println("Atividade 4");

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();
        System.out.println("Escolha uma operação, digite: \n+ para adição \n- para subtração \n* para múltiplicação \n/ para divisão");
        char op = scanner.next().charAt(0); 

        if (op == '+')
        {
            System.out.println(num1 + num2);
        }
        else if (op == '-')
        {
            System.out.println(num1-num2);
        }
        else if (op == '*')
        {
            System.out.println(num1*num2);
        }
        else if (op == '/')
        {
            System.out.println(num1/num2);
        }
        
        System.out.println("Atividade 5");

        System.out.println("Informe seu peso em Kg: (Use vírgula)");
        double peso = scanner.nextFloat();
        System.out.println("Informe sua aultura em metros: (Use vírgula)");
        double alt = scanner.nextFloat();

        double imc = peso / (alt*alt);
        if (imc < 18.5)
        {
            System.out.println("Você está abaixo do peso");
        }
        else if (imc <= 25)
        {
            System.out.println("Você está no peso normal");
        }
        else if (imc >= 25 && imc < 30)
        {
            System.out.println("Você está com sobrepeso");
        }
        else 
        {
            System.out.println("Você está com obesidade");
        }

    }
}
