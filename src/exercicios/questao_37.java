package src.exercicios;

import java.util.Scanner;

public class questao_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Mercado Financeiro");

        System.out.print("Digite o valor inicial do investimento: R$ ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de crescimento mensal das ações (%): ");
        double taxaAcoes = scanner.nextDouble() / 100;

        System.out.print("Digite a taxa de crescimento mensal dos fundos imobiliários (%): ");
        double taxaFundos = scanner.nextDouble() / 100;

        System.out.print("Digite a taxa de crescimento mensal das criptomoedas (%): ");
        double taxaCripto = scanner.nextDouble() / 100;

        double saldoAcoes = valorInicial;
        double saldoFundos = valorInicial;
        double saldoCripto = valorInicial;

        for (int i = 1; i <= 12; i++) {
            saldoAcoes += saldoAcoes * taxaAcoes;
            saldoFundos += saldoFundos * taxaFundos;
            saldoCripto += saldoCripto * taxaCripto;
        }

        System.out.printf("\nApós 12 meses:\n");
        System.out.printf("Ações: R$ %.2f\n", saldoAcoes);
        System.out.printf("Fundos Imobiliários: R$ %.2f\n", saldoFundos);
        System.out.printf("Criptomoedas: R$ %.2f\n", saldoCripto);

        scanner.close();
    }
}

