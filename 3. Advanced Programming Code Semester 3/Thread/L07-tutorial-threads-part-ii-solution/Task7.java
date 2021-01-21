
public class Task7 {//vid 12 2.36

  public static void main(String[] args) {
    Counter counter = new Counter();//2 methods, 1 to increment, 1 to decrement
    Thread t1 = new Thread(counter, "Thread-1");
    Thread t2 = new Thread(counter, "Thread-2");
    Thread t3 = new Thread(counter, "Thread-3");
    t1.start();
    t2.start();
    t3.start();
  }
}

class Counter implements Runnable {

  private int c = 0;

  public void increment() { // you could also put the sychronized here, but problem - might not get the right result, race condition
    try {//we guarantee the correct result if we have it as it is
      Thread.sleep(10);//sleeps when increment, 10 ml seconds
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
    c++;//this is the shared resource
  }

  public void decrement() {
    c--;
  } //no delay
  // you could also put the sychronized here, but problem - might not get the right result, race condition

  public int getValue() {
    return c;
  }

  @Override
  public void run() {//could synchronize here too, works pretty much the same as doing both below
    synchronized (this) {//this is key, puts them in order
      increment();
      System.out.println("Value for Thread After increment "
              + Thread.currentThread().getName() + " " + this.getValue());

      this.decrement();
      System.out.println("Value for Thread at last "
              + Thread.currentThread().getName() + " " + this.getValue());
    }
  }
}
