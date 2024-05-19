package src.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class questao_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int[] vetorM = new int[10];
        int[] vetorA = new int[10];
        for (int i = 0; i < 10; i++) {
            contador = contador + 1;
            System.out.println("Digite o " + contador + " número.");
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite o valor de X.");
        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            vetorM[i] = (x * vetorA[i]);
        }

        System.out.println("Este é o vetor A");
        System.out.println(Arrays.toString(vetorA));
        System.out.println("Este é o valor de X");
        System.out.println(x);
        System.out.println("Este é o vetor M");
        System.out.println(Arrays.toString(vetorM));


    }
}
