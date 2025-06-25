public class Atv3 {
    // Exercício 3: Análise Numérica em Matriz (30 pontos)
    // Objetivo: Criar um programa que utilize uma matriz numérica preenchida automaticamente, realizando análises matemáticas importantes como soma, contagem e identificação de valores específicos.
    // _Criar uma matriz 4x4 de inteiros (inteiro matriz[4][4]).
    // _Preencher automaticamente a matriz com valores entre 1 e 100 (ou sequência, se preferir).
    // Pode usar um contador ou função aleatória (aleatorio(1, 100) em Portugol Studio).
    // _Exibir a matriz em formato de tabela, após preenchida.
    // _Calcular e exibir a soma da diagonal principal (valores onde linha == coluna).
    // _Calcular e exibir a soma de todos os elementos da matriz.
    // _Identificar e exibir:
    // O maior valor
    // O menor valor
    // _Contar e exibir:
    // A quantidade de números pares
    // A quantidade de números ímpares

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        preencherMatriz(matriz);
        exibirMatriz(matriz);
        calcularSomaDiagonalPrincipal(matriz);
        calcularSomaTotal(matriz);
        identificarMaiorMenor(matriz);
        contarParesImpares(matriz);
    }
    public static void preencherMatriz(int[][] matriz) {
        int contador = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador++;
            }
        }
    }
    public static void exibirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.printf("%4d ", valor);
            }
            System.out.println();
        }
    }
    public static void calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + soma);
    }
    public static void calcularSomaTotal(int[][] matriz) {
        int soma = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
            }
        }
        System.out.println("Soma total dos elementos da matriz: " + soma);
    }
    public static void identificarMaiorMenor(int[][] matriz) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
    public static void contarParesImpares(int[][] matriz) {
        int contagemPares = 0;
        int contagemImpares = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor % 2 == 0) {
                    contagemPares++;
                } else {
                    contagemImpares++;
                }
            }
        }
        System.out.println("Quantidade de números pares: " + contagemPares);
        System.out.println("Quantidade de números ímpares: " + contagemImpares);
    }

    

}
