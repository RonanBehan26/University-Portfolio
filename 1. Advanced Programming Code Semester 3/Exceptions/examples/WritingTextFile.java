package examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author LNardin
 */
public class WritingTextFile {//min 26 w6
    //-----------------------------------------------------------------
    //  Creates a file of test data that consists of ten lines each
    //  containing ten integer values in the range 10 to 99.
    //-----------------------------------------------------------------
    public static void main(String[] args) throws IOException { //can do try/catch too 30:43 w6, need the IO exception for file
        final int MAX = 10;

        int value;
        String file = "test.dat"; //name of the file

        Random rand = new Random();
//he also does try and catch in his version, does both ways!
        FileWriter fw = new FileWriter(file); //take out the throws IOException, and this won't work 27:07 w6
        //this referances the instance of the file, and creates proper
        BufferedWriter bw = new BufferedWriter(fw);
        //to write in the file you neeed the BufferedWriter
        PrintWriter outFile = new PrintWriter(bw);
        //max number of lines ins 10 as specified above
        for (int line = 1; line <= MAX; line++) {
            for (int num = 1; num <= MAX; num++) {
                value = rand.nextInt(90) + 10; //gen 90 randome nums in the file
                outFile.print(value + "   ");
                //println statement to outFile. println , this means the output is getting sent to the file specified,
                // and not to the console.
                //If you want to verify that the output is indeed being printed, you can include System.
            }
            outFile.println();
        }

        outFile.close();
        System.out.println("Output file has been created: " + file);
    }
}
