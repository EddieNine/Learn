package GUI.Swing.MenusJanelasModais;

import javax.swing.*;

public class ConfiguracoesJanela {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Janela Principal");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuOpcoes = new JMenu("Opções");
        JMenuItem configItem = new JMenuItem("Configurações");

        menuOpcoes.add(configItem);
        menuBar.add(menuOpcoes);
        frame.setJMenuBar(menuBar);

        configItem.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Configurações", true);
            dialog.setSize(300, 200);
            dialog.setLayout(null);

            JLabel label = new JLabel("Opções de Configuração:");
            label.setBounds(20, 20, 200, 30);
            dialog.add(label);

            JButton okButton = new JButton("OK");
            okButton.setBounds(100, 100, 80, 30);
            okButton.addActionListener(event -> dialog.dispose());

            dialog.add(okButton);
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });

        frame.setVisible(true);
    }
}
