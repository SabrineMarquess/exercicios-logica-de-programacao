package src.exercicios;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class questao_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double[] notas = new double[20];
        double soma = 0;

        System.out.println("Digite as 20 notas");
        for (int i = 0; i < 20; i++) {
            contador = contador + 1;

            System.out.println("Digite a " + contador + " nota");

            notas[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 20; i++) {
            soma = soma + notas[i];
        }
        DecimalFormat df = new DecimalFormat("#.##");
        double media = soma / 20.0;

        System.out.println("Estas foram as notas:");
        System.out.println(Arrays.toString(notas));
        System.out.println("Está é a média das notas: " + df.format(media));
    }
}

