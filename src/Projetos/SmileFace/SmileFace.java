package Projetos.SmileFace;

import javax.swing.*;
import java.awt.*;

public class SmileFace extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 30, 30);
        g.fillOval(170, 100, 30, 30);

        g.setColor(Color.RED);
        g.drawArc(100, 150, 100, 50, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        SmileFace panel = new SmileFace();

        frame.setTitle("Desenhando um Rostinho Sorridente");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
