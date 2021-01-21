//you can always use runable
//Thread, old fashioned with some overhead
public class PingPong extends Thread { //min 1.00 vid 11
  //1. you need to extend the thread, enable it to be executed as a thread

  private String word;
  private int delay;

  public PingPong(String whatToSay, int delayTime) {
    this.word = whatToSay;
    this.delay = delayTime;
  }

  //Run is the main method of the thread,
  //the only method the start calls is the run
  @Override //override the run
  public void run() { // it actually runs now because of the run() method
    try { // try/while, run indefinately
      while (true) {
        System.out.println(this.word + " "); //print the word and the space
        Thread.sleep(this.delay); // will wait for the delay time (Thread.sleep)
      }
    } catch (InterruptedException e) {
      return;
    }
  }
 //remember grey is intellij
  public static void main(String args[]) { //2 threads executing in parallel
    new PingPong("Ping", 33).start(); //receive 2 parameters - ping, 33
    new PingPong("Pong", 100).start();//""
    //the PingPong calls the class and the constructor
    //note: .start(); -----------------
  }
}
