import java.util.*;

public class GreedyEscolha {
    public static int[] escolherMenoresPorPar_bugada(int[] caminhos) {
        List<Integer> escolhidos = new ArrayList<>();
        int i = 0; int n = caminhos.length; int passo = 1;
        while (i + 1 < n) {
            int a = caminhos[i];
            int b = caminhos[i + 1];
            int escolhido = Math.max(a, b); // Estude o que essa função faz
            escolhidos.add(escolhido);
            i += 2; passo++;
        }
        if (i < n) {
            escolhidos.add(caminhos[i]);
        }
        return escolhidos.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] caso1 = {7, 3, 10, 9, 4, 8};
        int[] caso2 = {5, 6, 1};
        int[] caso3 = {2, 2, 2, 3};
        System.out.println("=== RODADA BUGADA ===");
        System.out.println("caso1");
        escolherMenoresPorPar_bugada(Arrays.copyOf(caso1, caso1.length));
        System.out.println("caso2");
        escolherMenoresPorPar_bugada(Arrays.copyOf(caso2, caso2.length));
        System.out.println("caso3");
        escolherMenoresPorPar_bugada(Arrays.copyOf(caso3, caso3.length));
    }
}

