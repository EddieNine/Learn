package GUI.Swing.MenusJanelasModais;

import javax.swing.*;

public class DialogoPersonalizado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Diálogo Personalizado");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton deleteButton = new JButton("Excluir Arquivo");
        deleteButton.setBounds(100, 100, 200, 50);
        deleteButton.addActionListener(e -> {
            int resposta = JOptionPane.showConfirmDialog(frame, "Tem certeza que deseja excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_NO_OPTION) {
                JOptionPane.showMessageDialog(frame, "Arquivo excluído com sucesso.");
            } else {
                JOptionPane.showMessageDialog(frame, "Ação cancelada.");
            }
        });

        frame.setLayout(null);
        frame.add(deleteButton);
        frame.setVisible(true);
    }
}
