import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CategoryMemberPanel extends JPanel{
    
    private JLabel header = new JLabel(); 
    private JLabel title = new JLabel();
    private JLabel rating = new JLabel();
    private JLabel deliveryTime = new JLabel();
    private JLabel distance = new JLabel();
    private JPanel popularHeaderPanel, popularDetailsHeader;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the labels for the panel

            ImageIcon jollibee = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/jollibee.jpg"); // jollibee
            JLabel jollibeeImage = new JLabel(jollibee);
            JLabel titleLabel = new JLabel("Jollibe Bida Tite");
            JLabel ratingLabel = new JLabel("4.85");
            JLabel deliveryTimeLabel = new JLabel("88 mins");
            JLabel distanceLabel = new JLabel("6 km");

            // Create the panel
            CategoryMemberPanel categoryMemberPanel = new CategoryMemberPanel(jollibeeImage, titleLabel,ratingLabel, deliveryTimeLabel, distanceLabel);

            // Create the frame and add the panel
            JFrame frame = new JFrame("Test Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(categoryMemberPanel);
            frame.pack();
            frame.setVisible(true);
        });
    }

    public CategoryMemberPanel(JLabel header, JLabel title, JLabel rating, JLabel deliveryTime, JLabel distance){

        // variables
        this.header = header;
        this.title = title;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
        this.distance = distance;

        // prpoerties of the panel
        setPreferredSize(new Dimension(400, 285));
        setLayout(new GridBagLayout());

        // fonts
        Font titleFont = new Font("Bookman Old Style", Font.PLAIN, 18);
        Font subFont = new Font("Bookman Old Style", Font.ITALIC, 12);
        
        // header

        // details

        // title
        title.setFont(titleFont);

        JPanel titlePanel = new JPanel();
        titlePanel.add(title);
        // titlePanel.setBackground(Color.ORANGE);
        
        // rating
        ImageIcon star = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/star.png");
        JLabel starIcon = new JLabel(star);

        rating.setFont(subFont);
        rating.setForeground(Color.DARK_GRAY);

        JPanel ratingPanel = new JPanel();
        ratingPanel.setLayout(new FlowLayout());
        ratingPanel.add(starIcon);
        ratingPanel.add(rating);

        // time
        ImageIcon clock = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/clock.png");
        JLabel clockIcon = new JLabel(clock);

        deliveryTime.setFont(subFont);
        deliveryTime.setForeground(Color.DARK_GRAY);

        JPanel timePanel = new JPanel();
        timePanel.setLayout(new FlowLayout());
        timePanel.add(clockIcon);
        timePanel.add(deliveryTime);

        // location
        ImageIcon locationIndicator = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/location.png");
        JLabel locationIcon = new JLabel(locationIndicator);

        distance.setFont(subFont);
        distance.setForeground(Color.DARK_GRAY);

        JPanel locationPanel = new JPanel();
        locationPanel.setLayout(new FlowLayout());
        locationPanel.add(locationIcon);
        locationPanel.add(distance);

        JPanel subDetailsPanel = new JPanel();
        subDetailsPanel.add(ratingPanel);
        subDetailsPanel.add(timePanel);
        subDetailsPanel.add(locationPanel);

        // layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;  
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(header, gbc);
  
        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Occupy the remaining columns in the row
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(titlePanel, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Occupy the remaining columns in the row
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(subDetailsPanel, gbc);
        
    }

}
