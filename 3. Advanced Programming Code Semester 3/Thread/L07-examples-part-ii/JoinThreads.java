
public class JoinThreads {

  public static void main(String args[]) {
    NewJoinThread ob1 = new NewJoinThread("One");
    NewJoinThread ob2 = new NewJoinThread("Two");
    NewJoinThread ob3 = new NewJoinThread("Three");
    //three threads, for loop 5 - 0

    //here he is checking the state of the threads, should be true
    System.out.println("Thread One is alive: " + ob1.t.isAlive());
    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
    System.out.println("Thread Three is alive: " + ob3.t.isAlive());


    //use the join to wait for the thread to finish
    //forces the ones after to wait for the predecessor
    try {
      System.out.println("Waiting for threads to finish");
      ob1.t.join(); // only continue after object one has finished
      ob2.t.join();
      ob3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }

    //once again print the state of the threads, should be false
    System.out.println("Thread One is alive: " + ob1.t.isAlive());
    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
    System.out.println("Thread Three is alive: " + ob3.t.isAlive());

    System.out.println("Main thread exiting");
  }
}

class NewJoinThread implements Runnable {

  String name;
  Thread t;

  NewJoinThread(String threadName) {
    this.name = threadName;
    this.t = new Thread(this, this.name);
    System.out.println("New thread: " + t);
    t.start();
  }

  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(this.name + ": " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(this.name + " Interrupted");
    }
    System.out.println(this.name + " exiting");
  }
}
