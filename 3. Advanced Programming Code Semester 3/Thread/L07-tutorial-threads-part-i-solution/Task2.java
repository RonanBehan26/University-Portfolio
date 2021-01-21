
public class Task2 {

  public static void main(String args[]) {
    for (int i = 0; i < 10; i++) {
      Thread x = new Thread();
      x.setName(Long.toBinaryString(i));
      System.out.println(x.getName());
    }
  }
}

//  Change the program above to change the name of the thread to the same value
//        as its ID and then prints the name of the thread.
//        Check the Java API again to find the method that returns a thread’s name.

