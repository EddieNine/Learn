package Revisão.Palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        // 3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        if(verificarPalindromo(texto)) {
            System.out.println("è um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        scanner.close();
    }

    public static boolean verificarPalindromo(String texto) {
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String textoReverso = new StringBuilder(textoLimpo).reverse().toString();

        return textoLimpo.equals(textoReverso);
    }
}
