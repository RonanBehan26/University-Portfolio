
public class EmptyThread {
//creation and execution of a thread
  public static void main(String args[]) {
    Thread worker = new Thread(); //1st create a new thread object called worker, create thread
    worker.start();//this executes the thread
    //it starts but it does nothing as there is nothing in this
  }
}
