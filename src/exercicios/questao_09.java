package src.exercicios;

import java.util.Scanner;

public class questao_09 {
    public static void main(String[] args) {
//        Desenvolver a lógica para um programa que  efetue o cálculo do
//        reajuste de salário de um  funcionário. Considere
//        que o funcionário deverá  receber um reajuste de 15% caso seu
//        salário seja  menor ou igual a 1500. Se o salário for maior que
//        1500, mas, menor ou igual a 2500, seu reajuste será  de 10%; caso
//        seja ainda maior que 10000, o reajuste  deverá ser de 5%”.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");

        double salario = scanner.nextDouble();
        double reajuste = 0;

        if (salario > 1500 && salario <= 2500) {
            reajuste = (salario * 10) / 100;
        } else if (salario <= 1500) {
            reajuste = (salario * 15) / 100;
        } else if (salario > 10000) {
            reajuste = (salario * 5) / 100;
        } else if (salario > 2500 && salario <= 10000) {
            reajuste = (salario * 7) / 100;

        }

        double novoSalario = salario + reajuste;
        System.out.println("Salário atual: " + salario);
        System.out.println("Reajuste aplicado: " + reajuste);
        System.out.println("Novo salário: " + novoSalario);


    }
}
