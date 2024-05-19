package src.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class questao_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorA = 0;
        int contadorB = 0;
        int[] vetorA, vetorB, soma;

        System.out.println("Digite o tamanho dos vetores");
        int tamanho = scanner.nextInt();
        vetorA = new int[tamanho];
        vetorB = new int[tamanho];
        soma = new int[tamanho];

        System.out.println("Alimente o vetor A");
        for (int i = 0; i < tamanho; i++) {
            contadorA = contadorA + 1;

            System.out.println("Digite o " + contadorA + " número");
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Alimente o vetor B");
        for (int i = 0; i < tamanho; i++) {
            contadorB = contadorB + 1;

            System.out.println("Digite o " + contadorB + " número");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            soma[i] = (vetorA[i] + vetorB[i]);
        }
        System.out.println("Este é o vetor A: " + Arrays.toString(vetorA));
        System.out.println("Este é o vetor B: " + Arrays.toString(vetorB));
        System.out.println("Esta é a soma dos vetores" + Arrays.toString(soma));

    }
}
