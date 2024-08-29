import javax.swing.*;
import java.awt.*;

public class RainbowColors extends JPanel {

    // Number of colors in the rainbow
    private static final int NUM_COLORS = 7;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Width of each color stripe
        int stripeWidth = getWidth() / NUM_COLORS;

        // Colors of the rainbow
        Color[] rainbowColors = {
            Color.RED, Color.ORANGE, Color.YELLOW,
            Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET
        };

        // Draw the rainbow stripes
        for (int i = 0; i < NUM_COLORS; i++) {
            g.setColor(rainbowColors[i]);
            g.fillRect(i * stripeWidth, 0, stripeWidth, getHeight());
        }
    }

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Rainbow Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);  // Set the size of the window

        // Add the custom panel to the frame
        frame.add(new RainbowColors());

        // Display the frame
        frame.setVisible(true);
    }
}

