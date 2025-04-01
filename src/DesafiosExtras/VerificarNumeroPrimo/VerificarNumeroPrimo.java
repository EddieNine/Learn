package DesafiosExtras.VerificarNumeroPrimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Erro! Digite um número inteiro válido.");
            scanner.close();
            return;
        }

        int numero = scanner.nextInt();

        if (isPrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
            System.out.println("Seus divisores: " + getDivisores(numero));
        }

        scanner.close();
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false; // Elimina números pares maiores que 2
        }

        for (int i = 3; i <= Math.sqrt(numero); i += 2) { // Incremento de 2 para ignorar pares
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getDivisores(int numero) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
}
