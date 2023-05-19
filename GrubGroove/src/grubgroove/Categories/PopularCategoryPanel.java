import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopularCategoryPanel extends JPanel{
    
    private JLabel header = new JLabel(); 
    private JLabel title = new JLabel();
    private JLabel rating = new JLabel();
    private JLabel deliveryTime = new JLabel();
    private JLabel distance = new JLabel();
    private JPanel popularHeaderPanel, popularDetailsHeader;

    public PopularCategoryPanel(JLabel header, JLabel title, JLabel rating, JLabel deliveryTime, JLabel distance){

        // variables
        this.header = header;
        this.title = title;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
        this.distance = distance;

        // prpoerties of the panel
        setPreferredSize(new Dimension(500, 345));
        setLayout(new BorderLayout());

        // fonts
        Font titleFont = new Font("Bookman Old Style", Font.PLAIN, 24);
        Font subFont = new Font("Bookman Old Style", Font.ITALIC, 16);
        
        // header
        popularHeaderPanel = new JPanel();
        popularHeaderPanel.setPreferredSize(new Dimension(500, 240));
        popularHeaderPanel.add(header);

        // details
        popularDetailsHeader = new JPanel();
        popularDetailsHeader.setPreferredSize(new Dimension(500, 110));
        popularDetailsHeader.setLayout(new GridBagLayout());

        // title
        title.setFont(titleFont);

        JPanel titlePanel = new JPanel();
        titlePanel.add(title);
        
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

        // bar
        JPanel subdetailsPanel = new JPanel();
        subdetailsPanel.setLayout(new FlowLayout());
        subdetailsPanel.add(ratingPanel);
        subdetailsPanel.add(timePanel);
        subdetailsPanel.add(locationPanel);

        // layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0,0,0,0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 0;
        popularDetailsHeader.add(titlePanel, gbc);

        gbc.insets = new Insets(0,0,0,0);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 0;
        popularDetailsHeader.add(subdetailsPanel, gbc);

        add(popularHeaderPanel, BorderLayout.NORTH);
        add(popularDetailsHeader, BorderLayout.SOUTH);
    }

}
