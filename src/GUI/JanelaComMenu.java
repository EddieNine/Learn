package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaComMenu {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame frame = new JFrame("Janela com Menu");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar a barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Criar os menus
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuEditar = new JMenu("Editar");

        // Criar os itens de menu para o menu "Arquivo"
        JMenuItem itemNovo = new JMenuItem("Novo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemSair = new JMenuItem("Sair");

        // Criar os itens de menu para o menu "Editar"
        JMenuItem itemCopiar = new JMenuItem("Copiar");
        JMenuItem itemColar = new JMenuItem("Colar");

        // Adicionar os itens ao menu "Arquivo"
        menuArquivo.add(itemNovo);
        menuArquivo.add(itemAbrir);
        menuArquivo.addSeparator(); // Adiciona um separador entre itens
        menuArquivo.add(itemSair);

        // Adicionar os itens ao menu "Editar"
        menuEditar.add(itemCopiar);
        menuEditar.add(itemColar);

        // Adicionar os menus à barra de menu
        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);

        // Adicionar a barra de menu à janela
        frame.setJMenuBar(menuBar);

        // Ação para o item "Sair"
        itemSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Encerra a aplicação
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
