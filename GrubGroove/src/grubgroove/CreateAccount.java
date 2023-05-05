package grubgroove;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CreateAccount extends JFrame{
    public JLabel lblLogo, lblFirstName, lblLastName, lblAddress, lblUsername, lblPassword, lblEmail,lblcreateaccount;
    public JTextField txtFirstName, txtLastName, txtAddress, txtUsername, txtEmail;
    public JPasswordField txtPassword;
    public JButton btnCreate;
    public JPanel formPanel, logoPanel;
    
    public CreateAccount() {
        setTitle("GrubGroove");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        
        // logo panel
        ImageIcon logo = new ImageIcon(new ImageIcon("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\GrubGroove\\src\\images\\grubgroovelogo.png").getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH));
        lblLogo = new JLabel(logo);
        logoPanel = new JPanel(new BorderLayout());
        logoPanel.add(lblLogo, BorderLayout.NORTH);
        

        // title
        lblcreateaccount = new JLabel("Create Account");
        lblcreateaccount.setFont(new Font("Montserrat", Font.BOLD, 20));
        lblcreateaccount.setHorizontalAlignment(SwingConstants.LEFT);
        logoPanel.add(lblcreateaccount);   
        
        add(logoPanel, BorderLayout.NORTH);  
        
        formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 1;
        formPanel.add(lblcreateaccount, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        lblFirstName = new JLabel("First Name:");
        lblFirstName.setFont(new Font("Montserrat", Font.BOLD, 14));
        formPanel.add(lblFirstName, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        txtFirstName = new JTextField(20);
        formPanel.add(txtFirstName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        lblLastName = new JLabel("Last Name:");
        lblLastName.setFont(new Font("Montserrat", Font.BOLD, 14));
        formPanel.add(lblLastName, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        txtLastName = new JTextField(20);
        formPanel.add(txtLastName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        lblAddress = new JLabel("Address:");
        lblAddress.setFont(new Font("Montserrat", Font.BOLD, 14));
        formPanel.add(lblAddress, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        txtAddress = new JTextField(20);
        formPanel.add(txtAddress, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Montserrat", Font.BOLD, 14));
        formPanel.add(lblUsername, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        txtUsername = new JTextField(20);
        formPanel.add(txtUsername, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Montserrat", Font.BOLD, 14));
        formPanel.add(lblPassword, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        txtPassword = new JPasswordField(20);
        formPanel.add(txtPassword, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Montserrat", Font.BOLD, 14));
        formPanel.add(lblEmail, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 6;
        txtEmail = new JTextField(20);
        formPanel.add(txtEmail, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        btnCreate = new JButton("Create Account");
        btnCreate.setBackground(new Color(243, 236, 176));
        btnCreate.setFont(new Font("Montserrat", Font.BOLD, 14));
        formPanel.add(btnCreate, gbc);
        
        formPanel.setSize(formPanel.getPreferredSize());
        logoPanel.setBackground(new Color(110, 204, 175));
        formPanel.setBackground(new Color(110, 204, 175));
        add(formPanel, BorderLayout.CENTER);
        
        setVisible(true);
        setResizable( false );            
        
        btnCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String firstname = txtFirstName.getText();
                String lastname = txtLastName.getText();
                String address = txtAddress.getText();
                String username =txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                String email = txtEmail.getText();
                try{
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/grubgroove","root","");
                    String sqlquery = "INSERT INTO users (firstname,lastname,address,username,password,email) VALUES ('"+firstname+"','"+lastname+"','"+address+"','"+username+"','"+
                            password+"','"+email+"')";
                    PreparedStatement pst = conn.prepareStatement(sqlquery);
                    if(pst.executeUpdate()!= 0){
                        JOptionPane.showMessageDialog(null,"You have successfully created an account.");
                    }
                    txtFirstName.setText("");
                    txtLastName.setText("");
                    txtAddress.setText("");
                    txtUsername.setText("");
                    txtPassword.setText("");
                    txtEmail.setText("");
                } catch(SQLException ex){
                    System.out.println("Error: "+ex.getMessage());
                }
            }
        });

            }
    
    /*btnCreate.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String firstname = txtFirstName.getText();
            String lastname = txtLastName.getText();
            String address = txtAddress.getText();
            String username =txtUsername.getText();
            String password = new String(txtPassword.getPassword());
            String email = txtEmail.getText();
            try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/grubgroove","root","pw");
            String sqlquery = "INSERT INTO users (firstname,lastname,address,username,password,email) VALUES ('"+firstname+"','"+lastname+"','"+address+"','"+username+"','"+
                    password+"','"+email+"')";
            PreparedStatement pst = conn.prepareStatement(sqlquery);
            if(pst.executeUpdate()!= 0){
                JOptionPane.showMessageDialog(null,"You have successfully created an account.");
            }
            txtFirstName.setText("");
            txtLastName.setText("");
            txtAddress.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtEmail.setText("");
            }catch (SQLException ex) {
                ex.printStackTrace();
        }
    }
});*/
        

    public static void main(String[] args) {
        new CreateAccount();
    }
}