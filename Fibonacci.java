public class Fibonacci {

    public static int calcularFibonacciIterativo(int numero) {

        int resultado = 0 , anterior = 1, anteriorDoAnterior = 0;

        if (numero <= 1) {
            return numero;
        } else {

            for (int i = 0; i < numero; i++) {

                resultado = anterior + anteriorDoAnterior;
                anteriorDoAnterior = anterior;
                anterior = anteriorDoAnterior;
            }
             return  resultado;
        }
    }

    public static int calcularFibonacciRecursivo(int numero){
        if (numero <=1){
            return numero;

        }

        return calcularFibonacciRecursivo(numero-1) + calcularFibonacciRecursivo(numero-2);

    }

}


