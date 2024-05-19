package src.exercicios;

import java.util.Scanner;

public class questao_21 {
    public static void main(String[] args) {
        //3. Imprima a soma de todos os números inteiros num intervalo introduzido pelo usuário.
        Scanner ler = new Scanner(System.in);
        int soma = 0, x;

        System.out.println("Informe o Numero Inteiro do final do intervalo a qual deverá ser realizada a soma de 0 à: ");

        x = ler.nextInt();

        for (int i = 0; i <= x; i++) {
            soma += i;
        }
        System.out.println("Resultado da Soma dos números no intervalo informado é: " + soma);

    }
}
