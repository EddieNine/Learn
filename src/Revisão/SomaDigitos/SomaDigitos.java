package Revisão.SomaDigitos;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if(numero < 0) {
            System.out.println("Por favor, insira um número positivo.");
            return;
        } else {
            int soma = 0;
            int temp = numero;

            while (temp > 0) {
                soma += temp % 10;
                temp /= 10;
            }

            System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
        }
        scanner.close();
    }
}
