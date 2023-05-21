import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BasicCategoryPanel extends JPanel{

    private JLabel header = new JLabel(); 
    private JLabel title = new JLabel();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the labels for the panel

            ImageIcon jollibee = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/FastFood/jollibee.jpg"); // jollibee
            JLabel jollibeeImage = new JLabel(jollibee);

            JLabel titleLabel = new JLabel("Jollibee PH");

            // Create the panel
            BasicCategoryPanel basicCategoryPanel = new BasicCategoryPanel(jollibeeImage, titleLabel);

            // Create the frame and add the panel
            JFrame frame = new JFrame("Basic Category");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(basicCategoryPanel);
            frame.pack();
            frame.setVisible(true);
        });
    }

    public BasicCategoryPanel(JLabel header, JLabel title) {
        
        // variables
        this.header = header;
        this.title = title;

        // prpoerties of the panel
        setPreferredSize(new Dimension(300, 240));
        setLayout(new GridBagLayout());

        // title
        Font titleFont = new Font("Bookman Old Style", Font.PLAIN, 18);
        title.setFont(titleFont);

        // layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;  
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(header, gbc);
  
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER; // Center-align the title label
        gbc.weightx = 1.0; // Make the label expand horizontally
        gbc.weighty = 1.0; // Make the label expand vertically
        gbc.insets = new Insets(10, 0, 0, 0);
        add(title, gbc);
    }

}

