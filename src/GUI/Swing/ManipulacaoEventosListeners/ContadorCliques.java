package GUI.Swing.ManipulacaoEventosListeners;

import javax.swing.*;

public class ContadorCliques {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contador de Cliques");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("CLiques: 0");
        label.setBounds(50, 50, 200, 30);

        JButton button = new JButton("Clique aqui");
        button.setBounds(50, 100, 150, 30);

        // Variável para contar cliques
        final int[] contador = {0};

        // Adicionando ação ao botão
        button.addActionListener(e -> {
            contador[0]++;
            label.setText("Cliques: " + contador[0]);
        });

        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
