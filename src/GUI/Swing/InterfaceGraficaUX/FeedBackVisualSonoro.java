package GUI.Swing.InterfaceGraficaUX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeedBackVisualSonoro extends JFrame {
    JButton botao;

    public FeedBackVisualSonoro() {
        botao = new JButton("Clique aqui");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botao.setBackground(Color.GREEN);
                Toolkit.getDefaultToolkit().beep(); // Som
                JOptionPane.showMessageDialog(null, "Botão clicado!");
            }
        });

        add(botao);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FeedBackVisualSonoro();
    }
}
