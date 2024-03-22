package src.unifametro.questao_camisas;

import java.util.Scanner;

public class questaoS_camisas {
    public static void main(String[] args) {
        //Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
        //vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário
        //forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e
        //a máquina informe quanto será o valor arrecadado.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de camisas pequenas que comprou: ");
        int pequenas = scanner.nextInt();
        System.out.println("Digite a quantidade de camisas médias que comprou: ");
        int medias = scanner.nextInt();

        System.out.println("Digite a quantidade de camisas grandes que comprou: ");
        int grandes = scanner.nextInt();

        scanner.close();
        double valorPequenas = pequenas * 10;
        double valorMedias = medias * 12;
        double valorGrandes = grandes * 15;

        double valorTotal = valorPequenas + valorMedias + valorGrandes;

        System.out.println("Você comprou " + pequenas + " camisas pequenas");
        System.out.println("Você comprou " + medias + " camisas médias");
        System.out.println("Você comprou " + grandes + " camisas grandes");
        System.out.printf("Portanto, você terá que pagar %.2f R$", valorTotal);

    }
}
