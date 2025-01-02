package src.exercicios;

import java.security.SecureRandom;
import java.util.Scanner;

public class questao_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.print("Digite o comprimento da senha desejada: ");
        int comprimento = scanner.nextInt();

        System.out.print("Incluir letras maiúsculas? (S/N): ");
        boolean incluirMaiusculas = scanner.next().equalsIgnoreCase("S");

        System.out.print("Incluir números? (S/N): ");
        boolean incluirNumeros = scanner.next().equalsIgnoreCase("S");

        System.out.print("Incluir caracteres especiais? (S/N): ");
        boolean incluirEspeciais = scanner.next().equalsIgnoreCase("S");

        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiais = "!@#$%^&*()-_=+<>?";

        String caracteres = minusculas;
        if (incluirMaiusculas) caracteres += maiusculas;
        if (incluirNumeros) caracteres += numeros;
        if (incluirEspeciais) caracteres += especiais;

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        System.out.println("Senha gerada: " + senha);
        scanner.close();
    }
}

