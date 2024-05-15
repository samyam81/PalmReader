import javax.swing.*;
import java.awt.*;

public class PalmReader {
    private JFrame frame;

    PalmReader() {
        frame = new JFrame("Palm Wizard");
        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(51, 51, 51)); 

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PalmReader();
    }
}
