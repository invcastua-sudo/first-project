import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
    int score;
    double x;
    double y;
    double width;
    double height;
    double speed;

    public Paddle(int score, double x, double y, double width, double height, double speed) {
        this.score = score;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect((int)x, (int)y, (int)width, (int)height);
    }

    void moveUp() {

    }

    void moveDown() {

    }



}
