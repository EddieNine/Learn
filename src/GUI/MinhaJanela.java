package GUI;

import javax.swing.JFrame;

public class MinhaJanela {
    public static void main(String[] args) {
        // Criar uma nova janela (frame)
        JFrame frame = new JFrame("Minha Primeira Janela");

        // Definir o tamanho da janela
        frame.setSize(400, 300);

        // Configurar o comportamento de fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
