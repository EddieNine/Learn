package DesafiosExtras.CalculadoraIMC;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite seu peso em quilogramas (kg): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Erro! Você deve digitar um número válido para o peso.");
            scanner.close();
            return;
        }
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros (m): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Erro! Você deve digitar um número válido para a altura.");
            scanner.close();
            return;
        }
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("IMC = %.2f - ", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal.");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau 1.");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau 2.");
        } else {
            System.out.println("Obesidade Grau 3 (mórbida).");
        }

        scanner.close();
    }
}
