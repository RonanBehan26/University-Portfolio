
class PrintExampleSynchMethod {//min 2.02, vid 12
  //same as PrintExample

  public static void main(String args[]) {
    PrintSynchMethod PD = new PrintSynchMethod();

    PrintThreadSynchMethod T1 = new PrintThreadSynchMethod("Thread - 1 ", PD);
    PrintThreadSynchMethod T2 = new PrintThreadSynchMethod("Thread - 2 ", PD);

    T1.start();
    T2.start();

    // wait for threads to end
    try {
      T1.join();
      T2.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}

//changes are down here
class PrintSynchMethod {

  synchronized public void printCount() { //here synchronized!!!!!!!!!!!!!!!
    //now only one thread can have access at a time, always the same output
    //thread 1 has control
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Counter   ---   " + i);
      }
    } catch (Exception e) {
      System.out.println("Thread  interrupted.");
    }
  }
}

class PrintThreadSynchMethod extends Thread {

  private Thread t;
  private String threadName;
  PrintSynchMethod PD;

  PrintThreadSynchMethod(String name, PrintSynchMethod pd) {
    threadName = name;
    PD = pd;
  }

  public void run() {
    PD.printCount();
    System.out.println("Thread " + threadName + " exiting.");
  }

  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}
