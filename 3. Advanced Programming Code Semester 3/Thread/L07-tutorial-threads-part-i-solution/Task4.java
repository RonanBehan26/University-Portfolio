
public class Task4 {//vid 12 min 49

  public static void main(String args[]) {
    Runnable first = new First();
    Runnable second = new Second();
    Runnable third = new Third();

    new Thread(first).start();
    new Thread(second).start();
    new Thread(third).start();
  }
}

class First implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("a");
    }
  }
}

class Second implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("b");
    }
  }
}

class Third implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i);
    }
  }
}

//  Create a program that runs three threads:
//        •	The first thread prints the letter a 100 times.
//        •	The second thread prints the letter b 100 times.
//        •	The third thread prints the integers 1 through 100.
