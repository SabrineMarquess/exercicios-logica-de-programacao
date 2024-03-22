package src.unifametro.questao_gasolina;

import java.util.Scanner;

public class questaoS_quantosLitros {
    public static void main(String[] args) {
        // Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo
        //para scanner o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele
        //conseguiu colocar no tanque

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.println("Informe, em reais, a quantidade desejada de gasolina: ");
        double valor = scanner.nextDouble();

        double litro = valor / precoLitro;

        System.out.printf("Com o valor informado (%.2f R$), você conseguiu colocar %.2fL de gasolina.", valor, litro);
    }
}
