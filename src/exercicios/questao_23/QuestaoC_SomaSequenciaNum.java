package src.exercicios.questao_23;

import java.util.Scanner;

public class QuestaoC_SomaSequenciaNum {
    public static void main(String[] args) {
        //4. Construa um programa que calcule a soma de uma seqüência de números introduzidos pelo usuário.
        // O programa deve solicitar o tamanho da sequência ao usuário.
        Scanner ler = new Scanner(System.in);
        int soma = 0, x, num;

        System.out.println("Informe o tamanho da sequência de numeros");
        x = ler.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println("Informe o valor do " + i + " número:");
            num = ler.nextInt();
            soma += num;
        }
        System.out.println("Resultado da Soma dos números da sequência é: " + soma);

    }
}