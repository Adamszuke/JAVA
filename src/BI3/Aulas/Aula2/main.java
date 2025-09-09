package BI3.Aulas.Aula2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto; 
        produto = new Produto();

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.print("Preco do produto: ");
        produto.preco = sc.nextInt();
        System.out.print("Quantidade do produto: ");
        produto.qtd = sc.nextInt();


        System.out.println("Dados do Produto: ");
        System.out.println(produto);
    }
}
