/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//view
package ronan.cristina;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;

public class GUI implements ActionListener{
    
    //this is an example of what the coding for the gui would look like
  
    // In this section we define elements of our GUI
   
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    this.setSize(450, 250);
    this.setDefaultCloseOperation(JFrame.Exit_On_Close);
    this.setSVisible(true);
    this.add(panel);
    
    this.setLayout(null);
    
    JLabel userLabel = new JLabel("User"); // these are the labels
    label.setBounds(10, 20, 80, 25);
    panel.add(userLabel);
    
    JTextField userText = new JTextField(40);
    userText.setBounds(100, 20, 165, 25);
    panle.add(userText);
    
    JLabel passwordLabel = new JLabel("Password");
    label.setBounds(10, 60, 80, 25);
    panel.add(passwordLabel);
    
    JPasswordField passwordText = new JPasswordField();
    passwordText.setBounds(100, 50, 165, 25);
    panel.add(passwordText);
    
    JButton button = new JButton("Login");
    button.addActionListener(new GUI());
    buttons.setBounds(10, 80, 80, 25);
    panel.add(button)
            
            
            
            
    JLabel RegisteruserLabel = new JLabel("Register"); // these are the labels
    label.setBounds(10, 20, 80, 25);
    panel.add(RegisteruserLabel);
    
    JTextField RegisteruserText = new JTextField(40);
    userText.setBounds(100, 20, 165, 25);
    panel.add(RegisteruserText);
    
    JLabel NewpasswordLabel = new JLabel("New Password");
    label.setBounds(10, 120, 80, 25);
    panel.add(NewpasswordLabel);
    
    JPasswordField NewpasswordText = new JPasswordField();
    passwordText.setBounds(100, 100, 165, 25);
    panel.add(NewpasswordText);
    
    JButton button = new JButton("Register");
    button.addActionListener(new GUI());
    buttons.setBounds(10, 160, 80, 25);
    panel.add(button)
            
            //if sucessful
    JLabel success = new JLabel("");
    success.setBounds(10, 100, 300, 25);
    panel.add(success);
    success.setText;
    
    
            
    frame.setVisible(true);

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

