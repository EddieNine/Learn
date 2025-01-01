package Revisão.ContadorDePalavras;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        // 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        System.out.println("Número de palavras: " + palavras.length);

        scanner.close();

    }
}
