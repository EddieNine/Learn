package GUI.JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);

        //int num = JOptionPane.showConfirmDialog(null, "bro,do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("Hello " + name);

        String[] responses = {"No, you're awesome!", "Thank you!", "Blush"};

        JOptionPane.showOptionDialog(null, "You are awesome!", "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, responses, 0);

    }
}
