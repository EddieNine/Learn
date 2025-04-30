package cursoBackend.Semana1;

import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "";

        do {
            System.out.println("Digite um número para ver se é primo: ");
            int numero = scanner.nextInt();

           //scanner.nextLine();

            if(isPrimo(numero)) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }

            System.out.println("Quer Analisar outro número? s/n: ");
            continuar = scanner.next();
        } while (continuar.trim().equalsIgnoreCase("s"));

        System.out.println("Encerrando o programa. Até mais!");
        scanner.close();
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
