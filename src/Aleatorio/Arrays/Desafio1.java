package Aleatorio.Arrays;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Criando o array com 5 posições

        System.out.println("Digite 5 números inteiros:");

        // Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Lê e armazena no array
        }

        // Exibição dos valores
        System.out.println("\nNúmeros digitados:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
