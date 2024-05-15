import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalmReader {
    private JFrame frame;
    private JLabel label;

    private Color first = new Color(51, 51, 51);
    private Color second = new Color(153, 51, 51);

    PalmReader() {

        frame = new JFrame("Palm Wizard");
        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(first);

        label = new JLabel("Palm Reading");
        label.setForeground(second);

        // Add a ComponentListener to track frame resizing
        frame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                positionLabel(); // Adjust label position on frame resize
            }
        });

        frame.add(label);
        frame.setVisible(true);

        positionLabel(); // Initial positioning
        
    }

    // Method to position the label in the center of the frame
    private void positionLabel() {
        int labelWidth = label.getPreferredSize().width;
        int labelHeight = label.getPreferredSize().height;
        int x = (frame.getWidth() - labelWidth) / 2;
        int y = (frame.getHeight() - labelHeight) / 8;
        label.setBounds(x, y, labelWidth, labelHeight);
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
