package GUI;

import javax.swing.JFrame;

public class JanelaBasica {
    public static void main(String[] args) {
        // Criando uma nova janela
        JFrame janela = new JFrame("Minha Primeira Janela");

        // Definindo o tamanho da janela (largura, altura)
        janela.setSize(400, 300);

        // Configurando a operação de fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tornando a janela visível
        janela.setVisible(true);
    }
}
