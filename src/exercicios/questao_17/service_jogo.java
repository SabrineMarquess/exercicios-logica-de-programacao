package src.exercicios.questao_17;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe que implementa um jogo de adivinhação de números.
 * O jogador tenta adivinhar um número sorteado aleatoriamente entre 1 e 100.
 * A cada tentativa, o jogador recebe uma dica se o número sorteado é maior ou menor que a tentativa.
 * O jogo continua até que o jogador acerte o número sorteado.
 */
public class service_jogo {
    private int numeroSorteado;
    private Random random;

    /**
     * Construtor da classe. Gera um número sorteado aleatório entre 1 e 100.
     */
    public service_jogo() {
        random = new Random();
        numeroSorteado = random.nextInt(100) + 1;
    }

    /**
     * Método principal do jogo. Permite que o jogador faça tentativas para adivinhar o número sorteado.
     */
    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int tentativa;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo! Tente adivinhar o número sorteado entre 1 e 100.");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número sorteado é menor.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (!acertou);

        scanner.close();
    }
}
