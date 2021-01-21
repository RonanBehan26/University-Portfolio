
class Task6 implements Runnable {

  Thread t;//create thread

  Task6() {
    this.t = new Thread(this);
    this.t.start();
  }

  public void run() { //print priority
    System.out.println("Inside run method, priority " + this.t.getPriority());
  }

  public static void main(String[] args) {
    Thread.currentThread().setPriority(Thread.MAX_PRIORITY); //this sets priority for main thread
//then print the priority
    //can change to MIN if you like
    System.out.println("main thread priority : "
            + Thread.currentThread().getPriority());

    new Thread(new Task6());
  }
}
