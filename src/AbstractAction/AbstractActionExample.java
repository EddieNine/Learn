package AbstractAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AbstractActionExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo com setEnabled");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Action minhaAcao = new AbstractAction("Clique aqui") {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ação executada!");
            }
        };

        JButton button = new JButton(minhaAcao);
        button.setBounds(50, 50, 150, 30);

        JButton toggleButton = new JButton("Habilitar/Desabilitar");
        toggleButton.setBounds(50, 100, 150, 30);

        toggleButton.addActionListener(e -> {
            boolean enabled = minhaAcao.isEnabled();
            minhaAcao.setEnabled(!enabled);
        });

        frame.add(button);
        frame.add(toggleButton);

        frame.setVisible(true);
    }
}
