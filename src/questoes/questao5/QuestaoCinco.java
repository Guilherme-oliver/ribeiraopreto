package questoes.questao5;

import java.util.Scanner;

public class QuestaoCinco {
    public static String inverterString(String str) {
        // Inicializa uma string vazia para armazenar o resultado
        String stringInvertida = "";

        // Itera pelos caracteres da string de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            // Adiciona cada caractere à string invertida
            stringInvertida += str.charAt(i);
        }

        return stringInvertida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para inverter: ");
        String stringOriginal = scanner.nextLine();

        String stringInvertida = inverterString(stringOriginal);

        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);
        scanner.close();
    }
}