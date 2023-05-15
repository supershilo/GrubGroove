
package grubgroove;

import javax.swing.*;
import java.awt.*;

public class NavigationBar  {
    
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("GrubGroove");
        frame.getContentPane().setBackground(new Color(68, 68, 68));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JMenuBar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(23, 23, 23));
        menuBar.setPreferredSize(new Dimension(menuBar.getWidth(), 50));

        // Home
        JMenu homeMenu = new JMenu("Home");
        homeMenu.setFont(new Font("Montserrat", Font.BOLD, 14));
        homeMenu.setIcon(new ImageIcon("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\GrubGroove\\src\\images\\home.png"));
        homeMenu.setForeground(new Color(237, 237, 237));
        homeMenu.setPreferredSize(new Dimension(100, 20)); 
        menuBar.add(homeMenu);
        
        // Menu
        JMenu menuMenu = new JMenu("Menu");
        menuMenu.setFont(new Font("Montserrat", Font.BOLD, 14));
        menuMenu.setIcon(new ImageIcon("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\GrubGroove\\src\\images\\menu.png"));
        menuMenu.setForeground(new Color(237, 237, 237));
        menuMenu.setPreferredSize(new Dimension(100, 20)); 
        menuMenu.setHorizontalAlignment(JMenu.CENTER);
        menuBar.add(menuMenu);
        
        //Order
        JMenu orderMenu = new JMenu("Order");
        orderMenu.setFont(new Font("Montserrat", Font.BOLD, 14));
        orderMenu.setIcon(new ImageIcon("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\GrubGroove\\src\\images\\order.png"));
        orderMenu.setForeground(new Color(237, 237, 237));
        orderMenu.setPreferredSize(new Dimension(100, 20)); 
        orderMenu.setHorizontalAlignment(SwingConstants.CENTER);
        menuBar.add(orderMenu);
        
        //add item to Order
        JMenuItem orderhistoryItem = new JMenuItem("Order History");
        orderhistoryItem.setIcon(new ImageIcon("order.png"));
        orderhistoryItem.setHorizontalAlignment(SwingConstants.CENTER);
        orderMenu.add(orderhistoryItem);
        
        //Cart
        JMenu cartMenu = new JMenu("Cart");
        cartMenu.setFont(new Font("Montserrat", Font.BOLD, 14));
        cartMenu.setIcon(new ImageIcon("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\GrubGroove\\src\\images\\cart.png"));
        cartMenu.setForeground(new Color(237, 237, 237));
        cartMenu.setPreferredSize(new Dimension(100, 20)); 
        cartMenu.setHorizontalAlignment(SwingConstants.CENTER);
        menuBar.add(cartMenu);
        
        menuBar.setLayout(new GridBagLayout());
        // Add JMenuBar to JFrame
        frame.setJMenuBar(menuBar);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
     
    }
}

