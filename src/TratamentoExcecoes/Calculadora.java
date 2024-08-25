package TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do {
            try {
                System.out.println("\033[32mCalculadora Java\033[m");

                System.out.println("Digite o 1° valor: ");
                int numero1 = scanner.nextInt();

                System.out.println("Digite o 2° valor: ");
                int numero2 = scanner.nextInt();

                System.out.println("""
                    Operadores:\s
                    [1] SOMA
                    [2] SUBTRAÇÃO
                    [3] DIVISÃO
                    [4] MULTIPLICAÇÃO
                    [0] SAIR""");
                System.out.println("Qual operação deseja? ");
                operacao = scanner.nextInt();
                int soma = 0;
                switch (operacao) {
                    case 1:
                        soma = numero1 + numero2;
                        break;
                    case 2:
                        soma = numero1 - numero2;
                        break;
                    case 3:
                        if (numero2 == 0) {
                            throw new ArithmeticException("Divisão por zero!");
                        }
                        soma = numero1 / numero2;
                        break;
                    case 4:
                        soma = numero1 * numero2;
                        break;
                    case 0:
                        System.out.println("Calculadora finalizada. Até logo!");
                        break;
                    default:
                        System.out.println("Operação invalida! Tente novamente.");
                        continue;
                }
                if (operacao != 0) {
                    System.out.println("O resultado: " + soma);
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro! " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor númerico");
                scanner.nextLine();
            }
        } while (operacao != 0);
    }
}
