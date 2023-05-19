import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Categories extends JFrame{
    
    JTextField searchTextField;
    JButton searchButton;
    PopularCategoryPanel jollibeePanel, pizzaPanel, sisigPanel;

    public static void main(String[] args) {
        Categories categories = new Categories();
    }

    public Categories() {
        
        setTitle("GrubGroove");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // font
        Font titleFont = new Font("sans serif", Font.PLAIN, 80);
        Font subtitleFont = new Font("Bookman Old Style", Font.ITALIC, 26);
        Font mainFont = new Font("Bookman Old Style", Font.PLAIN, 40);
        Font subFont1 = new Font("Bookman Old Style", Font.PLAIN, 18);
        Font subFont3 = new Font("Bookman Old Style", Font.PLAIN, 13);

        // navigation
        JPanel navPanel = new JPanel();
        navPanel.setPreferredSize(new Dimension(1920, 50));
        navPanel.setBackground(Color.GRAY);
        
        // main
        JPanel categoriesPanel = new JPanel();
        categoriesPanel.setPreferredSize(new Dimension(1920, 1400));
        // categoriesPanel.setBackground(Color.WHITE);
        categoriesPanel.setLayout(new GridBagLayout());
        
        JPanel headerPanel = new JPanel(); // header
        headerPanel.setPreferredSize(new Dimension(1920, 500));

        ImageIcon headerImage = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/header.jpg");
        JLabel headerLabel = new JLabel(headerImage);
        headerPanel.add(headerLabel, BorderLayout.CENTER);

        JLabel categoriesLabel = new JLabel("CATEGORIES");
        categoriesLabel.setAlignmentX(CENTER_ALIGNMENT);
        categoriesLabel.setFont(titleFont);

        JLabel categoriesSubtitleLabel = new JLabel("Grubbing everyone's everything from everywhere all at once.");
        categoriesSubtitleLabel.setAlignmentX(CENTER_ALIGNMENT);
        categoriesSubtitleLabel.setFont(subtitleFont);

        JLabel searchLabel = new JLabel("Search for: "); // search 
        searchLabel.setAlignmentX(RIGHT_ALIGNMENT);
        searchLabel.setFont(subFont3);

        searchTextField = new HintTextField("Jollibee Bucket Meal"); 
        searchTextField.setPreferredSize(new Dimension(300, 25));

        searchButton = new JButton("Search");
        searchButton.setPreferredSize(new Dimension(80, 24));
        searchButton.requestFocusInWindow();

        JPanel popularPanel = new JPanel(); // what's popular?
        popularPanel.setPreferredSize(new Dimension(1880, 500));
        // popularPanel.setBackground(Color.PINK);
        popularPanel.setLayout(new GridBagLayout());

        JLabel popularLabel = new JLabel("Popular");
        popularLabel.setFont(mainFont);

        JLabel popularSubLabel = new JLabel("What's hot at the moment?");
        popularSubLabel.setFont(subFont1);

        // WHATS POPULAR - PANEL CATEGORIES
        ImageIcon jollibee = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/jollibee.jpg"); // jollibee
        JLabel jollibeeImage = new JLabel(jollibee);

        JLabel jollibeLabel = new JLabel("Jollibee Ultimate Combo");
        JLabel jollibeeRating = new JLabel("4.9");
        JLabel jollibeeDeliveryTime = new JLabel("15 mins");
        JLabel jollibeeDistance = new JLabel("3 km");

        jollibeePanel = new PopularCategoryPanel(jollibeeImage, jollibeLabel, jollibeeRating, jollibeeDeliveryTime, jollibeeDistance);
        jollibeePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Jollibee clicked!");
            }
        });

        ImageIcon pizza = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/pizza.jpg"); // pizza
        JLabel pizzaImage = new JLabel(pizza);

        JLabel pizzaLabel = new JLabel("Aventino's 15\" Pepperoni Pizza");
        JLabel pizzaRating = new JLabel("4.85");
        JLabel pizzaDeliveryTime = new JLabel("35 mins");
        JLabel pizzaDistance = new JLabel("0.8 km");

        pizzaPanel = new PopularCategoryPanel(pizzaImage, pizzaLabel, pizzaRating, pizzaDeliveryTime, pizzaDistance);
        pizzaPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Pizza clicked!");
            }
        });

        ImageIcon sisig = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/sisig.jpg"); // sisig
        JLabel sisigImage = new JLabel(sisig);

        JLabel sisigLabel = new JLabel("Aventino's 15\" Pepperoni Pizza");
        JLabel sisigRating = new JLabel("4.85");
        JLabel sisigDeliveryTime = new JLabel("35 mins");
        JLabel sisigaDistance = new JLabel("0.8 km");

        sisigPanel = new PopularCategoryPanel(sisigImage, sisigLabel, sisigRating, sisigDeliveryTime, sisigaDistance);
        sisigPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Sisig clicked!");
            }
        });
 
        // footer
        JPanel footerPanel = new JPanel();
        footerPanel.setPreferredSize(new Dimension(1920, 100));
        footerPanel.setBackground(Color.GRAY);

        // layout
        add(navPanel, BorderLayout.NORTH);
        add(footerPanel, BorderLayout.SOUTH);
        add(categoriesPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(0, 0, 20, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        categoriesPanel.add(headerPanel, gbc);

        gbc.insets = new Insets(30, 0, 10, 5);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        categoriesPanel.add(categoriesLabel, gbc);

        gbc.insets = new Insets(5, 0, 50, 0);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        categoriesPanel.add(categoriesSubtitleLabel, gbc);

        gbc.insets = new Insets(10, 20, 5, 5); // search
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        categoriesPanel.add(searchLabel, gbc);

        gbc.insets = new Insets(0, 20, 5, 5);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        categoriesPanel.add(searchTextField, gbc);

        gbc.insets = new Insets(0, 0, 0, 5);
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        categoriesPanel.add(searchButton, gbc);

        gbc.insets = new Insets(0, 20, 20, 20); // popular
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        categoriesPanel.add(popularPanel, gbc);

        gbc.insets = new Insets(20, 20, 5, 20);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        popularPanel.add(popularLabel, gbc);

        gbc.insets = new Insets(0, 20, 25, 20); 
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        popularPanel.add(popularSubLabel, gbc);

        gbc.insets = new Insets(0, 20, 25, 55); 
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        popularPanel.add(jollibeePanel, gbc);

        gbc.insets = new Insets(0, 20, 25, 75); 
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        popularPanel.add(pizzaPanel, gbc);

        gbc.insets = new Insets(0, 0, 25, 20); 
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        popularPanel.add(sisigPanel, gbc);

        // scrollbar
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(getContentPane());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(1920, 1080));
        setContentPane(scrollPane);

        setVisible(true);
    }


    

    
}
