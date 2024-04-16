package src.exercicios.questao_22;

import java.util.Scanner;

public class questao_22_v2 {
    // Imprima a soma de todos os números inteiros num intervalo introduzido pelo usuário.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro para eu somar todos os números que chegam até ele: ");
        int limite = scanner.nextInt();

        int soma = (limite * (1 + limite)) / 2;

        System.out.println("A soma de todos os números inteiros até 10 é: " + soma);

    }
}
