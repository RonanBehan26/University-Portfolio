
class PrintExampleSynchStatement {

  public static void main(String args[]) {
    PrintSynchStatement PD = new PrintSynchStatement();

    PrintThreadSyncStatement T1 = new PrintThreadSyncStatement("Thread - 1 ", PD);
    PrintThreadSyncStatement T2 = new PrintThreadSyncStatement("Thread - 2 ", PD);

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

class PrintSynchStatement {

  synchronized public void printCount() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Counter   ---   " + i);
      }
    } catch (Exception e) {
      System.out.println("Thread  interrupted.");
    }
  }
}

class PrintThreadSyncStatement extends Thread {

  private Thread t;
  private String threadName;
  PrintSynchStatement PD;

  PrintThreadSyncStatement(String name, PrintSynchStatement pd) {
    threadName = name;
    PD = pd;
  }

  public void run() {
    synchronized (PD) {
      //instead of the whole block just do a bit, same effect, compare, it's clear
      PD.printCount();
    }
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
