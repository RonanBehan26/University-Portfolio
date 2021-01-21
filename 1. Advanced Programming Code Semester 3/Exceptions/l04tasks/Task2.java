package l04tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 { //2.57 on lecture 4
    //he has an extra index part of the try catch in the vid, if between a and b; it'll be correct

    public static void main(String[] args) {
        int[] data = new int[100];
        int index = 0;
        boolean notOk;

        // Initialize array
        for (int i = 0; i < 100; i++) {
            data[i] = (int) (Math.random() * 10000); //creating an array
        }

        do { // keeps running until it gets the right ans
            notOk = false;
            try {
                System.out.print("Enter an index: ");
                Scanner input = new Scanner(System.in);
                index = input.nextInt();
            } catch (InputMismatchException e) {
                notOk = true;
            }
        } while (notOk);

        try {
            System.out.println("The element is " + data[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
    }
}
