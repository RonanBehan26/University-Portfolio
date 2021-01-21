
public class YieldThreads { //vid 12 min 1.18

  public static void main(String args[]) { //these threads will run in the for loop below
    //create 3 threads, everytime a loop we give yeild to another loop, a chance for it to be scheduled
    //so you can see when it's executed they jumble
    new NewYieldThread("One");
    new NewYieldThread("Two");
    new NewYieldThread("Three");

    //one executes almost immediately, so we don't see the yeild, but we do with the other 2

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread exiting");
  }
}

class NewYieldThread implements Runnable {

  String name;
  Thread t;

  NewYieldThread(String threadName) {
    this.name = threadName;
    this.t = new Thread(this, this.name);
    //t: Thread[One,5,main], first that comes up
    //t is different than this.name,
    //this name in the 1st case is: One: 5
    System.out.println("New thread: " + t); //print this 1st (it mixes but generally)
    t.start();
  }

  public void run() {
    for (int i = 5; i > 0; i--) {
      System.out.println(this.name + ": " + i); //print this 2nd (it mixes but generally)
      Thread.yield(); //everytime it runs it yeilds a processor to another
      //whole point allows the other threads to be scheduled
    }
    System.out.println(this.name + " exiting"); //print this 3rd (it mixes but generally)
  }
}
