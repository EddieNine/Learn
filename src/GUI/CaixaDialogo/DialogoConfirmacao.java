package GUI.CaixaDialogo;

import javax.swing.*;

public class DialogoConfirmacao {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_NO_OPTION) {
            System.out.println("Usuário escolheu sair.");
        } else {
            System.out.println("usuário escolheu ficar.");
        }
    }
}
