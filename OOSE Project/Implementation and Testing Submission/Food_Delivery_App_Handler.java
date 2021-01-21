/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//controller
package ronan.cristina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ronan
 */
public class Food_Delivery_App_Handler {
    
    private GUI theView;
    private RonanBehan theModel;

    public FDAController(GUI theView, RonanBehan theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        
        
    
        private String RegisterName;
        private String RegPassword;

        this.theView.addListener(new AddListener());
      
        this.theView.userNameListener(new UserNameListener());
        this.theView.PasswordListener(new PasswordListener());
        this.theView.RegisterNameListener(new RegisterNameListener());
        this.theView.RegPasswordListener(new RegPasswordListener());
        
        class UserNameListener implements ActionListener{

        @Override 
        // @Override annotation used because we are implementing an abstract class
        public void actionPerformed(ActionEvent e) {

            

            try
            {
                
            }

            catch(NumberFormatException ex)
            {
                System.out.println(ex);
                theView.incorrectInputInfo("Imput incorrect. Please try again.");
            }
        }
        
        
    }
        
         class PasswordListener implements ActionListener{

        @Override 
        // @Override annotation used because we are implementing an abstract class
        public void actionPerformed(ActionEvent e) {

            

            try
            {
                
            }

            catch(NumberFormatException ex)
            {
                System.out.println(ex);
                theView.incorrectInputInfo("Imput incorrect. Please try again.");
            }
        }
        
         class RegisterNameListener implements ActionListener{

        @Override 
        // @Override annotation used because we are implementing an abstract class
        public void actionPerformed(ActionEvent e) {

            

            try
            {
                
            }

            catch(NumberFormatException ex)
            {
                System.out.println(ex);
                theView.incorrectInputInfo("Imput incorrect. Please try again.");
            }
        }
        
         class RegPasswordListener implements ActionListener{

        @Override 
        // @Override annotation used because we are implementing an abstract class
        public void actionPerformed(ActionEvent e) {

            

            try
            {
                
            }

            catch(NumberFormatException ex)
            {
                System.out.println(ex);
                theView.incorrectInputInfo("Imput incorrect. Please try again.");
            }
        }
        
        
    }
    
}
