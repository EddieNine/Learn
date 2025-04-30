package cursoBackend.Semana1;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "";

        do {
            mostrarMenu();
            int operacao = obterOperacao(scanner);

            if (operacao == 0) {
                System.out.println("Você está saindo do programa. Obrigado e até logo!");
                break;
            }

            double valor1 = obterValor(scanner, "Primeiro valor: ");
            double valor2 = obterValor(scanner, "Segundo valor: ");

            switch (operacao) {
                case 1:
                    somar(valor1, valor2);
                    break;
                case 2:

                    subtrair(valor1, valor2);
                    break;
                case 3:
                    dividir(valor1, valor2);
                    break;
                case 4:
                    multiplicar(valor1, valor2);
                    break;
            }

            System.out.print("Quer continuar? (Sim ou Não): ");
            continuar = scanner.nextLine().trim();

        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static void mostrarMenu(){
        System.out.println("""
                Calculadora:
                [1] SOMAR
                [2] SUBTRAIR
                [3] DIVIDIR
                [4] MULTIPLICAR
                [0] SAIR""");
    }

    public static int obterOperacao(Scanner scanner) {
        int operacao = -1;
        while (operacao < 0 || operacao > 4) {
            System.out.println("Digite a operação desejada: ");
            if(scanner.hasNextInt()) {
                operacao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida! Por favor, insira um número entre 0 e 4.");
                scanner.nextLine();
            }
        }
        return operacao;
    }

    public static double obterValor(Scanner scanner, String mensagem) {
        double valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                valorValido = true;
            } else {
                System.out.println("Valor inválido! Tente novamente.");
                scanner.nextLine(); // Limpa o buffer de entrada inválida
            }
        }
        scanner.nextLine(); // Limpa o buffer
        return valor;
    }
    
    public static void somar(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        System.out.println("A soma vale: " + resultado);
    }
    
    public static void subtrair(double valor1, double valor2) {
        double resultado = valor1 - valor2;
        System.out.println("A subtração vale: " + resultado);
    }
    
    public static void dividir(double valor1, double valor2){
        if(valor2 == 0) {
            System.out.println("Erro! Divivão por zero não é permitida.");
        } else {
            double resultado = valor1 / valor2;
            System.out.println("A divisão vale: " + resultado);
        }
    }
    
    public static void multiplicar(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        System.out.println("A multiplicação vale: " + resultado);
    }
}
