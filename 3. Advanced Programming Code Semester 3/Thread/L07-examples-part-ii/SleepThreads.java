
//same as the YeildThreads, but sleep method
//vid 12 1:22
public class SleepThreads {

  public static void main(String args[]) {
    new NewSleepThread("One");
    new NewSleepThread("Two");
    new NewSleepThread("Three");

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread exiting");
  }
}

class NewSleepThread implements Runnable {

  String name;
  Thread t;

  NewSleepThread(String threadName) {
    this.name = threadName;
    this.t = new Thread(this, this.name);
    System.out.println("New thread: " + t);
    t.start();
  }

  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(this.name + ": " + i);
        Thread.sleep(1000);//1 second, block a thread for a specific amount of time
      }
    } catch (InterruptedException e) {
      System.out.println(this.name + " Interrupted");
    }
    System.out.println(this.name + " exiting");
  }
}
