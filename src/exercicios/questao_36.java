package src.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class questao_36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            int contador = i + 1;
            System.out.println("Digite o " + contador + " número");
            numeros[i] = scanner.nextInt();
        }
        Arrays.sort(numeros); // Ordena o array de números

        int somaMaiores = numeros[3] + numeros[4]; // Soma dos dois maiores números
        int somaMenores = numeros[0] + numeros[1]; // Soma dos dois menores números

        int resultado = somaMaiores - somaMenores; // Calcula o resultado da operação

        System.out.println("Os dois maiores números são: " + numeros[3] + " e " + numeros[4]);
        System.out.println("Os dois menores números são: " + numeros[0] + " e " + numeros[1]);
        System.out.println("O resultado da operação é: " + resultado);
    }
}
