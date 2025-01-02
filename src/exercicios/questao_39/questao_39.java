package src.exercicios.questao_39;

import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;
    int limiteMinimo;

    public Produto(String nome, int quantidade, int limiteMinimo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.limiteMinimo = limiteMinimo;
    }

    public boolean precisaReposicao() {
        return quantidade <= limiteMinimo;
    }
}

public class questao_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Adicionar produto");
            System.out.println("2. Verificar estoque");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = scanner.next();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                System.out.print("Limite mínimo: ");
                int limite = scanner.nextInt();

                estoque.add(new Produto(nome, quantidade, limite));
                System.out.println("Produto adicionado!");

            } else if (opcao == 2) {
                System.out.println("\nEstoque atual:");
                for (Produto p : estoque) {
                    System.out.printf("Produto: %s | Quantidade: %d | Limite: %d\n", p.nome, p.quantidade, p.limiteMinimo);
                    if (p.precisaReposicao()) {
                        System.out.println("⚠️  Atenção: Reposição necessária!");
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Encerrando programa...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}

