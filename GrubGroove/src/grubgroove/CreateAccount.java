package grubgroove;

import javax.swing.*;
import java.awt.*;

public class CreateAccount extends JFrame{
    JLabel labelimage, labelcreateaccount, labelfname, labellname, labelusername,labelpassword, labelemail;
    JPasswordField passwordfield;
    JTextField txtfieldfname, txtfieldlname, txtfieldaddress, txtfieldusername, txtfieldemail;
    ImageIcon logo;
    JPanel jpanellogo, jpanelmain, jpaneltext;
    JButton btncreateaccount;
    
    public CreateAccount(){
       setTitle("GrubGroove");
       setLayout(new BoxLayout (this.getContentPane(), BoxLayout.Y_AXIS));
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setSize(1920,1080);
       
       //logo
       logo = new ImageIcon(new ImageIcon("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\GrubGroove\\src\\images\\grubgroovelogo.png").getImage().getScaledInstance(160, 160, java.awt.Image.SCALE_SMOOTH));
       labelimage = new JLabel(logo);
       //labelimage.setIcon(logo);
       //getContentPane().add(labelimage);
       
       //logo panel
       jpanellogo = new JPanel(new BorderLayout());
       jpanellogo.add(labelimage,BorderLayout.NORTH);
       
       
       //text label
       labelcreateaccount = new JLabel("Create Account", JLabel.CENTER);
       labelcreateaccount.setFont(new Font("Montserrat", Font.BOLD, 20));
       //jpaneltext = new JPanel(new BorderLayout());
       //jpaneltext.add(labelcreateaccount,BorderLayout.NORTH);
       jpanellogo.setBackground(Color.green);
       //jpaneltext.setBackground(Color.blue);
       add(jpanellogo);
       //add(jpaneltext);
          
       //main panel
       jpanelmain = new JPanel(new GridBagLayout());
         
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        labelusername = new JLabel("Username:");
        txtfieldusername = new JTextField(20);
        labelpassword = new JLabel("Password:");
        passwordfield = new JPasswordField(20);
        
        btncreateaccount = new JButton("Create Account");
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        jpanelmain.add(labelcreateaccount, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;     
        jpanelmain.add(labelusername, constraints);
 
        constraints.gridx = 2;
        jpanelmain.add(txtfieldusername, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;     
        jpanelmain.add(labelpassword, constraints);
         
        constraints.gridx = 2;
        jpanelmain.add(passwordfield, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 4;
        constraints.anchor = GridBagConstraints.CENTER;
        jpanelmain.add(btncreateaccount, constraints);
        //jpanelmain.setBackground(Color.red);
        
         
        // add the panel to this frame
        add(jpanelmain,BorderLayout.NORTH);
        
       
        setLocationRelativeTo(null);
        setVisible(true);
       
    }

    public static void main(String args[]) {
        new CreateAccount();
    }
}
