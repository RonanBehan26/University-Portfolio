package task5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream { //this is the 1st of the 3

    public static void main(String[] args) throws IOException {
        // Create an output stream for file object.dat
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat")); //to write into this file
        //create a file (above)
        // Write a string, double value, and object to the file
        output.writeUTF("John"); //write a string into the file, here we are using UTF
        //writeUTF(String str) method writes primitive data write of this String in modified UTF-8 format. ...
        //A String instance written by writeObject is written into the stream as a String initially
        //Future writeObject() calls write references to the string into the stream.
        output.writeDouble(85.5);//now a double
        output.writeObject(new java.util.Date());//write a object, a date object, creates a string
        output.close(); //good practice
    }
}