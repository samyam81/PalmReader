import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class fake {
    private JFrame frame;
    private Color backgroundColor = new Color(255, 248, 231); // Cream color
    private Color labelColor = new Color(153, 51, 51); // Maroon color

    private JTextArea love;
    private JTextArea health;
    private JTextArea wisdom;
    private JTextArea career;

    private Random fakeData = new Random();

    private JLabel lLabel, hLabel, wLabel, cLabel;

    fake() {
        // Set up the frame
        frame = new JFrame("Palm Wizard");
        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(backgroundColor);
        frame.setLayout(new GridLayout(4, 1)); // Arrange JTextAreas in a grid layout

        // Initialize JTextAreas for love, health, wisdom, and career
        love = createJTextArea();
        health = createJTextArea();
        wisdom = createJTextArea();
        career = createJTextArea();

        // Add JTextAreas to the frame's content pane along with labels
        addTextAreaWithLabel("Love", love, fakeData.nextInt(70, 95) + "%");
        addTextAreaWithLabel("Health", health, fakeData.nextInt(70, 95) + "%");
        addTextAreaWithLabel("Wisdom", wisdom, fakeData.nextInt(70, 95) + "%");
        addTextAreaWithLabel("Career", career, fakeData.nextInt(70, 95) + "%");

        frame.setVisible(true);
    }

    private JTextArea createJTextArea() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return textArea;
    }

    private void addTextAreaWithLabel(String labelText, JTextArea textArea, String valueText) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(backgroundColor);

        JLabel label = new JLabel(labelText + ": " + valueText);
        label.setForeground(labelColor);
        label.setFont(new Font("Arial", Font.BOLD, 20)); // Larger font size
        panel.add(label, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add padding
        panel.add(scrollPane, BorderLayout.CENTER);

        frame.add(panel);
    }

    fake(JFrame frame) {
        this.frame = frame;
    }

    public static void main(String[] args) {
        new fake();
    }
}
