package SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener, MouseListener {

    enum Difficulty {
        EASY, MEDIUM, HARD
    }

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;

    final int[] x = new int[GAME_UNITS];
    final int[] y = new int[GAME_UNITS];

    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    int delay = 75; // Mutável
    Difficulty difficulty = null;

    Rectangle easyButton = new Rectangle(SCREEN_WIDTH / 2 - 60, SCREEN_HEIGHT / 2 - 50, 120, 30);
    Rectangle mediumButton = new Rectangle(SCREEN_WIDTH / 2 - 60, SCREEN_HEIGHT / 2, 120, 30);
    Rectangle hardButton = new Rectangle(SCREEN_WIDTH / 2 - 60, SCREEN_HEIGHT / 2 + 50, 120, 30);

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        this.addMouseListener(this);
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!running && difficulty == null) {
            drawMenu(g);
        } else {
            draw(g);
        }
    }

    public void drawMenu(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Ink Free", Font.BOLD, 30));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Selecione a Dificuldade",
                (SCREEN_WIDTH - metrics.stringWidth("Selecione a Dificuldade")) / 2,
                SCREEN_HEIGHT / 3);

        g.setFont(new Font("Ink Free", Font.BOLD, 20));
        g.setColor(Color.lightGray);
        g.fillRect(easyButton.x, easyButton.y, easyButton.width, easyButton.height);
        g.fillRect(mediumButton.x, mediumButton.y, mediumButton.width, mediumButton.height);
        g.fillRect(hardButton.x, hardButton.y, hardButton.width, hardButton.height);

        g.setColor(Color.black);
        g.drawString("1 - Fácil", easyButton.x + 20, easyButton.y + 22);
        g.drawString("2 - Médio", mediumButton.x + 20, mediumButton.y + 22);
        g.drawString("3 - Difícil", hardButton.x + 20, hardButton.y + 22);
    }


    public void draw(Graphics g) {
        if (running) {
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                } else {
                    g.setColor(new Color(45, 180, 0));
                }
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }

            g.setColor(Color.white);
            g.setFont(new Font("Ink Free", Font.BOLD, 20));
            g.drawString("Pontuação: " + applesEaten, 20, g.getFont().getSize());
            g.drawString("Nível: " + (1 + (applesEaten / 5)), 20, g.getFont().getSize() + 30);
        } else {
            gameOver(g);
        }
    }

    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U': y[0] = y[0] - UNIT_SIZE; break;
            case 'D': y[0] = y[0] + UNIT_SIZE; break;
            case 'L': x[0] = x[0] - UNIT_SIZE; break;
            case 'R': x[0] = x[0] + UNIT_SIZE; break;
        }
    }

    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
            updateSpeed();
        }
    }

    public void updateSpeed() {
        if (applesEaten % 5 == 0 && delay > 25) {
            delay -= 5;
            timer.setDelay(delay);
        }
    }

    public void checkCollisions() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }

        if (x[0] < 0 || x[0] >= SCREEN_WIDTH || y[0] < 0 || y[0] >= SCREEN_HEIGHT) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over",
                (SCREEN_WIDTH - metrics.stringWidth("Game Over")) / 2,
                SCREEN_HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(difficulty == null) {
            Point p = e.getPoint();

            if(easyButton.contains(p)) {
                difficulty = Difficulty.EASY;
                delay = 125;
                startGame();
            } else if (mediumButton.contains(p)) {
                difficulty = Difficulty.MEDIUM;
                delay = 75;
                startGame();
            } else if (hardButton.contains(p)) {
                difficulty = Difficulty.HARD;
                delay = 40;
                startGame();
            }
        }
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (difficulty == null) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_1:
                        difficulty = Difficulty.EASY;
                        delay = 125;
                        break;
                    case KeyEvent.VK_2:
                        difficulty = Difficulty.MEDIUM;
                        delay = 75;
                        break;
                    case KeyEvent.VK_3:
                        difficulty = Difficulty.HARD;
                        delay = 40;
                        break;
                }
                if (difficulty != null) {
                    startGame();
                }
                return;
            }

            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') direction = 'L';
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') direction = 'R';
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') direction = 'U';
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') direction = 'D';
                    break;
            }
        }
    }
}
