package comparerepeatmethods;

public class CompareRepeatMethods {

  /**
   * Uses repeated concatenation to compose a String with n copies of character
   * c.
   */
  public static String repeat1(char c, int n) {
    String answer = ""; //put in if you like
    for (int j = 0; j < n; j++) { //this adds a character
      answer += c;
    }
    return answer;
  }

  /**
   * Uses StringBuilder to compose a String with n copies of character c.
   */
  public static String repeat2(char c, int n) {
    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < n; j++) {
      sb.append(c); //append at the end of the string
    }
    return sb.toString();
  }

  /**
   * Tests the two versions of the 'repeat' algorithm, doubling the size of n
   * each trial, beginning with the given start value. The first command line
   * argument can be used to change the number of trials, and the second to
   * adjust the start value.
   */
  public static void main(String[] args) {
    int n = 50000;                           // starting value
    //me1 we have 50000 elements
    int trials = 10;
    try {
      if (args.length > 0) {
        trials = Integer.parseInt(args[0]);
      }
      if (args.length > 1) {
        n = Integer.parseInt(args[1]);
      }
    } catch (NumberFormatException e) {
    }
    int start = n;  // remember the original starting value

    // let's run version 2 (the quicker one) first
    System.out.println("Testing repeat2...");
    //me2 then we will run it for 10 times as specified above
    for (int t = 0; t < trials; t++) {
      long startTime = System.currentTimeMillis();
      repeat2('-', n);
      long endTime = System.currentTimeMillis();
      long elapsed = endTime - startTime;
      System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
      n *= 2;                                // double the problem size
    }

    System.out.println("Testing repeat1...");
    n = start;                               // restore n to its start value
    //me3 then this
    for (int t = 0; t < trials; t++) {
      long startTime = System.currentTimeMillis();
      repeat1('-', n);
      long endTime = System.currentTimeMillis();
      long elapsed = endTime - startTime;
      System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
      n *= 2;                                // double the problem size
    }
  }
}