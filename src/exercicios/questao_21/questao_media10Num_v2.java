package src.exercicios.questao_21;

import java.util.Arrays;
import java.util.Scanner;

public class questao_media10Num_v2 {
    public static void main(String[] args) {
        // Escreva um programa que calcule e imprima a média de 10 números introduzidos pelo usuário
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            int contagem = i + 1;
            System.out.println("Digite o " + contagem + " número");
            numeros[i] = scanner.nextInt();

        }
        double media = (double) (
                numeros[0] + numeros[1] + numeros[2] + numeros[3] +
                numeros[4] + numeros[5] + numeros[6] +
                numeros[7] + numeros[8] + numeros[9]) / 10;

        System.out.println("os números digitados foram: " + Arrays.toString(numeros));
        System.out.println("A média destes valores é: " + media);

    }
}


