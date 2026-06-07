import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    double x;
    double y;
    double diameter;
    double speedX;
    double speedY;

    public Ball(double x, double y, double diameter, double speedX, double speedY) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval((int)x, (int)y, (int)diameter, (int)diameter);
    }

    void move() {

    }

    void bounceX() {

    }

    void bounceY() {

    }

}
