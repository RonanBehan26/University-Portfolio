
public class Task8 {//min 20 vid 13

  public static void main(String[] args) {

    //how can i coordinate consumer consumes and producer prudcesS

    CubbyHole c = new CubbyHole();//instatiate the object

    Producer p1 = new Producer(c, 1);
    Consumer c1 = new Consumer(c, 1);

    p1.start();
    c1.start();
  }
}

class CubbyHole {//2 methods, get and put

  private int contents;
  private boolean available = false;

  public synchronized int get(int who) {//get method must be synchronised
    while (this.available == false) {
      try {
        wait();//wait for an element
      } catch (InterruptedException e) {
      }
    }
    this.available = false;
    System.out.println("Consumer " + who + " got: " + this.contents);
    notifyAll();//notify when there is an element
    return this.contents;
  }

  public synchronized void put(int who, int value) {
    while (this.available == true) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
    this.contents = value;
    this.available = true;
    System.out.format("Producer " + who + " put: " + this.contents);
    notifyAll();
  }
}

class Producer extends Thread {

  private CubbyHole cubbyhole;
  private int number;

  public Producer(CubbyHole c, int number) {
    this.cubbyhole = c;//goes to run
    this.number = number;
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      this.cubbyhole.put(this.number, i);//creates and element and goes to sleep
      try {
        sleep((int) (Math.random() * 100));
      } catch (InterruptedException e) {
      }
    }
  }
}

class Consumer extends Thread {

  private CubbyHole cubbyhole;
  private int number;

  public Consumer(CubbyHole c, int number) {
    this.cubbyhole = c;
    this.number = number;
  }

  //dpes differnetly in the vid
  public void run() {
    for (int i = 0; i < 10; i++) {
      this.cubbyhole.get(this.number);
    }
  }
}
