import javax.swing.*;
import java.awt.*;

public class PalmReader {
    private JFrame frame;
    private JLabel label;
    private JTextArea area = new JTextArea();

    private Color backgroundColor = new Color(240, 240, 240);
    private Color labelColor = new Color(153, 51, 51);
    private Color textColor = new Color(33, 33, 33);

    PalmReader() {

        frame = new JFrame("Palm Wizard");
        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(backgroundColor);

        // Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());

        label = new JLabel("Palm Reading");
        label.setForeground(labelColor);
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Set font and size

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.setBackground(backgroundColor);
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // Add padding
        topPanel.add(label);

        frame.add(topPanel, BorderLayout.NORTH);

        area.setText("Insert your palm below.");
        area.setForeground(textColor);
        area.setEditable(false);
        area.setFont(new Font("Arial", Font.PLAIN, 18)); // Set font and size

        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

        // Add JTextArea to the CENTER of BorderLayout
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PalmReader();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
