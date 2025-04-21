package Aleatorio.Arrays;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // TODO: Encontrar o maior número digitado
        int maior = numeros[0]; // Começa assumindo que o primeiro é o maior

        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Exibição dos números
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Exibir o maior número
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
