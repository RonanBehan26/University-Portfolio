/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronan.cristina;

/**
 *
 * @author Ronan
 */
public class RonanCristina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI theView = new GUI();
    	RonanBehan theModel = new RonanBehan();
        Food_Delivery_App_Handler theController = new Food_Delivery_App_Handler(theView,theModel);
        theView.setVisible(true);
    }
    
}
