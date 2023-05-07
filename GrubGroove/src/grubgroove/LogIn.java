import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.sql.*; 

public class LogIn extends JFrame implements MouseListener, ActionListener{

    public JLabel lblLogo, lblGrubGroove, lblCreateAccount;
    public JPanel logInPanel;
    public TextField tfUsername, tfPassword;
    public Button btnLogIn;    

    public LogIn() {

        super("GrubGroove");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        //Fonts
        Font mainFont = new Font("Bookman Old Style", Font.PLAIN, 23);
        Font subFont1 = new Font("Bookman Old Style", Font.ITALIC, 14);
        Font subFont2 = new Font("Bookman Old Style", Font.BOLD, 14);
        Font subFont3 = new Font("Bookman Old Style", Font.PLAIN, 12);

        // Log-In Panel
        logInPanel = new JPanel(new GridBagLayout());
        logInPanel.setPreferredSize(new Dimension(600, 600));
        logInPanel.setBackground(Color.WHITE);

        BufferedImage logoGGImage = null;
        try {
            logoGGImage = ImageIO.read(new File("C:/Users/franc/Documents/GrubGroove/Images/transparentlogo_trimmed.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        ImageIcon imgLogo = new ImageIcon(logoGGImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        lblLogo = new JLabel(imgLogo);

        JLabel lblTitle = new JLabel("GrubGroove");
        lblTitle.setFont(mainFont);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(subFont1);
        lblUsername.setHorizontalAlignment(SwingConstants.LEFT);

        tfUsername = new TextField();
        tfUsername.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
        tfUsername.setPreferredSize(new Dimension(350, 30));

        logInPanel = new JPanel(new GridBagLayout());
        logInPanel.setBackground(Color.LIGHT_GRAY);
        logInPanel.setPreferredSize(new Dimension(200, 200));

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(subFont1);
        lblPassword.setHorizontalAlignment(SwingConstants.LEFT);

        tfPassword = new TextField();
        tfPassword.setPreferredSize(new Dimension(350, 30));
        tfPassword.setEchoChar('*');

        JPanel spacePanel = new JPanel();
        spacePanel.setPreferredSize(new Dimension(0, 5));

        btnLogIn = new Button("LOGIN");
        btnLogIn.setFont(subFont2);
        btnLogIn.setPreferredSize(new Dimension(100,40));
        btnLogIn.addActionListener(this);

        lblCreateAccount = new JLabel("Don't have an account? Sign up!");
        lblCreateAccount.setFont(subFont3);
        lblCreateAccount.addMouseListener(this);

        JPanel emptyPanel = new JPanel();
        emptyPanel.setPreferredSize(new Dimension(0, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        logInPanel.add(lblLogo, gbc);

        gbc.insets = new Insets(10, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 1;
        logInPanel.add(lblTitle, gbc);

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(30,5,5,5);
        gbc.gridx = 0;
        gbc.gridy = 2;
        logInPanel.add(lblUsername, gbc);

        gbc.insets = new Insets(5,5,20,5);
        gbc.gridx = 0;
        gbc.gridy = 3;
        logInPanel.add(tfUsername, gbc);

        gbc.insets = new Insets(5,5,5,5);
        gbc.gridx = 0;
        gbc.gridy = 4;
        logInPanel.add(lblPassword, gbc);
        
        gbc.insets = new Insets(5,5,50,5);
        gbc.gridx = 0;
        gbc.gridy = 5;
        logInPanel.add(tfPassword, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 6;
        logInPanel.add(btnLogIn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        logInPanel.add(lblCreateAccount, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        logInPanel.add(emptyPanel, gbc);

        add(logInPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    //Logging in
    public void actionPerformed(ActionEvent e) {

        String username = tfUsername.getText();
        String password = String.valueOf(tfPassword.getText());

        if (e.getSource() == btnLogIn) {
            // Code to handle the "Log In" button click event
            
            if (isValidUsernameAndPassword(username, password)) {
                // Successful login, do something here
                System.out.println("Successful login!");
            } else {
                // Invalid username or password, display an error message
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private boolean isValidUsernameAndPassword(String username, String password) {
        // Code to check if the username and password are valid
        // For example, you could check them against a database
        return username.equals("admin") && password.equals("password");
    }
    

    //Prompt to create a new account
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "You clicked the label!");
    }

    public void mouseEntered(MouseEvent e) {
        lblCreateAccount.setForeground(Color.BLACK);
    }

    public void mouseExited(MouseEvent e) {
        lblCreateAccount.setForeground(Color.BLUE);
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    //MAIN
    public static void main(String[] args){
        LogIn login = new LogIn();
    }
}
