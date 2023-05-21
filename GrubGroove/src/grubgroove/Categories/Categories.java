import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Categories extends JFrame{
    
    JTextField searchTextField;
    JButton searchButton;
    CategoryMemberPanel jollibeePanel, pizzaPanel, sisigPanel;
    BasicCategoryPanel jollibeeFFPanel, mcdoPanel, kfcPanel, MangInasalPanel;
    BasicCategoryPanel americanPanel, japanesePanel, koreanPanel, chinesePanel;
    BasicCategoryPanel bakeryPanel, iceCreamPanel, beveragePanel, healthyPanel;

    public static void main(String[] args) {
        Categories categories = new Categories();
    }

    public Categories() {
        
        setTitle("GrubGroove");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1600,1080);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // font
        Font titleFont = new Font("sans serif", Font.PLAIN, 60);
        Font subtitleFont = new Font("Bookman Old Style", Font.ITALIC, 20);
        Font mainFont = new Font("Bookman Old Style", Font.PLAIN, 28);
        Font subFont1 = new Font("Bookman Old Style", Font.ITALIC, 14);
        Font subFont3 = new Font("Bookman Old Style", Font.PLAIN, 13);

        // navigation
        JPanel navPanel = new JPanel();
        navPanel.setPreferredSize(new Dimension(1300, 50));
        navPanel.setBackground(Color.GRAY);
        
        // main
        JPanel categoriesPanel = new JPanel();
        categoriesPanel.setPreferredSize(new Dimension(1300, 2000));
        // categoriesPanel.setBackground(Color.WHITE);
        categoriesPanel.setLayout(new GridBagLayout());

        ImageIcon header = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/header.jpg"); // header
        JLabel headerImage = new JLabel(header);

        JLabel categoriesLabel = new JLabel("CATEGORIES");
        categoriesLabel.setAlignmentX(CENTER_ALIGNMENT);
        categoriesLabel.setFont(titleFont);

        JLabel categoriesSubtitleLabel = new JLabel("Grubbing everyone's everything from everywhere all at once.");
        categoriesSubtitleLabel.setAlignmentX(CENTER_ALIGNMENT);
        categoriesSubtitleLabel.setFont(subtitleFont);

        JLabel searchLabel = new JLabel("Search for: "); // search 
        searchLabel.setAlignmentX(RIGHT_ALIGNMENT);
        searchLabel.setFont(subFont3);

        searchTextField = new JTextField(); 
        searchTextField.setPreferredSize(new Dimension(300, 40));

        searchButton = new JButton("Search");
        searchButton.setPreferredSize(new Dimension(80, 24));
        searchButton.requestFocusInWindow();

        // WHATS POPULAR - SPECIAL CATEGORIES
        JPanel popularPanel = new JPanel(); // what's popular?
        popularPanel.setPreferredSize(new Dimension(1200, 500));
        // popularPanel.setBackground(Color.PINK);
        popularPanel.setLayout(new GridBagLayout());

        JLabel popularLabel = new JLabel("Popular");
        popularLabel.setFont(mainFont);

        JLabel popularSubLabel = new JLabel("What's hot at the moment?");
        popularSubLabel.setFont(subFont1);

        ImageIcon jollibee = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/jollibee.jpg"); // jollibee
        JLabel jollibeeImage = new JLabel(jollibee);

        JLabel jollibeLabel = new JLabel("Jollibee Ultimate Combo");
        JLabel jollibeeRating = new JLabel("4.9");
        JLabel jollibeeDeliveryTime = new JLabel("15 mins");
        JLabel jollibeeDistance = new JLabel("3 km");

        jollibeePanel = new CategoryMemberPanel(jollibeeImage, jollibeLabel, jollibeeRating, jollibeeDeliveryTime, jollibeeDistance);
        jollibeePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Jollibee clicked!");
            }
        });

        ImageIcon pizza = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/pizza.png"); // pizza
        JLabel pizzaImage = new JLabel(pizza);

        JLabel pizzaLabel = new JLabel("Aventino's 15\" Pepperoni Pizza");
        JLabel pizzaRating = new JLabel("4.85");
        JLabel pizzaDeliveryTime = new JLabel("35 mins");
        JLabel pizzaDistance = new JLabel("0.8 km");

        pizzaPanel = new CategoryMemberPanel(pizzaImage, pizzaLabel, pizzaRating, pizzaDeliveryTime, pizzaDistance);
        pizzaPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Pizza clicked!");
            }
        });

        ImageIcon sisig = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Popular/sisig.jpg"); // sisig
        JLabel sisigImage = new JLabel(sisig);

        JLabel sisigLabel = new JLabel("Sisig Sa Luyo");
        JLabel sisigRating = new JLabel("4.7");
        JLabel sisigDeliveryTime = new JLabel("10 mins");
        JLabel sisigaDistance = new JLabel("0.2 km");

        sisigPanel = new CategoryMemberPanel(sisigImage, sisigLabel, sisigRating, sisigDeliveryTime, sisigaDistance);
        sisigPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Sisig clicked!");
            }
        });

        // popular layout
        GridBagConstraints gbcPopular = new GridBagConstraints();
        gbcPopular.insets = new Insets(0, 20, 5, 0);
        gbcPopular.anchor = GridBagConstraints.WEST;
        gbcPopular.gridx = 0;
        gbcPopular.gridy = 0;
        gbcPopular.gridwidth = 1;
        popularPanel.add(popularLabel, gbcPopular);

        gbcPopular.insets = new Insets(0, 20, 25, 20); 
        gbcPopular.anchor = GridBagConstraints.WEST;
        gbcPopular.gridx = 0;
        gbcPopular.gridy = 1;
        gbcPopular.gridwidth = 1;
        popularPanel.add(popularSubLabel, gbcPopular);

        gbcPopular.insets = new Insets(0, 20, 25, 0); 
        gbcPopular.anchor = GridBagConstraints.NORTH;
        gbcPopular.gridx = 0;
        gbcPopular.gridy = 2;
        gbcPopular.gridwidth = 1;
        popularPanel.add(jollibeePanel, gbcPopular);

        gbcPopular.insets = new Insets(0, 20, 25, 0); 
        gbcPopular.gridx = 1;
        gbcPopular.gridy = 2;
        gbcPopular.gridwidth = 1;
        popularPanel.add(pizzaPanel, gbcPopular);

        gbcPopular.insets = new Insets(0, 20, 25, 20); 
        gbcPopular.gridx = 2;
        gbcPopular.gridy = 2;
        gbcPopular.gridwidth = 1;
        popularPanel.add(sisigPanel, gbcPopular);
 
        // FAST FOOD CATEGORY
        JPanel fastFoodPanel = new JPanel(); 
        fastFoodPanel.setPreferredSize(new Dimension(1200, 500));
        // fastFoodPanel.setBackground(Color.YELLOW);
        fastFoodPanel.setLayout(new GridBagLayout());

        JLabel fastFoodLabel = new JLabel("Fast Food");
        fastFoodLabel.setFont(mainFont);

        JLabel fastFoodSubLabel = new JLabel("Paparapapa - where bida ang saya!");
        fastFoodSubLabel.setFont(subFont1);

        ImageIcon jollibeeFF = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/FastFood/jollibee.jpg"); // jollibee fast food
        JLabel jollibeeFFImage = new JLabel(jollibeeFF);
        JLabel jollibeFFLabel = new JLabel("Jollibee PH");
    
        jollibeeFFPanel = new BasicCategoryPanel(jollibeeFFImage, jollibeFFLabel);
        jollibeePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Jollibee fast food clicked!");
            }
        });

        ImageIcon mdco = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/FastFood/mcdo.png"); // jollibee fast food
        JLabel mcdoImage = new JLabel(mdco);
        JLabel mdcoLabel = new JLabel("McDonald's");
    
        mcdoPanel = new BasicCategoryPanel(mcdoImage, mdcoLabel);
        mcdoPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "McDONARD clicked!");
            }
        });

        ImageIcon kfc = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/FastFood/kfc.jpg"); // jollibee fast food
        JLabel kfcImage = new JLabel(kfc);
        JLabel kfcLabel = new JLabel("KFC");
    
        kfcPanel = new BasicCategoryPanel(kfcImage, kfcLabel);
        kfcPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "KFC clicked!");
            }
        });

        ImageIcon mangInasal = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/FastFood/mangInasal.jpg"); // jollibee fast food
        JLabel mangInasalIimage = new JLabel(mangInasal);
        JLabel mangInasalLabel = new JLabel("Mang Inasal");
    
        MangInasalPanel = new BasicCategoryPanel(mangInasalIimage, mangInasalLabel);
        MangInasalPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "Mang mama mo clicked!");
            }
        });
        
        // fast food layout
        GridBagConstraints gbcFF = new GridBagConstraints();
        gbcFF.insets = new Insets(0, 20, 5, 0);
        gbcFF.anchor = GridBagConstraints.WEST;
        gbcFF.gridx = 0;
        gbcFF.gridy = 0;
        gbcFF.gridwidth = 1;
        fastFoodPanel.add(fastFoodLabel, gbcFF);

        gbcFF.insets = new Insets(0, 20, 25, 0);
        gbcFF.gridx = 0;
        gbcFF.gridy = 1;
        gbcFF.gridwidth = 1;
        fastFoodPanel.add(fastFoodSubLabel, gbcFF);

        gbcFF.insets = new Insets(0, 20, 25, 0);
        gbcFF.gridx = 0;
        gbcFF.gridy = 2;
        gbcFF.gridwidth = 1;
        fastFoodPanel.add(jollibeeFFPanel, gbcFF);

        gbcFF.insets = new Insets(0, 10, 25, 0);
        gbcFF.gridx = 1;
        gbcFF.gridy = 2;
        gbcFF.gridwidth = 1;
        fastFoodPanel.add(mcdoPanel, gbcFF);

        gbcFF.insets = new Insets(0, 10, 25, 0);
        gbcFF.gridx = 2;
        gbcFF.gridy = 2;
        gbcFF.gridwidth = 1;
        fastFoodPanel.add(kfcPanel, gbcFF);
        
        gbcFF.insets = new Insets(0, 10, 25, 20);
        gbcFF.gridx = 3;
        gbcFF.gridy = 2;
        gbcFF.gridwidth = 1;
        fastFoodPanel.add(MangInasalPanel, gbcFF);

        // CUISINE CATEGORY
        JPanel cuisinePanel = new JPanel(); 
        cuisinePanel.setPreferredSize(new Dimension(1200, 500));
        // cuisinePanel.setBackground(Color.YELLOW);
        cuisinePanel.setLayout(new GridBagLayout());

        JLabel cuisineLabel = new JLabel("Cuisine");
        cuisineLabel.setFont(mainFont);

        JLabel cuisineSubLabel = new JLabel("Savor foreign flavors in your mouth.");
        cuisineSubLabel.setFont(subFont1);

        ImageIcon american = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Cuisine/american.jpg"); // american fast food
        JLabel americanFImage = new JLabel(american);
        JLabel americanLabel = new JLabel("American");
    
        americanPanel = new BasicCategoryPanel(americanFImage, americanLabel);
        americanPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "American clicked!");
            }
        });

        ImageIcon korean = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Cuisine/korean.jpg"); // koaern fast food
        JLabel koreanImage = new JLabel(korean);
        JLabel koreanLabel = new JLabel("Korean");
    
        koreanPanel = new BasicCategoryPanel(koreanImage, koreanLabel);
        koreanPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "korean clicked!");
            }
        });

        ImageIcon chinese = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Cuisine/chinese.jpg"); // chinese fast food
        JLabel chineseImage = new JLabel(chinese);
        JLabel chineseLabel = new JLabel("Chinese");
    
        chinesePanel = new BasicCategoryPanel(chineseImage, chineseLabel);
        chinesePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "chinese clicked!");
            }
        });

        ImageIcon japanese = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Cuisine/japanese.jpg"); // japanse fast food
        JLabel japaneseImage = new JLabel(japanese);
        JLabel japaneseLabel = new JLabel("Japanese");
    
        japanesePanel = new BasicCategoryPanel(japaneseImage, japaneseLabel);
        japanesePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "japanese clicked!");
            }
        });
        
        // cuisine layout
        GridBagConstraints gbcCuisine = new GridBagConstraints();
        gbcCuisine.insets = new Insets(0, 20, 5, 0);
        gbcCuisine.anchor = GridBagConstraints.WEST;
        gbcCuisine.gridx = 0;
        gbcCuisine.gridy = 0;
        gbcCuisine.gridwidth = 1;
        cuisinePanel.add(cuisineLabel, gbcCuisine);

        gbcCuisine.insets = new Insets(0, 20, 25, 0);
        gbcCuisine.gridx = 0;
        gbcCuisine.gridy = 1;
        gbcCuisine.gridwidth = 1;
        cuisinePanel.add(cuisineSubLabel, gbcCuisine);

        gbcCuisine.insets = new Insets(0, 20, 25, 0);
        gbcCuisine.gridx = 0;
        gbcCuisine.gridy = 2;
        gbcCuisine.gridwidth = 1;
        cuisinePanel.add(americanPanel, gbcCuisine);

        gbcCuisine.insets = new Insets(0, 10, 25, 0);
        gbcCuisine.gridx = 1;
        gbcCuisine.gridy = 2;
        gbcCuisine.gridwidth = 1;
        cuisinePanel.add(koreanPanel, gbcCuisine);

        gbcCuisine.insets = new Insets(0, 10, 25, 0);
        gbcCuisine.gridx = 2;
        gbcCuisine.gridy = 2;
        gbcCuisine.gridwidth = 1;
        cuisinePanel.add(chinesePanel, gbcCuisine);
        
        gbcCuisine.insets = new Insets(0, 10, 25, 20);
        gbcCuisine.gridx = 3;
        gbcCuisine.gridy = 2;
        gbcCuisine.gridwidth = 1;
        cuisinePanel.add(japanesePanel, gbcCuisine);

        // SNACKS CATEGORY
        JPanel snacksPanel = new JPanel(); 
        snacksPanel.setPreferredSize(new Dimension(1200, 500));
        // snacksPanel.setBackground(Color.YELLOW);
        snacksPanel.setLayout(new GridBagLayout());

        JLabel snacksLabel = new JLabel("Snacks");
        snacksLabel.setFont(mainFont);

        JLabel snacksSubLabel = new JLabel("Eating at your own comfort.");
        snacksSubLabel.setFont(subFont1);

        ImageIcon bakery = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Snacks/bakery.jpg"); // bakery
        JLabel bakeryImage = new JLabel(bakery);
        JLabel bakeryLabel = new JLabel("Bakery");
    
        bakeryPanel = new BasicCategoryPanel(bakeryImage, bakeryLabel);
        bakeryPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "bakery clicked!");
            }
        });

        ImageIcon iceCream = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Snacks/iceCream.jpg"); // icc ceram
        JLabel iceCreamImage = new JLabel(iceCream);
        JLabel iceCreamLabel = new JLabel("Ice Cream");
    
        iceCreamPanel = new BasicCategoryPanel(iceCreamImage, iceCreamLabel);
        iceCreamPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "ice ceram clicked!");
            }
        });

        ImageIcon beverage = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Snacks/beverage.jpg"); // beverage
        JLabel beverageImage = new JLabel(beverage);
        JLabel beverageLabel = new JLabel("Beverage");
    
        beveragePanel = new BasicCategoryPanel(beverageImage, beverageLabel);
        beveragePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "beverage clicked!");
            }
        });

        ImageIcon healthy = new ImageIcon("C:/Users/franc/Documents/GrubGroove/Images/Categories/Snacks/healthy.jpg"); // healhthyy
        JLabel healthyImage = new JLabel(healthy);
        JLabel healthyLabel = new JLabel("Healthy");
    
        healthyPanel = new BasicCategoryPanel(healthyImage, healthyLabel);
        healthyPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(Categories.this, "healthy clicked!");
            }
        });
        
        // snacks layout
        GridBagConstraints gbcSnacks = new GridBagConstraints();
        gbcSnacks.insets = new Insets(0, 20, 5, 0);
        gbcSnacks.anchor = GridBagConstraints.WEST;
        gbcSnacks.gridx = 0;
        gbcSnacks.gridy = 0;
        gbcSnacks.gridwidth = 1;
        snacksPanel.add(snacksLabel, gbcSnacks);

        gbcSnacks.insets = new Insets(0, 20, 25, 0);
        gbcSnacks.gridx = 0;
        gbcSnacks.gridy = 1;
        gbcSnacks.gridwidth = 1;
        snacksPanel.add(snacksSubLabel, gbcSnacks);

        gbcSnacks.insets = new Insets(0, 20, 25, 0);
        gbcSnacks.gridx = 0;
        gbcSnacks.gridy = 2;
        gbcSnacks.gridwidth = 1;
        snacksPanel.add(bakeryPanel, gbcSnacks);

        gbcSnacks.insets = new Insets(0, 10, 25, 0);
        gbcSnacks.gridx = 1;
        gbcSnacks.gridy = 2;
        gbcSnacks.gridwidth = 1;
        snacksPanel.add(iceCreamPanel, gbcSnacks);

        gbcSnacks.insets = new Insets(0, 10, 25, 0);
        gbcSnacks.gridx = 2;
        gbcSnacks.gridy = 2;
        gbcSnacks.gridwidth = 1;
        snacksPanel.add(beveragePanel, gbcSnacks);
        
        gbcSnacks.insets = new Insets(0, 10, 25, 20);
        gbcSnacks.gridx = 3;
        gbcSnacks.gridy = 2;
        gbcSnacks.gridwidth = 1;
        snacksPanel.add(healthyPanel, gbcSnacks);

        // footer
        JPanel footerPanel = new JPanel();
        footerPanel.setPreferredSize(new Dimension(1300, 100));
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
        categoriesPanel.add(headerImage, gbc);

        gbc.insets = new Insets(30, 0, 0, 5);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        categoriesPanel.add(categoriesLabel, gbc);

        gbc.insets = new Insets(5, 0, 40, 0);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        categoriesPanel.add(categoriesSubtitleLabel, gbc);

        // gbc.insets = new Insets(10, 20, 5, 5); // search
        // gbc.anchor = GridBagConstraints.NORTHWEST;
        // gbc.gridx = 0;
        // gbc.gridy = 3;
        // gbc.gridwidth = 1;
        // categoriesPanel.add(searchLabel, gbc);

        // gbc.insets = new Insets(0, 20, 10, 5);
        // gbc.anchor = GridBagConstraints.NORTHWEST;
        // gbc.gridx = 0;
        // gbc.gridy = 4;
        // gbc.gridwidth = 1;
        // categoriesPanel.add(searchTextField, gbc);

        // gbc.insets = new Insets(5, 20, 0, 5);
        // gbc.gridx = 1;
        // gbc.gridy = 3;
        // gbc.gridwidth = 2;
        // categoriesPanel.add(searchButton, gbc); 

        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        categoriesPanel.add(popularPanel, gbc);

        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        categoriesPanel.add(fastFoodPanel, gbc);

        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        categoriesPanel.add(cuisinePanel, gbc);

        gbc.insets = new Insets(10, 0, 20, 0);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 4;
        categoriesPanel.add(snacksPanel, gbc);

 
        // scrollbar
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(getContentPane());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(1300, 1080));
        setContentPane(scrollPane);

        setVisible(true);
    }


    

    
}
