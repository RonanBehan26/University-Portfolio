import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task6 {

    //-----------------------------------------------------------------
    //  Creates a file of test data that consists of ten lines each
    //  containing ten integer values in the range 10 to 99.
    //-----------------------------------------------------------------

    // Implement the Writing Text Files (Slide 34 of Exceptions) using the Try with resources feature.
    //try seems to close files without asking it to close
    //2.20 w7
    public static void main(String[] args) throws IOException {
        final int MAX = 10;

        int value;
        String file = "test.dat";

        Random rand = new Random();

        //why no catch? because all the exceptions for this would be in the IOException
        try ( //put following 3 into this try, don't need a close
              //note, no catch, all the exceptions would be IO Exceptions, thrown up
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter outFile = new PrintWriter(bw);) //says from try to here is the main point, all the read and write need to be in the try block
         {
            for (int line = 1; line <= MAX; line++) {
                for (int num = 1; num <= MAX; num++) {
                    value = rand.nextInt(90) + 10;
                    outFile.print(value + "   ");
                }
                outFile.println();
            }
        }

        System.out.println("Output file has been created: " + file);
    }
}
