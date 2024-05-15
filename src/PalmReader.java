import javax.swing.*;
import java.awt.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

public class PalmReader {
    private JFrame frame;
    private JLabel label;
    private JTextArea area = new JTextArea();

    private Color backgroundColor = new Color(255, 248, 231); // Cream color
    private Color labelColor = new Color(153, 51, 51); // Maroon color
    private Color textColor = new Color(33, 33, 33); // Dark gray color

    PalmReader() {
        // Setting up the frame
        frame = new JFrame("Palm Wizard");
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(backgroundColor);

        // Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());

        // Adding label to the top panel
        label = new JLabel("Palm Reading");
        label.setForeground(labelColor);
        label.setFont(new Font("Arial", Font.BOLD, 28)); // Larger font size
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.setBackground(backgroundColor);
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // Add padding
        topPanel.add(label);
        frame.add(topPanel, BorderLayout.NORTH);

        // Adding JTextArea to the center with padding and a custom font
        area.setText("Insert your palm below.");
        area.setForeground(textColor);
        area.setEditable(false);
        area.setFont(new Font("Calibri", Font.PLAIN, 18)); // Set font and size
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding
        frame.add(scrollPane, BorderLayout.CENTER);

        // Adding a JButton for browsing images
        JButton browseButton = new JButton("Browse");
        browseButton.setBackground(labelColor); // Use maroon color for button
        browseButton.setForeground(Color.WHITE); // White text color
        browseButton.setFocusPainted(false); // Remove focus border
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a file chooser
                JFileChooser fileChooser = new JFileChooser();

                // Set file filter to accept only image files
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "Image files", "jpg", "jpeg", "png", "gif");
                fileChooser.setFileFilter(filter);

                // Show the file chooser dialog
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    // User selected a file
                    File selectedFile = fileChooser.getSelectedFile();
                    // Check if the selected file is an image
                    String filename = selectedFile.getName();
                    if (filename.endsWith(".jpg") || filename.endsWith(".jpeg") || filename.endsWith(".png")
                            || filename.endsWith(".gif")) {
                        try{
                            new fake();
                        } catch (Exception R) {
                            R.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a valid image file.", "Invalid File",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // Adding browseButton to the bottom panel
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setBackground(backgroundColor);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // Add padding
        bottomPanel.add(browseButton);
        frame.add(bottomPanel, BorderLayout.SOUTH);

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
