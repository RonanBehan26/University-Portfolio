package l04tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 { //video 5, min 40

    public static void main(String[] args) {

        try {
            System.out.println("Enter a number: ");
            Scanner keyboard = new Scanner(System.in);
            float number = keyboard.nextFloat();

            if (number < 0) {
                throw new ArithmeticException("Cannot perform this operation with a negative number");
            }
            System.out.println("The squared root is " + Math.sqrt(number));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            // Do some processing
        }
    }
}
