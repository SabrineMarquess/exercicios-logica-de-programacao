package src.exercicios;

import java.util.Scanner;

public class questao_05 {
    public static void main(String[] args) {
        //A granja Frangotech possui um controle automatizado de cada frango da sua produção.
        //No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são
        //dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com
        //chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o
        //gasto total da granja para marcar todos os seus frangos.

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de frangos que receberão os aneis");
        int qntFrango = ler.nextInt();

        double valAnelAliment = (qntFrango * 3.50) * 2;
        double valAnelIdent = (qntFrango * 4);
        double total = valAnelIdent + valAnelAliment;

        System.out.printf("O valor gasto com o anel de identficação é R$ %.2f com " +
                "alimentação é R$ %.2f. o Total gasto é R$ %.2f", valAnelIdent, valAnelAliment, total);
    }
}
