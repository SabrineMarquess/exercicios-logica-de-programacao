package src.exercicios.questao_28;

import java.util.Scanner;

public class questao_9_v1 {
    public static void main(String[] args) {
        //9. Escreva um algoritmo que calcule e imprima a tabuada de um número de 1 a 10 dado pelo usuário.
        Scanner ler = new Scanner(System.in);
        int x, resultado;

        System.out.println("Informe o Numero que deseja ver a Tabuada: ");
        x = ler.nextInt();

        for (int i = 0; i <= 10; i++) {
            resultado = x * i;
            System.out.println(x + " x " + i + " = " + resultado);
        }

    }
}
