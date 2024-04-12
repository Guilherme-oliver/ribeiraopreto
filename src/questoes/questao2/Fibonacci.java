package questoes.questao2;

import java.util.ArrayList;

public class Fibonacci {
    public static ArrayList<Integer> calcularSequenciaFibonacci(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size() - 1) < n) {
            int next = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(next);
        }

        return fibonacci;
    }

    public static boolean verificarNumeroFibonacci(int numero, ArrayList<Integer> sequencia) {
        return sequencia.contains(numero);
    }
}