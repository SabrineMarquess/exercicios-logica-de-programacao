package src.unifametro.questao_padaria;

import java.util.Scanner;

public class QuestaoS_Padaria {
    public static void main(String[] args) {
//        1) A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de
//        broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o
//        dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve
//        guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para
//        fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
//        quantidades de pães e de broas, e depois calcular os dados solicitados.

        int p_frances = 0, broa = 0;
        double total_arrecadado, poupanca;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pães franceses vendidos hoje: ");
        p_frances = scanner.nextInt();

        System.out.println("Digite a quantidade de broas vendidas hoje: ");
        broa = scanner.nextInt();

        double valor_p_frances = (p_frances * 0.12);
        double valor_broa = (broa * 1.50);
        total_arrecadado = (valor_p_frances + valor_broa);
        poupanca = (total_arrecadado * 10) / 100;


        System.out.printf("Valor arrecadado dos pães franceses: R$ %.2f%n", valor_p_frances);
        System.out.printf("Valor arrecadado das broas: R$ %.2f%n", valor_broa);
        System.out.printf("Portanto, o valor total arrecadado é: R$ %.2f%n", total_arrecadado);
        System.out.printf("Valor a guardar na poupança: R$ %.2f%n", poupanca);


        scanner.close();


    }
}

