package src.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class questao_30 {
    public static void main(String[] args) {
        // Fornecendo algumas informações: Quanto eu ganho por mês, quanto eu
        // tenho na minha conta e quanto eu gasto mensalmente
        // quero um código que calcule a previsão do valor que vou ter em conta
        // nos meses do ano.
        Scanner scanner = new Scanner(System.in);
        double valorAtual, rendaMensal, despesaMensal;
        System.out.print("Qual o valor total presente na sua conta atualmente");
        valorAtual = scanner.nextDouble();
        double valorCalculado = valorAtual;
        System.out.println("Quanto é o total de suas rendas mensais?");
        rendaMensal = scanner.nextDouble();
        System.out.println("Quanto é o total de suas despesas mensais?");
        despesaMensal = scanner.nextDouble();

        int mesAtual = LocalDate.now().getMonth().getValue();

        for (int numeroDoMes = LocalDate.now().getMonth().getValue(); numeroDoMes <= 12; numeroDoMes++) {
            if (numeroDoMes == mesAtual) {
                System.out.println("No mês: " + numeroDoMes + " sua renda final é de: " + valorAtual);
            } else {
                valorCalculado = valorCalculado + rendaMensal - despesaMensal;
                System.out.println("No mês: " + numeroDoMes + " sua renda final é de: " + valorCalculado);
            }
        }
    }


}
