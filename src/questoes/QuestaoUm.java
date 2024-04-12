package questoes;

public class QuestaoUm {
    public static void main(String[] args) {
         Integer indice = 13;
         Integer soma = 0;


         for(Integer k = 0; k < indice; k = k + 1) {
            soma = soma + k;
         }

        System.out.println(soma);
    }
}