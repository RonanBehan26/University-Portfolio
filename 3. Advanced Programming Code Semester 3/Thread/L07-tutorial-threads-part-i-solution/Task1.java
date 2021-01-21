
public class Task1 {

  public static void main(String args[]) {
    for (int i = 0; i < 10; i++) {
      Thread x = new Thread();
      System.out.println(x.getId());
    }
  }
}

//  Each Thread object has its own ID. Write a program that creates a number X..
//  of threads and prints out the IDs of each of the threads created.
//        Check the Java API to see which method needs to be called for this.

