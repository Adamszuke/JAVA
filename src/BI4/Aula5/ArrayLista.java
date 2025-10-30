package BI4.Aula5;
import java.util.*;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.print("Nome: ");
            String entrada = sc.nextLine().trim();
            if (entrada.equalsIgnoreCase("FIM")) {
                break;
            }
            if (!entrada.isEmpty()) {
                nomes.add(entrada);
                
            }
        }
    }
}
