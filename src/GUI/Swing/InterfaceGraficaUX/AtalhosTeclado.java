package GUI.Swing.InterfaceGraficaUX;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AtalhosTeclado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Atalhos de Teclado");
        JMenuBar menuBar = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem abrirItem = new JMenuItem("Abrir");
        JMenuItem salvarItem = new JMenuItem("Salvar");

        // Adicionando atalhos de teclado
        abrirItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        salvarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));

        menuArquivo.add(abrirItem);
        menuArquivo.add(salvarItem);
        menuBar.add(menuArquivo);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
