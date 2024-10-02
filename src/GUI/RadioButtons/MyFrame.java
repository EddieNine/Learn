package GUI.RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburguerButton;
    JRadioButton hotdogButton;
    ButtonGroup gruop;
    ImageIcon pizzaIcon;
    ImageIcon hamburguerIcon;
    ImageIcon hotdogIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("pizza.png");
        hamburguerIcon = new ImageIcon("chesse-burger.png");
        hotdogIcon = new ImageIcon("hot-dog.png");

        pizzaButton = new JRadioButton("pizza");
        hamburguerButton = new JRadioButton("hamburguer");
        hotdogButton = new JRadioButton("hotdog");

        gruop = new ButtonGroup();
        gruop.add(pizzaButton);
        gruop.add(hamburguerButton);
        gruop.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburguerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburguerButton.setIcon(hamburguerIcon);
        hamburguerButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburguerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza!");
        } else if(e.getSource()==hamburguerButton) {
            System.out.println("You ordered a hamburguer!");
        } else if(e.getSource()==hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }
}
