
class PrintExample {//this is to show what it's like without sychronization

  public static void main(String args[]) {
    Print PD = new Print(); //create object

    //create 2 threads
    //pass same object into 2 threads
    //shared resouce is print line 5
    //shared resouce is print line 5
    //method below
    PrintThread T1 = new PrintThread("Thread - 1 ", PD);
    PrintThread T2 = new PrintThread("Thread - 2 ", PD);

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

class Print { //line 5

  public void printCount() { //one method, runs a loop
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println("Counter   ---   " + i);
      }
    } catch (Exception e) {
      System.out.println("Thread  interrupted.");
    }
  }
}

class PrintThread extends Thread { // receives the parameters from above, goes to run to execute

  private Thread t;
  private String threadName;
  Print PD;

  PrintThread(String name, Print pd) {
    threadName = name;
    PD = pd;
  }

  public void run() {
    PD.printCount();//executes
    System.out.println("Thread " + threadName + " exiting.");
  }

  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      //explains the next line vid 12 min 2.20
      t = new Thread(this, threadName); //why is this weird?
      //we are not using runnable, using extends, so when instantiate
      //start method object, checks if t is empty, creates new thread
      //this is a key word that points to object that you created with the view
      t.start();//after instantiating the thread, start again
    }
  }
}
