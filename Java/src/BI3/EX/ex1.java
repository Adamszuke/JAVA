import java.util.Scanner;
public class ex1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Qual forma você deseja calcular a área? ");
        System.out.println("1. Retângulo");
        System.out.println("2. Círculo");
        System.out.println("3. Triângulo");

        int opt = scanner.nextInt();
        switch (opt) {
            case 1:
                CalcularRetangulo();
                break;
            case 2:
                calcularCirculo();
                break;
            case 3:
                calcularTriangulo();
                break;
            default:
                System.out.println("Não existe essa opção!");
            }
        }
        static void CalcularRetangulo(){
            System.out.println("Digite a altura: ");
            double h = scanner.nextDouble();

            System.out.println("Digite a base: ");
            double b = scanner.nextDouble();
            
            double a = h * b;
            
            System.out.println("A área do retângulo é: " + a);
        }
        static void calcularCirculo(){
            System.out.println("Digite o raio: ");
            double r = scanner.nextDouble();
            
            double a = Math.pow(r, 2) * 3.14; 
            
            System.out.println("A área do circulo é: " + a);
        }
        static void calcularTriangulo(){
            System.out.println("Digite a altura: ");
            double h = scanner.nextDouble();

            System.out.println("Digite a base: ");
            double b = scanner.nextDouble();
            
            double a = (h * b)/2;
            
            System.out.println("A área do triângulo é: " + a);
        }
}
    
