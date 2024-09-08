package GUI.Swing.InterfaceGraficaUX;

import javax.swing.*;
import java.awt.*;

public class InterfaceResponsiva extends JFrame {
    public InterfaceResponsiva() {
        setLayout(new GridLayout(0, 1)); // Ajusta automaticamente o número de linhas
        
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        
        add(botao1);
        add(botao2);
        add(botao3);
        
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfaceResponsiva();
    }
}
