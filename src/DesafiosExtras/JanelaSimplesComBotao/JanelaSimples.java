package DesafiosExtras.JanelaSimplesComBotao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSimples extends JFrame {

    public JanelaSimples() {
        setTitle("Minha janela simples");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JButton button = new JButton("Clique Aqui");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão clickado!");
            }
        });

        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaSimples();
    }
}
