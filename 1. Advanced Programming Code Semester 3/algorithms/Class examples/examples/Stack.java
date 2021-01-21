package examples;

import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        int[] data = new int[100];

        // Initialize array
        for (int i = 0; i < 100; i++) {
            data[i] = (int) (Math.random() * 10000);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an index: ");
        int index = input.nextInt();

        try {
            if (index < 0) {
                throw new StackUnderflow();
            } else if (index > data.length) {
                throw new StackOverflow();
            }
            System.out.println("The element is " + data[index]);
        } catch (StackUnderflow | StackOverflow e) {
            System.out.println(e.getStackMsg());
        }
    }
}
