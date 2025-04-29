package cursoBackend.Semana1;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "";

        do {
            System.out.println("""
                Calculadora:
                [1] SOMAR
                [2] SUBTRAIR
                [3] DIVIDIR
                [4] MULTIPLICAR
                [0] SAIR""");

            System.out.print("Digite a operação desejada: ");
            int operacao = scanner.nextInt();

            if (operacao == 0) {
                System.out.println("Você está saindo do programa. Obrigado e até logo!");
                break;
            }

            if (operacao < 1 || operacao > 4) {
                System.out.println("Operação inválida! Tente novamente.");
                scanner.nextLine();
                continue;
            }

            System.out.println("Digite os valores que deseja fazer o calculo: ");

            System.out.println("Primeiro valor: ");
            double valor1 = scanner.nextDouble();
            System.out.println("Segundo valor: ");
            double valor2 = scanner.nextDouble();

            scanner.nextLine();

            switch (operacao) {
                case 1:
                    double resultado1 = valor1 + valor2;
                    System.out.println("A soma vale: " + resultado1);
                    break;
                case 2:
                    double resultado2 = valor1 - valor2;
                    System.out.println("A subtração vale: " + resultado2);
                    break;
                case 3:
                    if (valor2 == 0) {
                        System.out.println("Erro! Divisão por zero não é permitido!");
                    } else {
                        double resultado3 = valor1 / valor2;
                        System.out.println("A divisão vale: " + resultado3);
                    }
                    break;
                case 4:
                    double resultado4 = valor1 * valor2;
                    System.out.println("A multiplicação vale: " + resultado4);
                    break;
            }

            System.out.print("Quer continuar? (Sim ou Não): ");
            continuar = scanner.nextLine().trim();
        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
