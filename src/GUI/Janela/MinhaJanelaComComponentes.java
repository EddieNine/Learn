package GUI.Janela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanelaComComponentes {
    public static void main(String[] args) {
        // Criar uma nova janela
        JFrame frame = new JFrame("Minha Janela com Componentes");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Definir layout da janela
        frame.setLayout(new FlowLayout());

        // Criar um rótulo (label)
        JLabel label = new JLabel("Clique no botão!");

        // Criar um botão
        JButton button = new JButton("Clique aqui");

        // Adicionar uma ação ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Você clicou no botão!");
            }
        });

        // Adicionar o rótulo e o botão à janela
        frame.add(label);
        frame.add(button);

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
