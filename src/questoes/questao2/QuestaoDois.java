package questoes.questao2;

import java.util.ArrayList;
import java.util.Scanner;

import static questoes.questao2.Fibonacci.calcularSequenciaFibonacci;
import static questoes.questao2.Fibonacci.verificarNumeroFibonacci;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numeroVerificar = scanner.nextInt();

        ArrayList<Integer> sequenciaFibonacci = calcularSequenciaFibonacci(numeroVerificar);

        boolean resultado = verificarNumeroFibonacci(numeroVerificar, sequenciaFibonacci);

        if (resultado) {
            System.out.println("O número " + numeroVerificar + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroVerificar + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}