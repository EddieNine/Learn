package GUI.JFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add componentes to

        JFrame frame = new JFrame(); // Creates a frame
        frame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("filename.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(Color.green); //change color of background -> new Color(0,0,0)

    }
}
