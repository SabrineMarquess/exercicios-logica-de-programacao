package src.exercicios;

import java.util.Scanner;

public class questao_23 {
    public static void main(String[] args) {
        //5. Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO,
        // deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero
        // e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
        Scanner ler = new Scanner(System.in);
        double n1, n2, divisao;

        System.out.println("Informe o Valor do 1° Número");
        n1 = ler.nextInt();
        System.out.println("Informe o Valor do 2° Número");
        n2 = ler.nextInt();

        if (n2 == 0) {
            System.out.println("O Valor do 2° Número não pode ser 0!");
            System.out.println("Informe o Valor do 2° Número Novamente");
            n2 = ler.nextInt();
        }

        divisao = (n1 / n2);

        System.out.printf("Resultado da Divisão de %.0f por %.0f é:  %.2f", n1, n2, divisao);

    }
}
