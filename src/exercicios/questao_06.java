package src.exercicios;

import java.util.Scanner;

public class questao_06 {
    public static void main(String[] args) {
        //5- Considere a sub-rotina abaixo:

        //1. Programa
        //2. Declare X, Y e Z numérico
        //3. Leia X
        //4. Leia Y
        //5. Z:= (X + Y) x Y
        //6. Escreva Z
        //7. Fim programa

        //Analisando o programa acima, e supondo que o valor fornecido para “X” na terceira linha seja
        //3 e o valor fornecido para Y na quarta linha seja 4, pode-se afirmar que o valor da variável “Z”
        //na sexta linha é:

        int X, Y, Z;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Valor de X");
        X = ler.nextInt();
        System.out.println("Informe o Valor de Y");
        Y = ler.nextInt();

        Z = (X + Y) * Y;

        System.out.println("O Valor de X é: " + X + "\nO Valor de Y é: " + Y + "\nO Valor de Z é: " + Z);
    }
}
