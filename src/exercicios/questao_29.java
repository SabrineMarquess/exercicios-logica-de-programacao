package src.exercicios;

import java.util.Scanner;

public class questao_29 {
    // Quero saber a porcentagem do meu gráfico, onde tem 4 notas médias, 0 ruins e 1 boa

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDeNotas;

        System.out.println("Quantas notas são no total?");
        totalDeNotas = scanner.nextInt();

        System.out.println("Quantas notas boas? (8-10)");
        int notasBoas = scanner.nextInt();
        System.out.println("Quantas notas medianas? (6-7)");
        int notasMedianas = scanner.nextInt();
        System.out.println("Quantas notas ruins? (0-5)");
        int notasRuins = scanner.nextInt();

        double percentualNotasBoas = ((double) notasBoas / totalDeNotas) * 100;
        double percentualNotasMedianas = ((double) notasMedianas / totalDeNotas) * 100;
        double percentualNotasRuins = ((double) notasRuins / totalDeNotas) * 100;

        System.out.println("Percentual de notas boas: " + percentualNotasBoas);

        System.out.println("Percentual de notas medianas: " + percentualNotasMedianas);

        System.out.println("Percentual de notas ruins: " + percentualNotasRuins);

    }
}
