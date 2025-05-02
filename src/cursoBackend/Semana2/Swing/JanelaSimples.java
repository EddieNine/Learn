package cursoBackend.Semana2.Swing;

import javax.swing.*;

public class JanelaSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha primeira Janela");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField textField = new JTextField(20);

        JLabel label = new JLabel("Bem-vindo");
        JButton button = new JButton("CLique em mim!");

        button.addActionListener(e -> {
            String textoDigitado = textField.getText();
            label.setText("Você digitou: " + textoDigitado);
        });

        panel.add(textField);
        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
