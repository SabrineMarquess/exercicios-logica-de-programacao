package src.exercicios.questao_23;

import java.util.Arrays;
import java.util.Scanner;

public class questao_23_v2 {
    public static void main(String[] args) {
        // Construa um programa que calcule a soma de uma seqüência de números introduzidos pelo usuário.
        // O programa deve solicitar o tamanho da sequência ao usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da sua sequência: ");
        int tamanho = scanner.nextInt();
        int[] sequencia = new int[tamanho];
        System.out.println("Ok, agora digite sua sequência de números número por número");
        for (int i = 0; i < tamanho; i++) {
            int contagem = i + 1;
            System.out.println("Digite o " + contagem + " número");
            sequencia[i] = scanner.nextInt();

        }
        int soma = 0;
        for (int num : sequencia) {
            soma += num;
        }
        System.out.println("A sequência de números é: " + Arrays.toString(sequencia));
        System.out.println("A soma deles é: " + soma);

    }
}
