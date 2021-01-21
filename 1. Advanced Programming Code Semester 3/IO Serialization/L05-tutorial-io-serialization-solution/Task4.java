import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Amend you program from Task 3,
so that when you read a line in from one file, you save that line into another text file.
 */

public class Task4 {
//check task 3 if you have further questions
    public static void main(String[] args) throws IOException {

        // 2 files, to read into and write into another
        File i = new File("input.txt"); //find it, you could give a different path if it doesn't work
        //1.25.41 - ("src\\tasks\\input.txt") - you get an output in your route I think
        File o = new File("output.txt"); //buffered reader creates it

        BufferedReader b = new BufferedReader(new FileReader(i)); //object to read from
        BufferedWriter w = new BufferedWriter(new FileWriter(o)); //write

        //readline() is a method too in the while
        String readLine = "";//check task 3
        System.out.println("Reading file using Buffered Reader");
        System.out.println("Writing file using Buffered Writer");
        while ((readLine = b.readLine()) != null) { //read line by line
            System.out.println(readLine);//print into the console
            w.write(readLine);//write into the output file
            w.newLine();//you need this to go to the next line, most effective way, or just all on same line
        }
        //close input and output
        b.close();
        w.close();
    }
}
