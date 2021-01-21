package task5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStreamForArray {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3, 4, 5}; //arr of ints
        String[] strings = {"John", "Susan", "Kim"}; //arrsof strings

        try ( // Create an output stream for file array.dat
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true));) { //the true here means if it exists, just append
            // Write arrays to the object output stream,
            // make them objects into the file
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        try ( // Create an input stream for file array.dat
              //reading part
              // (int[]) this is casting (might just be for objects), don't forget to cast the object!!!!!!!!!!!!!
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newStrings = (String[]) (input.readObject());

            //printing
            // Display arrays
            for (int i = 0; i < newNumbers.length; i++) {
                System.out.print(newNumbers[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < newStrings.length; i++) {
                System.out.print(newStrings[i] + " ");
            }
        }
    }
}
