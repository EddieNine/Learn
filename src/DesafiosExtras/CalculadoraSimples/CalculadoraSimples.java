package DesafiosExtras.CalculadoraSimples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimples extends JFrame {

    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JTextField campoResultado;

    public CalculadoraSimples() {
        // Configurações da janela
        setTitle("Calculadora Simples");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new GridLayout(4, 2)); // Usando GridLayout para organização

        // Campo para o primeiro número
        add(new JLabel("Número 1:"));
        campoNumero1 = new JTextField(10);
        add(campoNumero1);

        // Campo para o segundo número
        add(new JLabel("Número 2:"));
        campoNumero2 = new JTextField(10);
        add(campoNumero2);

        // Botões para as operações
        JButton botaoSoma = new JButton("+");
        JButton botaoSubtracao = new JButton("-");
        JButton botaoMultiplicacao = new JButton("*");
        JButton botaoDivisao = new JButton("/");

        // Campo de resultado
        campoResultado = new JTextField(10);
        campoResultado.setEditable(false); // Não pode ser editado
        add(new JLabel("Resultado:"));
        add(campoResultado);

        // Adiciona os botões à janela
        add(botaoSoma);
        add(botaoSubtracao);
        add(botaoMultiplicacao);
        add(botaoDivisao);

        // Adicionando os ActionListeners para os botões
        botaoSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacao("+");
            }
        });

        botaoSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacao("-");
            }
        });

        botaoMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacao("*");
            }
        });

        botaoDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacao("/");
            }
        });

        // Torna a janela visível
        setVisible(true);
    }

    // Método para realizar as operações
    private void realizarOperacao(String operacao) {
        try {
            double numero1 = Double.parseDouble(campoNumero1.getText());
            double numero2 = Double.parseDouble(campoNumero2.getText());
            double resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não permitida.", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    resultado = numero1 / numero2;
                    break;
            }

            // Exibe o resultado no campo de resultado
            campoResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException ex) {
            // Exibe uma mensagem de erro se houver problema na conversão
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculadoraSimples();
    }
}
