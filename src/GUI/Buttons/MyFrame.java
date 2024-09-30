package GUI.Buttons;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("image.png");

        label = new JLabel();
        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("Poo"));
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); // disable button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }
}
