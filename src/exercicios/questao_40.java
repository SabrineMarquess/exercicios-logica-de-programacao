package src.exercicios;
import java.util.Scanner;

public class questao_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Eu sou o Chatbot de Atendimento. Como posso te ajudar?");
        System.out.println("1. Horário de funcionamento");
        System.out.println("2. Produtos disponíveis");
        System.out.println("3. Suporte técnico");
        System.out.println("4. Sair");

        while (true) {
            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nosso horário de funcionamento é de segunda a sexta, das 9h às 18h.");
                    break;
                case 2:
                    System.out.println("Atualmente, temos os seguintes produtos disponíveis: laptops, celulares, tablets.");
                    break;
                case 3:
                    System.out.println("Para suporte técnico, envie um e-mail para suporte@empresa.com.");
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Chatbot. Até mais!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

