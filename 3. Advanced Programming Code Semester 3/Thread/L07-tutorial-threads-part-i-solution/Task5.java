
public class Task5 implements Runnable {

  private int delay;

  public Task5(int delayTime) {

    this.delay = delayTime;
  }

  public void run() {
    try {
      Thread.sleep(this.delay);//if you put them to sleep they will finalize, run in parallel
    } catch (InterruptedException e) {
      return;
    }
  }

  public static void main(String args[]) {
    for (int i = 0; i < 1000; i++) {//1000 tasks
      Runnable p = new Task5(0);//wait for 0 seconds
      new Thread(p).start();
      System.out.println(Thread.activeCount()); //then see how many are active
      //activecount - static method that allows you to check what is active and not
    }
  }
}
