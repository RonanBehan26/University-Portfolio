//Run is the main method of the thread,
//the only method the start calls is the run
//start 1.09
public class RunPingPong implements Runnable {//vid 11 min 1.08
  //note instance runnable, instance in the main below

  //!!!!!!!!!!!!!This is just! another way of creating a Thread

  private String word;
  private int delay;

  public RunPingPong(String whatToSay, int delayTime) {
    this.word = whatToSay;
    this.delay = delayTime;
  }

  //Run is the main method of the thread,
  //the only method the start calls is the run
  @Override
  public void run() {
    try {
      while (true) {
        System.out.println(this.word + " ");
        Thread.sleep(this.delay);
      }
    } catch (InterruptedException e) {
      return;
    }
  }

  public static void main(String args[]) { // instantiate the class
    Runnable ping = new RunPingPong("Ping", 33); // Runnable
    Runnable pong = new RunPingPong("Pong", 100);
    new Thread(ping).start(); //associating the Thread class
    new Thread(pong).start();
  }
}
