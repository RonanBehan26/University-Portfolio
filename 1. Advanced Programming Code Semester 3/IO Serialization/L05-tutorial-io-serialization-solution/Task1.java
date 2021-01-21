import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Write a program that gets input about an Employee (Name, Address, SSN)
from the user via the console and prints what the user typed in on the screen.

 */

public class Task1 {

    public static void main(String args[]) throws InputMismatchException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Employee name: ");
        String name = keyboard.nextLine();

        System.out.print("Employee address: ");
        String address = keyboard.nextLine();

        System.out.print("Employee ssn: ");
        int ssn = keyboard.nextInt();

        System.out.println("Employee " + name + " that lives at " + address
                + " whose SSN is " + ssn);
    }
}