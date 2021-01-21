import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
Write a program that reads in a text file one line
 at a time and prints this line to the screen.
NOTE: Use BufferedReader and FileReader classes.
Look at the documentation for details.

 */
//IO Exception is the main exception
public class Task3 {

    public static void main(String[] args) throws IOException {

        // to point at the file you need to create a pointer to the file
        //so we use an object file, it just points, see if the file exists, opens file
        File f = new File("input.txt"); //1.15.25 - different examples src\\tasks\\input.txt

        BufferedReader b = new BufferedReader(new FileReader(f));
        //FileReader to read the file, pushes to bufferedreader, open reads and puts in buffered
        //bufferedreader gives us several methods that allows us to access the file char by char

        String readLine = ""; //this is the line I'm going to read
        System.out.println("Reading file using Buffered Reader");
        while ((readLine = b.readLine()) != null) { //readLine, will read line by line from b, assigning the content to var readline (1:10 w7)
            //put in var readline, but if null, you have reached the end of the file
            System.out.println(readLine);
        }

        b.close();
    }
}
}
