package Projetos.BlocoDeNotas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class BlocoDeNotas extends JFrame implements ActionListener {
    JTextArea areaDeTexto;
    JMenuBar barraMenu;
    JMenu menuArquivo;
    JMenuItem abrirItem, salvarItem, sairItem;

    public BlocoDeNotas(){
        setTitle("Bloco de Notas");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        areaDeTexto =  new JTextArea();
        JScrollPane scrollPane =  new JScrollPane(areaDeTexto);
        add(scrollPane);

        barraMenu =  new JMenuBar();
        menuArquivo = new JMenu("Arquivo");

        abrirItem = new JMenuItem("Abrir");
        salvarItem =  new JMenuItem("Salvar");
        sairItem = new JMenuItem("Sair");

        menuArquivo.add(abrirItem);
        menuArquivo.add(salvarItem);
        menuArquivo.addSeparator();
        menuArquivo.add(sairItem);

        barraMenu.add(menuArquivo);

        setJMenuBar(barraMenu);

        abrirItem.addActionListener(this);
        salvarItem.addActionListener(this);
        sairItem.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BlocoDeNotas().setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == abrirItem) {
            abrirArquivo();
        } else if (e.getSource() == salvarItem) {
            salvarArquivo();
        } else if (e.getSource() == sairItem) {
            System.exit(0);
        }
    }

    private void abrirArquivo(){
        JFileChooser fileChooser = new JFileChooser();
        int escolha = fileChooser.showOpenDialog(this);

        if ( escolha == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                areaDeTexto.read(leitor, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void salvarArquivo() {
        JFileChooser fileChooser = new JFileChooser();
        int escolha = fileChooser.showSaveDialog(this);

        if(escolha == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            try(BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
                areaDeTexto.write(escritor);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
