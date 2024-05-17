package src.exercicios;

import java.util.Scanner;

public class questao_11 {
    public static void main(String[] args) {
//        Faça um programa que calcule a quantidade de litros de combustível gasta em
//        uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o cálculo,
//        o usuário deve fornecer o tempo gasto na viagem e a velocidade média durante ela.
//        Desta forma, será possível obter a distância percorrida com a fórmula
//        DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a
//        quantidade de litros de combustível utilizada na viagem com a fórmula:
//        LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da
//        velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade
//        de litros utilizada na viagem.

        double velocidade_media = 0, tempo_gasto = 0, distancia_percorrida = 0, total_litros = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem: ");
        tempo_gasto = scanner.nextDouble();
        System.out.println("Digite a velocidade média da viagem: ");
        velocidade_media = scanner.nextDouble();

        distancia_percorrida = tempo_gasto * velocidade_media;
        total_litros = distancia_percorrida / 12;

        System.out.println("DADOS DA SUA VIAGEM");
        System.out.println("--------------------");
        System.out.println("Velocidade média: " + velocidade_media + " Km/h");
        System.out.println("Tempo gasto na viagem: " + tempo_gasto + "h");
        System.out.printf("Distância Percorrida: %.2f Km\n", distancia_percorrida);
        System.out.printf("Quantidade de litros de gasolina: %.3fL\n", total_litros);

    }
}