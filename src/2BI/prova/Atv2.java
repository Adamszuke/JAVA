import java.util.Scanner;
public class Atv2 {
    // Exercício 2: Controle de Estoque (40 pontos)
    // Objetivo: Criar um sistema básico que gerencie produtos em estoque utilizando uma matriz.
    // _Criar uma matriz com 5 linhas (uma para cada produto) e colunas que representem:
    // Código do produto
    // Quantidade disponível
    // Preço unitário
    // (opcionalmente: nome ou descrição do produto)
    // _Criar um procedimento chamado, por exemplo, exibir_estoque() que:
    // Percorra a matriz e mostre os dados de todos os produtos (em formato de tabela).
    // _Permitir que o usuário escolha adicionar ou remover quantidade de um produto, com base no código do produto.
    // Usar estruturas condicionais para atualizar a matriz de acordo com a escolha.
    // _Criar uma opção para calcular o valor total do estoque:
    // Total = soma de (quantidade × preço) de todos os produtos.
    // _Criar um menu de opções com repetição (laço) para:
    // Exibir o estoque
    // Adicionar/remover produtos
    // Ver o valor total
    // Encerrar o programa

    public static void main(String[] args) {
        String[][] estoque = new String[5][4];
        estoque[0] = new String[]{"001", "10", "5.50", "Produto A"};
        estoque[1] = new String[]{"002", "20", "3.75", "Produto B"};
        estoque[2] = new String[]{"003", "15", "8.00", "Produto C"};
        estoque[3] = new String[]{"004", "5", "12.00", "Produto D"};
        estoque[4] = new String[]{"005", "8", "6.25", "Produto E"};

        Scanner scanner = new java.util.Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Exibir Estoque");
            System.out.println("2. Adicionar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Ver Valor Total do Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirEstoque(estoque);
                    break;
                case 2:
                    adicionarProduto(estoque, scanner);
                    break;
                case 3:
                    removerProduto(estoque, scanner);
                    break;
                case 4:
                    calcularValorTotal(estoque);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static void exibirEstoque(String[][] estoque) {
        System.out.println("\nEstoque:");
        System.out.printf("%-10s %-15s %-10s %-20s%n", "Código", "Quantidade", "Preço", "Descrição");
        for (String[] produto : estoque) {
            System.out.printf("%-10s %-15s %-10s %-20s%n", produto[0], produto[1], produto[2], produto[3]);
        }
    }
    public static void adicionarProduto(String[][] estoque, java.util.Scanner scanner) {
        System.out.print("Digite o código do produto para adicionar: ");
        String codigo = scanner.next();
        System.out.print("Digite a quantidade a ser adicionada: ");
        int quantidade = scanner.nextInt();

        for (String[] produto : estoque) {
            if (produto[0].equals(codigo)) {
                int novaQuantidade = Integer.parseInt(produto[1]) + quantidade;
                produto[1] = String.valueOf(novaQuantidade);
                System.out.println("Produto adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public static void removerProduto(String[][] estoque, java.util.Scanner scanner) {
        System.out.print("Digite o código do produto para remover: ");
        String codigo = scanner.next();
        System.out.print("Digite a quantidade a ser removida: ");
        int quantidade = scanner.nextInt();

        for (String[] produto : estoque) {
            if (produto[0].equals(codigo)) {
                int novaQuantidade = Integer.parseInt(produto[1]) - quantidade;
                if (novaQuantidade < 0) {
                    System.out.println("Quantidade insuficiente para remoção!");
                } else {
                    produto[1] = String.valueOf(novaQuantidade);
                    System.out.println("Produto removido com sucesso!");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
    public static void calcularValorTotal(String[][] estoque) {
        double total = 0.0;
        for (String[] produto : estoque) {
            int quantidade = Integer.parseInt(produto[1]);
            double preco = Double.parseDouble(produto[2]);
            total += quantidade * preco;
        }
        System.out.printf("Valor total do estoque: R$ %.2f%n", total);
    }
}
