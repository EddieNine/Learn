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
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new GridBagLayout()); // Usando GridBagLayout para mais controle
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL; // Para preencher o espaço horizontalmente

        // Campo para o primeiro número
        gbc.gridx = 0; // Coluna 0
        gbc.gridy = 0; // Linha 0
        add(new JLabel("Número 1:"), gbc);

        gbc.gridx = 1; // Coluna 1
        campoNumero1 = new JTextField(10);
        add(campoNumero1, gbc);

        // Campo para o segundo número
        gbc.gridx = 0; // Coluna 0
        gbc.gridy = 1; // Linha 1
        add(new JLabel("Número 2:"), gbc);

        gbc.gridx = 1; // Coluna 1
        campoNumero2 = new JTextField(10);
        add(campoNumero2, gbc);

        // Campo de resultado
        gbc.gridx = 0; // Coluna 0
        gbc.gridy = 2; // Linha 2
        add(new JLabel("Resultado:"), gbc);

        gbc.gridx = 1; // Coluna 1
        campoResultado = new JTextField(10);
        campoResultado.setEditable(false); // Não pode ser editado
        add(campoResultado, gbc);

        // Painel para os botões de operação
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(1, 4, 10, 10)); // Grid para os botões com espaço
        JButton botaoSoma = new JButton("+");
        JButton botaoSubtracao = new JButton("-");
        JButton botaoMultiplicacao = new JButton("*");
        JButton botaoDivisao = new JButton("/");

        painelBotoes.add(botaoSoma);
        painelBotoes.add(botaoSubtracao);
        painelBotoes.add(botaoMultiplicacao);
        painelBotoes.add(botaoDivisao);

        // Adiciona o painel de botões à interface
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Painel de botões ocupa duas colunas
        add(painelBotoes, gbc);

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
