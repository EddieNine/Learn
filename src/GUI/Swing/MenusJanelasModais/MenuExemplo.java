package GUI.Swing.MenusJanelasModais;

import javax.swing.*;

public class MenuExemplo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de menu");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem novoItem = new JMenuItem("Novo");
        JMenuItem abrirItem = new JMenuItem("Abrir");
        JMenuItem salvarItem = new JMenuItem("Salvar");
        JMenuItem sairItem = new JMenuItem("Sair");

        menuArquivo.add(novoItem);
        menuArquivo.add(abrirItem);
        menuArquivo.add(salvarItem);
        menuArquivo.addSeparator();
        menuArquivo.add(sairItem);

        menuBar.add(menuArquivo);
        frame.setJMenuBar(menuBar);

        // Ações dos itens de menu
        novoItem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Novo arquivo criado."));
        abrirItem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Abrir arquivo."));
        sairItem.addActionListener(e -> JOptionPane.showMessageDialog(null, "Salvar arquivo"));
        sairItem.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
