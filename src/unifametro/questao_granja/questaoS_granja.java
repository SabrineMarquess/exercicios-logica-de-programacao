package src.unifametro.questao_granja;

import java.util.Scanner;

public class questaoS_granja {
    public static void main(String[] args) {
        //A granja Frangotech possui um controle automatizado de cada frango da sua produção.
        //No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são
        //dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com
        //chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o
        //gasto total da granja para marcar todos os seus frangos.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de frangos da sua granja: ");
        int quant_frango = scanner.nextInt();

        int gasto_total = quant_frango * 11;
        System.out.println("O gasto total que você terá com os frangos é de: " + gasto_total + " R$");
    }
}
