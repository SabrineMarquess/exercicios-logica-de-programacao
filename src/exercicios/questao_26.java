package src.exercicios;

import java.util.Scanner;

public class questao_26 {
    public static void main(String[] args) {
        //8. Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
        // Considere que o N será sempre maior que ZERO.
        Scanner ler = new Scanner(System.in);
        int x;

        System.out.println("Informe um Número: ");
        x = ler.nextInt();

        if (x == 0) {
            System.out.println("O Número não pode ser 0!");
            System.out.println("Informe o Número Novamente");
            x = ler.nextInt();
        }

        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }

    }
}
