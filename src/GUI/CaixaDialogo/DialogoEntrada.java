package GUI.CaixaDialogo;

import javax.swing.*;

public class DialogoEntrada {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        if(nome != null) {
            System.out.println("Olá, " + nome + "!");
        } else {
            System.out.println("Nenhum nome foi inserido.");
        }
    }
}
