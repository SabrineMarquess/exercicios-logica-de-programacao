package src.exercicios;

import java.util.Scanner;

public class questao_34 {
    public static void main(String[] args) {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data no formato (mês/ano):");
        String data = scanner.nextLine();

        int mesIndex = Integer.parseInt(data.split("/")[0]) - 1;

        if (mesIndex >= 0 && mesIndex < 12) {
            System.out.println("O mês é: " + meses[mesIndex]);
        } else {
            System.out.println("Mês inválido.");
        }

    }
}
