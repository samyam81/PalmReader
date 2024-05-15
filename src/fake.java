import javax.swing.*;
import java.awt.*;

public class fake {
    private JFrame frame;
    private Color backgroundColor = new Color(255, 248, 231); // Cream color
    // private Color labelColor = new Color(153, 51, 51); // Maroon color

    private JTextArea love;
    private JTextArea health;
    private JTextArea wisdom;
    private JTextArea career;

    private Random fakeData = new Random();

    // private JLabel lLabel, hLabel, wLabel, cLabel;

    fake() {
        // Set up the frame
        frame = new JFrame("Palm Wizard");
        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(backgroundColor);
        frame.setLayout(new GridLayout(4, 1)); // Arrange JTextAreas in a grid layout

        // Initialize JTextAreas for love, health, wisdom, and career with different
        // background colors
        love = createJTextArea("Love", fakeData.nextInt(70, 95) + "%");
        love.setBackground(new Color(245, 222, 179)); // Wheat color
        health = createJTextArea("Health", fakeData.nextInt(70, 95) + "%");
        health.setBackground(new Color(176, 224, 230)); // Powder blue color
        wisdom = createJTextArea("Wisdom", fakeData.nextInt(70, 95) + "%");
        wisdom.setBackground(new Color(240, 255, 255)); // Azure color
        career = createJTextArea("Career", fakeData.nextInt(70, 95) + "%");
        career.setBackground(new Color(255, 228, 225)); // Misty rose color

        // Add JTextAreas to the frame's content pane
        frame.add(love);
        frame.add(health);
        frame.add(wisdom);
        frame.add(career);

        frame.setVisible(true);
    }

    private JTextArea createJTextArea(String labelText, String valueText) {
        JTextArea textArea = new JTextArea(labelText + ": " + valueText);
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setMargin(new Insets(5, 5, 5, 5)); // Add padding
        return textArea;
    }

    fake(JFrame frame) {
        this.frame = frame;
    }

//     public static void main(String[] args) {
//         new fake();
//     }
 }

class Random {
    private java.util.Random random = new java.util.Random();

    public int nextInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}
