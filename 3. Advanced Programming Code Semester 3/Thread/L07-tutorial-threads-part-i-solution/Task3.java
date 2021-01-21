
public class Task3 implements Runnable {
  //if impliemnt the runnable you must override the run, but it will expect the run method

  private String word;
  private int num;

  public Task3(String whatToSay, int numTimes) {
    this.word = whatToSay;
    this.num = numTimes;
  }

  @Override //main method remember
  public void run() {
    for (int i = 0; i < this.num; i++) {
      System.out.println(this.word + " ");
    }
  }

  //remember grey is intellij
  //different from RunPingPong, take a look to see the difference
  //vid 12 min 24, goes over this
  public static void main(String args[]) {
    Thread first = new Thread(new Task3("First", 2));
    Thread second = new Thread(new Task3("Second", 2));

    //Runnable ping = new RunPingPong("Ping", 33); - on the run method, can't do start, this is why
    //to keep a thread, have the runnable as a parameter, line 23, 24
    //only creating an object in 26
    //give the object to the thread
    //the start is hard coded to call the run() method

    first.setPriority(1);
    second.setPriority(2);
    //schedulaer is observing the priority

    second.start();//this does start first even though it has a lower priority
    first.start();
  }
}

//  Create a program that creates a thread that print X times a Word on the screen.
//        Initialize two threads to print twice (X = 2) the word on the screen.
//        Set the priority of thread 1 to 1 and the priority of thread 2 to 2,
//        but start first the thread 2 and then thread 1.
