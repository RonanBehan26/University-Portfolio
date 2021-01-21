package task5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream { //Part 2
//This feeds on from the TestObjectOutputStream
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try ( // Create an input stream for file object.dat
              //open file for reading, in try, don't worry about close
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));) {
            // Read a string, double value, and object from the file
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) (input.readObject());
            //read object, but what object, can be any type - so need to cast, therefore (java.util.Date),assigning the date var
            System.out.println(name + " " + score + " " + date);
        }
    }
}
