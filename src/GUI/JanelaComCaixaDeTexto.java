package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaComCaixaDeTexto {
    public static void main(String[] args) {
        // Criar uma nova janela
        JFrame frame = new JFrame("Janela com Caixa de Texto");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Definir layout da janela
        frame.setLayout(new FlowLayout());

        // Criar um rótulo
        JLabel label = new JLabel("Digite algo:");

        // Criar uma caixa de texto
        JTextField textField = new JTextField(20); // 20 colunas de largura

        // Criar uma área de texto
        JTextArea textArea = new JTextArea(10, 30); // 10 linhas e 30 colunas
        textArea.setLineWrap(true); // Quebra de linha automática
        textArea.setWrapStyleWord(true); // Quebra de linha por palavras

        // Criar um botão
        JButton button = new JButton("Mostrar Texto");

        // Adicionar ação ao botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText(); // Obter texto da caixa de texto
                textArea.setText(texto); // Exibir texto na área de texto
            }
        });

        // Adicionar componentes à janela
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(textArea);

        // Tornar a janela visivel
        frame.setVisible(true);
    }
}
