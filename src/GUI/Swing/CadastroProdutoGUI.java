package GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CadastroProdutoGUI {
    private List<String> produtos = new ArrayList<>();
    private static final String ARQUIVO_PRODUTOS = "src/GUI/Swing/produtos.txt";

    public CadastroProdutoGUI() {
        JFrame frame = new JFrame("Cadastro de Produto");

        JLabel nomeLabel = new JLabel("Nome do Produto:");
        nomeLabel.setBounds(50, 50, 150, 20);

        JTextField nomeField = new JTextField();
        nomeField.setBounds(50, 70, 150, 20);

        JLabel precoLabel = new JLabel("Preço:");
        precoLabel.setBounds(50, 100, 150, 20);

        JTextField precoField = new JTextField();
        precoField.setBounds(50, 120, 150, 20);

        JLabel quantidadeLabel = new JLabel("Quantidade:");
        quantidadeLabel.setBounds(50, 150, 150, 20);

        JTextField quantidadeField = new JTextField();
        quantidadeField.setBounds(50, 170, 150, 20);

        JButton salvarButton = new JButton("Salvar");
        salvarButton.setBounds(50, 200, 150, 30);
        salvarButton.addActionListener(e -> salvarProduto(nomeField, precoField, quantidadeField));

        JButton exibirButton = new JButton("Exibir Produtos");
        exibirButton.setBounds(50, 240, 150, 30);
        exibirButton.addActionListener(e -> exibirProdutos());


        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(precoLabel);
        frame.add(precoField);
        frame.add(quantidadeLabel);
        frame.add(quantidadeField);
        frame.add(salvarButton);
        frame.add(exibirButton);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void salvarProduto(JTextField nomeField, JTextField precoField, JTextField quantidadeField) {
        String nome = nomeField.getText();
        String precoText = precoField.getText();
        String quantidadeText = quantidadeField.getText();

        if (nome.isEmpty() || precoText.isEmpty() || quantidadeText.isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Todos os campos ser preenchidos.");
            return;
        }

        try {
            double preco = Double.parseDouble(precoText);
            int quantidade = Integer.parseInt(quantidadeText);

            String produto = String.format("Nome: %s | Preço: R$ %.2f | Quantidade: %d", nome, preco, quantidade);
            produtos.add(produto);
            salvarProdutoNoArquivo(produto);
            JOptionPane.showMessageDialog(null, "Produto salvo:\n" + produto);

            nomeField.setText("");
            precoField.setText("");
            quantidadeField.setText("");
        } catch (NumberFormatException ex) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado.");
        }
    }

    private void salvarProdutoNoArquivo(String produto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_PRODUTOS, true))) {
            writer.write(produto);
            writer.newLine();
        } catch (IOException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Erro ao salvar o produto no arquivo.");
        }
    }

    private void exibirProdutos(){
        if (produtos.isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado.");
        } else {
            StringBuilder listaProdutos = new StringBuilder();
            for (String produto : produtos) {
                listaProdutos.append(produto).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaProdutos.toString());
        }
    }

    public static void main(String[] args) {
        new GUI.Swing.CadastroProdutoGUI();
    }
}
