import javax.swing.*;

public class Main {
    /**
     * The system, or ‘frame’ is created here.
     * The object representing our game field is also created here and placed inside this window.
     * @param args
     */
    public static void main(String[] args) {
    JFrame frame = new JFrame("Java Pong Game");
    GamePanel panel = new GamePanel();
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on 'X'
    frame.setResizable(false);
    frame.pack(); // size of the window will = size of the panel
    frame.setLocationRelativeTo(null); // position is centered
    frame.setVisible(true);
    }
}
