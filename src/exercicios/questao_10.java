package src.exercicios;

import java.util.Scanner;

public class questao_10 {
    public static void main(String[] args) {

//        Este código vai analisar 3 números inteiros: ele analisa qual é o maior,
//        qual é o menor número e a diferença entre eles.

        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;
        do {
            System.out.print("Digite o primeiro valor: ");
            n1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            n2 = scanner.nextDouble();

            System.out.print("Digite o terceiro valor: ");
            n3 = scanner.nextDouble();

            double[] resultado;

            if (n1 > n2 && n1 > n3) {
                resultado = calcularMenorDiferenca(n1, n2, n3);
                System.out.println("O maior valor é " + n1);
                System.out.println("O menor valor é " + resultado[0]);
                System.out.println("A diferença entre eles é de: " + resultado[1]);

            } else if (n2 > n1 && n2 > n3) {
                resultado = calcularMenorDiferenca(n2, n1, n3);

                System.out.println("O maior valor é " + n2);
                System.out.println("O menor valor é " + resultado[0]);
                System.out.println("A diferença entre eles é de: " + resultado[1]);


            } else if (n3 > n1 && n3 > n2) {
                resultado = calcularMenorDiferenca(n3, n1, n2);

                System.out.println("O maior valor é " + n3);
                System.out.println("O menor valor é " + resultado[0]);
                System.out.println("A diferença entre eles é de: " + resultado[1]);

            } else {
                System.out.println("Os três valores devem ser diferentes, por favor, tente novamente.");

            }

        } while (n1 == n2 || n1 == n3 || n2 == n3 || n3 == n1);


    }

    private static double[] calcularMenorDiferenca(double maiorValor, double valor1, double valor2) {
        double menorValor;
        double diferenca;

        if (valor1 > valor2) {
            menorValor = valor2;
            diferenca = maiorValor - valor2;
        } else {
            menorValor = valor1;
            diferenca = maiorValor - valor1;
        }

        return new double[]{menorValor, diferenca};
    }
}