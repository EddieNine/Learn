package cursoBackend.Semana1;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar = "";

        do {
            System.out.println("Vamos analisar o número para saber se é par ou impar\n" +
                    "Digite um valor: ");

            int numero = scanner.nextInt();

            scanner.nextLine();

            if(numero % 2 == 0) {
                System.out.println("O número " + numero + " é par");
            } else {
                System.out.println("O número " + numero + " é impar");
            }

            System.out.println("Quer continuar? (sim ou não): ");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.trim().equalsIgnoreCase("sim"));

        System.out.println("Obrigado! Volte sempre.");
        scanner.close();
    }
}
