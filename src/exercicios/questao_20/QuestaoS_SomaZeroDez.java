package src.exercicios.questao_20;

public class QuestaoS_SomaZeroDez {
    public static void main(String[] args) {
//        Desenvolver um código que mostre a soma de
//        todos os números inteiros de 0 a 10. Exemplo: 1 + 0, 1 + 2, 3 + 3...

        int resultado = 0;
        for (int i = 1; i < 11; i++) {

            resultado = resultado + i;
            System.out.println("resultado: " + resultado);


        }

    }
}
