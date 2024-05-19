package src.exercicios;

import java.util.Scanner;

public class questao_02 {
    public static void main(String[] args) {
        //2 Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias
        //de vida ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex:
        //uma pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída:
        //MARIA, VOCÊ JÁ VIVEU 6935 DIAS

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = ler.next();
        System.out.println("Informe sua idade");
        int idade = ler.nextInt();

        int idadeEmDias = idade * 365;

        System.out.println(nome+" sua idade em dias é: "+idadeEmDias);

    }
}
