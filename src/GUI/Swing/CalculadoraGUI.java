package GUI.Swing;

import javax.swing.*;

public class CalculadoraGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");

        JTextField texto1 = new JTextField();
        texto1.setBounds(50, 50, 150, 20);

        JTextField texto2 = new JTextField();
        texto2.setBounds(50, 100, 150, 20);

        JTextField resultado = new JTextField();
        resultado.setBounds(50, 205, 150, 20);
        resultado.setEditable(false);

        JButton botaoSomar = new JButton("➕");
        botaoSomar.setBounds(50, 150, 53, 53);
        botaoSomar.addActionListener(e -> {
            int num1 = Integer.parseInt(texto1.getText());
            int num2 = Integer.parseInt(texto2.getText());
            resultado.setText(String.valueOf(num1 + num2));
        });

        JButton botaoSubtrair = new JButton("➖");
        botaoSubtrair.setBounds(100, 150, 53, 53);
        botaoSubtrair.addActionListener(e -> {
            int num1 = Integer.parseInt(texto1.getText());
            int num2 = Integer.parseInt(texto2.getText());
            resultado.setText(String.valueOf(num1 - num2));
        });

        JButton botaoMultiplicar = new JButton("✖️");
        botaoMultiplicar.setBounds(150, 150, 53, 53);
        botaoMultiplicar.addActionListener(e -> {
            int num1 = Integer.parseInt(texto1.getText());
            int num2 = Integer.parseInt(texto2.getText());
            resultado.setText(String.valueOf(num1 * num2));
        });

        JButton botaoDivisao = new JButton("➗");
        botaoDivisao.setBounds(200, 150, 53, 53);
        botaoDivisao.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(texto1.getText());
                int num2 = Integer.parseInt(texto2.getText());
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Erro! Divisão por zero.");
                }
                resultado.setText(String.valueOf(num1 / num2));
            } catch (ArithmeticException a) {
                System.out.println("Não pode divisão por zero.");
            }
        });

        // Adicionando componentes ao frame
        frame.add(texto1);
        frame.add(texto2);
        frame.add(resultado);
        frame.add(botaoSomar);
        frame.add(botaoSubtrair);
        frame.add(botaoMultiplicar);
        frame.add(botaoDivisao);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
