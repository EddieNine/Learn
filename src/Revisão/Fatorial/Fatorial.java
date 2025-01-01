package Revisão.Fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if(numero < 0) {
            System.out.println("Por favor, insira um número não negativo.");
        } else {
            long resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }
        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for(int i = 1; i<=numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
