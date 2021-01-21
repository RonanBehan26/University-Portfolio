package l04tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        boolean notOk;
        do { // don't allow them to proceee until they put in the correct info
            notOk = false;
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                a = keyboard.nextInt();
            } catch (InputMismatchException e) {
                notOk = true; // this is above the catch in the recordings
            } finally {
                System.out.println();
            }
        } while (notOk);

        do {
            notOk = false;
            try {
                System.out.print("Enter another integer: ");
                Scanner keyboard = new Scanner(System.in);
                b = keyboard.nextInt();
            } catch (InputMismatchException e) {
                notOk = true;
            } finally {
                System.out.println();
            }
        } while (notOk);

        System.out.println("The sum is " + (a + b));
    }
}
