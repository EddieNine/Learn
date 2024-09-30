package GUI.JFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("filename.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(Color.green); //change color of background -> new Color(0,0,0)
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
