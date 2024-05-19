package src.exercicios;

import java.util.Scanner;

public class questao_04 {
    public static void main(String[] args) {
        //Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
        //vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário
        //forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e
        //a máquina informe quanto será o valor arrecadado.

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de camisas pequenas (P)");
        int qntTamP = ler.nextInt();
        System.out.println("Informe a quantidade de camisas medias (M)");
        int qntTamM = ler.nextInt();
        System.out.println("Informe a quantidade de camisas grande (G)");
        int qntTamG = ler.nextInt();

        double valorArrec = (qntTamP * 10) + (qntTamM * 12) + (qntTamG * 15);

        System.out.printf("O valor a ser pago é R$ %.2f", valorArrec);
    }
}
