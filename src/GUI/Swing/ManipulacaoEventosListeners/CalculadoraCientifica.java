package GUI.Swing.ManipulacaoEventosListeners;

import javax.swing.*;
import java.awt.*;

public class CalculadoraCientifica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Cientifica");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField display = new JTextField();
        display.setBounds(50, 25, 300, 50);

        JButton[] botaoNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botaoNumeros[i] = new JButton(String.valueOf(i));
        }

        JButton botaoAdicao = new JButton("+");
        JButton botaoSubtracao = new JButton("-");
        JButton botaoMultiplicacao = new JButton("*");
        JButton botaoDivisao = new JButton("/");
        JButton botaoRaizQuadrada = new JButton("√");
        JButton botaoExponenciacao = new JButton("^");
        JButton botaoIgual = new JButton("=");

        // Configurando layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        for (int i = 1; i < 10; i++) {
            panel.add(botaoNumeros[i]);
        }

        panel.add(botaoAdicao);
        panel.add(botaoNumeros[0]);
        panel.add(botaoSubtracao);
        panel.add(botaoMultiplicacao);
        panel.add(botaoDivisao);
        panel.add(botaoRaizQuadrada);
        panel.add(botaoExponenciacao);
        panel.add(botaoIgual);

        frame.setLayout(new BorderLayout());
        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Implementação de eventos para botões
        for (JButton botao : botaoNumeros) {
            botao.addActionListener(e -> display.setText(display.getText() + e.getActionCommand()));
        }

        botaoAdicao.addActionListener(e -> display.setText(display.getText() + "+"));
        botaoSubtracao.addActionListener(e -> display.setText(display.getText() + "-"));
        botaoMultiplicacao.addActionListener(e -> display.setText(display.getText() + "*"));
        botaoDivisao.addActionListener(e -> display.setText(display.getText() + "/"));
        botaoRaizQuadrada.addActionListener(e -> {
            double valor = Math.sqrt(Double.parseDouble(display.getText()));
            display.setText(String.valueOf(valor));
        });
        botaoExponenciacao.addActionListener(e -> display.setText(display.getText() + "^"));
        botaoIgual.addActionListener(e -> {
            try {
                double resultado = eval(display.getText());
                display.setText(String.valueOf(resultado));
            } catch (Exception ex) {
                display.setText("Erro");
            }
        });

        frame.setVisible(true);
    }

    // Função para avaliar expressões matemáticas simples
    public static double eval(String expressao) {
        return new Object() {
            int pos = -1, ch;

            void proximoChar() {
                ch = (++pos < expressao.length()) ? expressao.charAt(pos) : -1;
            }

            boolean comer(int charEsperado) {
                while (ch == ' ') proximoChar();
                if (ch == charEsperado) {
                    proximoChar();
                    return true;
                }
                return false;
            }

            double parse() {
                proximoChar();
                double x = parseExpressao();
                if (pos < expressao.length()) throw new RuntimeException("Caractere inesperado: " + (char) ch);
                return x;
            }

            double parseExpressao() {
                double x = parseTermo();
                for (; ; ) {
                    if (comer('+')) x += parseTermo();
                    else if (comer('-')) x -= parseTermo();
                    else return x;
                }
            }

            double parseTermo() {
                double x = parseFator();
                for (; ; ) {
                    if (comer('*')) x *= parseFator();
                    else if (comer('/')) x /= parseFator();
                    else return x;
                }
            }

            double parseFator() {
                if (comer('+')) return parseFator();
                if (comer('-')) return -parseFator();

                double x;
                int startPos = this.pos;
                if (comer('(')) {
                    x = parseExpressao();
                    comer(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') proximoChar();
                    x = Double.parseDouble(expressao.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') proximoChar();
                    String func = expressao.substring(startPos, this.pos);
                    x = parseFator();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else throw new RuntimeException("Função desconhecida: " + func);
                } else {
                    throw new RuntimeException("Caractere inesperado: " + (char) ch);
                }

                if (comer('^')) x = Math.pow(x, parseFator());

                return x;
            }
        }.parse();
    }
}
