package src.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class questao_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int[] vetor = new int[10];
        int[] vetorOriginal = new int[10];

        System.out.println("Digite 10 números para que eu possa organizá-los");
        for (int i = 0; i < 10; i++) {
            contador = contador + 1;

            System.out.println("Digite o " + contador + " número");

            int numero = scanner.nextInt();

            vetor[i] = numero;
            vetorOriginal[i] = numero;
        }

        Arrays.sort(vetor);
        System.out.println("Este é o vetor antes de ser organizado.");
        System.out.println(Arrays.toString(vetorOriginal));
        System.out.println("Este é o vetor organizado.");
        System.out.println(Arrays.toString(vetor));

    }
}
