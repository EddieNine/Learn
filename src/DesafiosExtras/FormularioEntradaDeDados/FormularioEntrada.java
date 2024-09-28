package DesafiosExtras.FormularioEntradaDeDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioEntrada extends JFrame {

    private JTextField campoNome;
    private JTextField campoIdade;

    public FormularioEntrada() {
        // Configurações da janela
        setTitle("Formulário de Entrada");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new FlowLayout());

        // Rótulo e campo para o nome
        add(new JLabel("Nome:"));
        campoNome = new JTextField(15);
        add(campoNome);

        // Rótulo e campo para a idade
        add(new JLabel("Idade:"));
        campoIdade = new JTextField(5);
        add(campoIdade);

        // Botão de envio
        JButton botaoEnviar = new JButton("Enviar");
        add(botaoEnviar);

        // Adiciona um ActionListener ao botão
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String idadeTexto = campoIdade.getText();

                // Validação para verificar se a idade é um número
                try {
                    int idade = Integer.parseInt(idadeTexto);
                    // Exibe uma mensagem com o nome e a idade
                    JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
                } catch (NumberFormatException ex) {
                    // Exibe uma mensagem de erro se a idade não for numérica
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para a idade.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularioEntrada();
    }
}
