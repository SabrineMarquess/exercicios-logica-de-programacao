package src.exercicios.questao_soma0a10;

public class QuestaoC_Soma0a10 {
    public static void main(String[] args) {
        //1. Imprima a soma de todos os números inteiros entre 0 e 10.
        int soma = 0 ;

        for (int i=0; i<=10; i++){
            soma += i;
            System.out.println(soma);
        }

    }
}
