package GUI.Swing.InterfaceGraficaUX;

import javax.swing.*;

public class CustomLookAndFeel {
    public static void main(String[] args) {
        try {
            // Definindo o tema Nimbus para a aplicação
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Criando uma interface simples
        JFrame frame = new JFrame("Aplicação com Estilo Customizado");
        JButton botao = new JButton("Clique Aqui");

        frame.add(botao);
        frame.setSize(300, 20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
