package src.unifametro.eduardoMaximo.atividades_02;

import java.util.Scanner;

public class Questao2_DiasDeVida {
    public static void main(String[] args) {
//        2) Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias
//        de vida ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex:
//        uma pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída:
//        MARIA, VOCÊ JÁ VIVEU 6935 DIAS

        String nome;
        int idade = 0, dias = 0;

//        Aqui eu fiz uma pequena validação utilizando o do-while para que ele sempre volte ao scanner (digite sua idade) caso
//        o usuário digitar um número menor que 1.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.next();


        do {
            System.out.println("Digite sua idade: ");

            idade = scanner.nextInt();

            if (idade < 1) {
                System.out.println("A idade é inválida, digite um número maior que 1.");
            } else {
                dias = (idade * 365);
            }
        } while (idade < 1);


        System.out.println(nome + ", VOCÊ JÁ VIVEU " + dias + " DIAS");


    }

}
