package Ex;
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

        System.out.println("Atividade 6");

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade >= 16 && idade < 18) {
            System.out.println("Seu voto é facultativo");
        }
        else if (idade >= 18 && idade <= 65) {
            System.out.println("Seu voto é mandatório");
        }
        else if (idade > 65 && idade <= 70)
        {
            System.out.println("Seu voto é facultativo");
        }
        else{
            System.out.println("Você não pode votar");
        }
        
        System.out.println("Atividade 7");

        System.out.println("Digite a nota 1");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a nota 2");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a nota 3");
        double n3 = scanner.nextDouble();

        double media = (n1+n2+n3) / 3;
        
        if (media >= 70)
        {
            System.out.println("Aluno aprovado");
        }
        else if(media >= 50 && media < 70)
        {
            System.out.println("Aluno de recuperação");
        }
        else if (media < 50) {
            System.out.println("Aluno reprovado");
        }

        System.out.println("Atividade 8");

        System.out.println("Selecione a forma de pagamento \n" + "1 - à vista(Dinheiro) \n" + "2 - à vista(cartão de débito) \n" + "3 - Parcelado em 2x \n" + "4 - Parcelado em 3x ou mais");
        int pag = scanner.nextInt();

        if (pag == 1)
        {
            System.out.println("Você tem 15% de desconto");
        }
        if (pag == 2)
        {
            System.out.println("Você tem 10% de desconto");
        }
        if (pag == 3)
        {
            System.out.println("Você tem 5% de desconto");
        }
        if (pag == 4) {
            System.out.println("Você não tem desconto");
        }

        System.out.println("Atividade 9");

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        if (idade > 60) {
            System.out.println("Você é idoso");
        }
        else if(idade >= 18 && idade <= 59){
            // Atalho = sout
            System.out.println("Você é adulto");
        }
        else if (idade >=12 && idade < 18){
            System.out.println("Você é jovem");
        }
        else if(idade <12 && idade > 2)
        {
            System.out.println("Você é criança");
        }
        else if(idade < 2)
        {
            System.out.println("Você é bebê");
        }

        System.out.println("Atividade 10");

        System.out.println("Digite seu usuário: ");
        String user1 = scanner.nextLine();
        System.out.println("Digite sua senha");
        String pass1 = scanner.nextLine(); 
        System.out.println("Digite seu usuário: ");
        String user2 = scanner.nextLine();
        System.out.println("Digite sua senha");
        String pass2 = scanner.nextLine(); 
        System.out.println("Digite seu usuário: ");
        String user3 = scanner.nextLine();
        System.out.println("Digite sua senha");
        String pass3 = scanner.nextLine(); 
        int tentativa = 0;

        String tryuser = scanner.nextLine();
        String trypass;

        if (tryuser == user1)
        {
            trypass = scanner.nextLine();
            if (trypass == pass1) {
                System.out.println("Boas vindas,  " + user1);
            }
            else if (trypass != pass1 && tentativa < 3) {
                tentativa++;
                trypass = scanner.nextLine();
            }
            else if (trypass != pass1 && tentativa < 3) {
                tentativa++;
                trypass = scanner.nextLine();
            }
            else {
                System.out.println("Usuário Bloqueado");
            }
        }
        else if (tryuser == user2)
        {
            trypass = scanner.nextLine();
            if (trypass == pass2) {
                System.out.println("Boas vindas,  " + user2);
            }
            else if (trypass != pass1 && tentativa < 3) {
                tentativa++;
                trypass = scanner.nextLine();
            }
            else if (trypass != pass2 && tentativa < 3) {
                tentativa++;
                trypass = scanner.nextLine();
            }
            else {
                System.out.println("Usuário Bloqueado");
            }
        }
        else if (tryuser == user3)
        {
            trypass = scanner.nextLine();
            if (trypass == pass3) {
                System.out.println("Boas vindas,  " + user3);
            }
            else if (trypass != pass3 && tentativa < 3) {
                tentativa++;
                trypass = scanner.nextLine();
            }
            else if (trypass != pass3 && tentativa < 3) {
                tentativa++;
                trypass = scanner.nextLine();
            }
            else {
                System.out.println("Usuário Bloqueado");
            }
        }
    } 
}
