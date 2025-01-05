package Revisão.NumerosPrimos;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        //1

        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Digite um numero inteiro para verificar se é primo: ");
            int numero = scanner.nextInt();

            if(isPrimo(numero)) {
                System.out.println("O numero " + numero + " é primo");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }

            System.out.println("Quer continuar? (sim/não): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Encerrando o programa. Até mais!");
        scanner.close();
    }

    public static boolean isPrimo(int numero ){
        if(numero <= 1) {
            return false;
        }

        for(int i = 2; i < Math.sqrt(numero); i ++) {
            if(numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
