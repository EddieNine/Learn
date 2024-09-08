package GUI.Swing.InterfaceGraficaUX;

import javax.swing.*;
import java.awt.*;

public class ExemploGridBagLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo GridBagLayout");
        frame.setLayout(new GridLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botão 4");

        // Configurando o layout
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(botao1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(botao2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        frame.add(botao3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        frame.add(botao4, gbc);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
