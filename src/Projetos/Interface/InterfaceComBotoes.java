package Projetos.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class InterfaceComBotoes extends JFrame {

    public InterfaceComBotoes(){
        setTitle("Interface com Botões que Mudam de Cor");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

        JButton button1 = new JButton("Clique em mim!");
        JButton button2 = new JButton("E eu também!");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button1.setBackground(gerarCorAleatoria());
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button2.setBackground(gerarCorAleatoria());
            }
        });

        add(button1);
        add(button2);
    }

    private Color gerarCorAleatoria(){
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfaceComBotoes().setVisible(true);
            }
        });
    }
}
