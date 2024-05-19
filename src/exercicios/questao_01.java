package src.exercicios;

import java.util.Scanner;

public class questao_01 {
    public static void main(String[] args) {
        //A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de
        //broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o
        //dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve
        //guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para
        //fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
        //quantidades de pães e de broas, e depois calcular os dados solicitados.

        Scanner ler = new Scanner(System.in);

        System.out.println("Infome a quantidade de pães vendidos");
        int qntPaes = ler.nextInt();
        System.out.println("Infome a quantidade de broas vendidos");
        int qntBroas = ler.nextInt();

        double valVendas = (qntPaes * 0.12) + (qntBroas * 1.50);

        System.out.println("O valor arrecadado foi: " + valVendas);

        double valPoupanca = (valVendas * 10) / 100;

        System.out.println("Você deve guardar na poupança: " + valPoupanca);
    }
}
