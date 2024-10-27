package Projetos.JogoDaVelha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9];
    private boolean jogadorX = true;

    public JogoDaVelha(){
        setTitle("Jogo da Velha");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();

        if(buttonClicked.getText().equals("")) {
            buttonClicked.setText(jogadorX ? "X" : "O");
            jogadorX = !jogadorX;
            verificarVencedor();
        }
    }

    public void verificarVencedor(){
        String[][] padraoVitoria = {
                {buttons[0].getText(), buttons[1].getText(), buttons[2].getText()},
                {buttons[3].getText(), buttons[4].getText(), buttons[5].getText()},
                {buttons[6].getText(), buttons[7].getText(), buttons[8].getText()},
                {buttons[0].getText(), buttons[3].getText(), buttons[6].getText()},
                {buttons[1].getText(), buttons[4].getText(), buttons[7].getText()},
                {buttons[2].getText(), buttons[5].getText(), buttons[8].getText()},
                {buttons[0].getText(), buttons[4].getText(), buttons[8].getText()},
                {buttons[2].getText(), buttons[4].getText(), buttons[6].getText()}
        };

        for (String[] linha : padraoVitoria) {
            if (linha[0].equals(linha[1]) && linha[0].equals(linha[2]) && !linha[0].equals("")) {
                JOptionPane.showMessageDialog(this, "Jogador " + linha[0] + " venceu!");
                resetarJogo();
                return;
            }
        }

        boolean empate = true;
        for(JButton button : buttons) {
            if (button.getText().equals("")) {
                empate = false;
                break;
            }
        }

        if(empate) {
            JOptionPane.showMessageDialog(this, "Empate!");
            resetarJogo();
        }

    }

    public void resetarJogo(){
        for (JButton button : buttons) {
            button.setText("");
        }
        jogadorX = true;
    }

    public static void main(String[] args) {
        new JogoDaVelha();
    }
}
