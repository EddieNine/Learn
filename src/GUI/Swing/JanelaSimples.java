package GUI.Swing;

import javax.swing.*;

public class JanelaSimples {
    public static void main(String[] args) {
        // Criando a janela
        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando o botão
        JButton button = new JButton("Clique aqui");
        button.setBounds(130, 100, 150, 40);

        // Adicionando ação ao botão
        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Botão clicado!"));

        // Adicionando o botão na janela
        frame.add(button);
        frame.setLayout(null); // Desativando o layout manager
        frame.setVisible(true); // Tornando a janela visível
    }
}
