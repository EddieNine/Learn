package GUI.CaixaDialogo;

import javax.swing.*;

public class OperacaoMatematica {
    public static void main(String[] args) {
        int result = 0;

        while (true) {
            try {
                String operacaoInput = JOptionPane.showInputDialog("""
                        Escolha a operação:
                                       \s
                        [1] ADIÇÃO
                        [2] SUBTRAÇÃO
                        [3] MULTIPLICAÇÃO
                        [4] DIVISÃO
                        Clique em "CANCELAR" para sair""");

                if (operacaoInput == null) {
                    // Se o usuário clicar em "Cancelar", encerra o programa
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;
                }

                int operacao = Integer.parseInt(operacaoInput);

                String num1Input = JOptionPane.showInputDialog("Digite o primeiro valor:");
                if (num1Input == null) break;
                int num1 = Integer.parseInt(num1Input);

                String num2Input = JOptionPane.showInputDialog("Digite o segundo valor:");
                if (num2Input == null) break;
                int num2 = Integer.parseInt(num2Input);

                switch (operacao) {
                    case 1:
                        result = num1 + num2;
                        JOptionPane.showMessageDialog(null, "O resultado da adição é: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + result);
                        break;
                    case 4:
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(null, "ERRO! Divisão por zero.");
                        } else {
                            result = num1 / num2;
                            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + result);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operação inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
            }
        }
    }
}
