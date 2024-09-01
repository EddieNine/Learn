package GUI.Swing;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroProdutoGUI {
    private List<String> produtos = new ArrayList<>();

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
        salvarButton.addActionListener(e -> {
            String produto = nomeField.getText() + " - R$ " + precoField.getText() + " - Quantidade: " + quantidadeField.getText();
            produtos.add(produto);
            JOptionPane.showMessageDialog(null, "Produto salvo: " + produto);
            nomeField.setText("");
            precoField.setText("");
            quantidadeField.setText("");
        });

        JButton exibirButton = new JButton("Exibir Produtos");
        exibirButton.setBounds(50, 240, 150, 30);
        exibirButton.addActionListener(e -> JOptionPane.showMessageDialog(null, produtos.toString()));

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

    public static void main(String[] args) {
        new CadastroProdutoGUI();
    }
}
