package l04tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter the number of Stuff: ");
            int num = keyboard.nextInt();
            
            long r  = Math.round(Math.random() * 100); //r is a number we round from gettting a random number and multiplying it
            if (num > r) { //r was defined randomly
                throw new TooManyStuffException("Random number is " + r);
            }
            System.out.println("Reasonable number of stuff!"); //create new exceptions, throw to raise them
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (TooManyStuffException e) { //this is a checked exception that calls line 17
            System.out.println("Error: " + e.getTooManyMessages());
        }
    }
}
