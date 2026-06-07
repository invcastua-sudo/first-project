import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;

    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    static final int BALL_DIAMETER = 20;

    Paddle player1;
    Paddle player2;
    Ball ball;

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);

        newPaddles();
        newBall();
    }

    public void newPaddles() {
        player1 = new Paddle(0, 0, (SCREEN_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 10);
        player2 = new Paddle(0, SCREEN_WIDTH - PADDLE_WIDTH, (SCREEN_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 10);
    }

    public void newBall() {
        ball = new Ball((SCREEN_WIDTH / 2) - (BALL_DIAMETER / 2), (SCREEN_HEIGHT / 2) - (BALL_DIAMETER / 2), BALL_DIAMETER, 0, 0);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        player1.draw(g);
        player2.draw(g);
        ball.draw(g);
    }
}
