package cursoBackend.Semana1;

import java.util.Scanner;

public class TabuadaComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "";

        do {
            System.out.println("Digite um valor para ver a sua tabuada: ");
            int numero = scanner.nextInt();

            scanner.nextLine();

            System.out.println("-=--=--=--=--=--=--=--=--=-");
           for(int i = 1; i <= 10; i++) {
               System.out.printf("%d x %2d = %d\n", numero, i, numero * i);
           }
           System.out.println("-=--=--=--=--=--=--=--=--=-");

            System.out.println("Gostaria de ver a tabuada de outro número: (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.trim().equalsIgnoreCase("s"));

        System.out.println("Obrigado! Até logo.");
        scanner.close();
    }
}
