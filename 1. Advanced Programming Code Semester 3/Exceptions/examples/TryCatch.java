package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
     
        try {
            Scanner keyboard = new Scanner(System.in);
            int number = keyboard.nextInt();
            // I get that these seem to be unrelated, it is for the purpose of showing the below exceptions
            System.out.println( numerator / denominator );
            
            System.out.println( "This text will not be shown");
        } catch(ArithmeticException e){
            System.out.println( e.getMessage() );
        } catch(InputMismatchException e){
            e.printStackTrace();
        } finally {
            //Close File
            System.out.println("This text will be shown NOW");
        }
    }
}
