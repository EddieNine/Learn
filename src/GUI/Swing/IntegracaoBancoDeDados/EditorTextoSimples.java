package GUI.Swing.IntegracaoBancoDeDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class EditorTextoSimples extends JFrame implements ActionListener {
    JTextArea areaTexto;
    JFileChooser seletorArquivo;

    public EditorTextoSimples() {
        areaTexto = new JTextArea();
        seletorArquivo = new JFileChooser();

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem novoItem = new JMenuItem("Novo");
        JMenuItem abrirItem = new JMenuItem("Abrir");
        JMenuItem salvarItem = new JMenuItem("Salvar");
        JMenuItem sairItem = new JMenuItem("Sair");

        novoItem.addActionListener(this);
        abrirItem.addActionListener(this);
        salvarItem.addActionListener(this);
        sairItem.addActionListener(this);

        menuArquivo.add(novoItem);
        menuArquivo.add(abrirItem);
        menuArquivo.add(salvarItem);
        menuArquivo.addSeparator();
        menuArquivo.add(sairItem);
        menuBar.add(menuArquivo);

        setJMenuBar(menuBar);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        setTitle("Editor de Texto Simples");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("Novo")) {
            areaTexto.setText("");
        } else if (comando.equals("Abrir")) {
            int retorno = seletorArquivo.showOpenDialog(this);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arquivo = seletorArquivo.getSelectedFile();
                try {
                    BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
                    areaTexto.read(leitor, null);
                    leitor.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo.");
                }
            }
        } else if (comando.equals("Salvar")) {
            int retorno = seletorArquivo.showSaveDialog(this);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arquivo = seletorArquivo.getSelectedFile();
                try {
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo));
                    areaTexto.write(escritor);
                    escritor.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo.");
                }
            }
        } else if (comando.equals("Sair")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new EditorTextoSimples().setVisible(true);
    }
}
