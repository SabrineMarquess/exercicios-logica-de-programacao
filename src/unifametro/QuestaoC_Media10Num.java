package src.unifametro;

import java.util.Scanner;

public class QuestaoC_Media10Num {
    public static void main(String[] args) {
        //2. Escreva um programa que calcule e imprima a
        //média de 10 números introduzidos pelo usuário

        Scanner ler = new Scanner(System.in);
        int num = 0;
        double soma = 0, media;
        for (int i=1; i<=10 ; i++){
            System.out.println("Informe o Valor do "+i+" Número");
            num = ler.nextInt();
            soma += num;
        }
            media = soma /10;
            System.out.println("Número: "+num+" soma: "+soma+" media:"+media);
    }
}
