package src.exercicios;

import java.util.Scanner;

public class questao_03 {
    public static void main(String[] args) {
        //3 Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo
        //para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele
        //conseguiu colocar no tanque

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor que deseja por de gasolina");
        double valor = ler.nextDouble();

        double litro = valor / 5.97;

        System.out.printf("Com o valor %.2f voçê irá ter no seu tanque: %.2f L de gasolina", valor, litro);
    }
}
