package DesafiosExtras.ConversorTemperatura;

import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a temperatura desejada: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Erro! Você deve digitar um número válido.");
            scanner.close();
            return;
        }
        double temp = scanner.nextDouble();

        System.out.println("Digite para qual unidade deseja converter (C = Celsius | F = Fahrenheit): ");
        String unidade = scanner.next().trim().toUpperCase();  // Usando scanner.next() para evitar problema de Enter

        if (unidade.equals("C")) {
            double c = (temp - 32.0) * 5.0 / 9.0;
            System.out.printf("Temperatura convertida: %.1f °C%n", c);
        } else if (unidade.equals("F")) {
            double f = (temp * 9.0 / 5.0) + 32.0;
            System.out.printf("Temperatura convertida: %.1f °F%n", f);
        } else {
            System.out.println("Erro! Unidade inválida. Digite 'C' para Celsius ou 'F' para Fahrenheit.");
        }

        scanner.close();
    }
}
