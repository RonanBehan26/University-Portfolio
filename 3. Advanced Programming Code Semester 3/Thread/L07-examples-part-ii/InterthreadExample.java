
class InterthreadExample {

  public static void main(String arg[]) {
    final Customer c = new Customer(); //customer object has the withdraw and deposit functions below
    new Thread() {
      public void run() {
        c.withdraw(15000);
      }//thread withdraw
    }.start();//this thread will go to the wait as it's 15, and we have 10

    new Thread() {
      public void run() {
        c.deposit(10000);
      }//thread to deposit 10000
    }.start();

    new Thread() {//deposits another 10k
      public void run() {
        c.deposit(10000);
      }
    }.start();
  }
}

class Customer {

  int amount = 10000;//has in back account

  synchronized void withdraw(int amount) {
    System.out.println("Available Balance " + this.amount);
    System.out.println("Going to withdraw." + amount);

    if (this.amount < amount) {//checks if there is enough money
      System.out.println("Insufficient Balance waiting for deposit.");//if less
      try {
        wait();//if not enough, goes to wait
      } catch (Exception e) {
        System.out.println("Interruption Occured");
      }
    }
    this.amount -= amount;//if there is enough in there it is withdrawn
    System.out.println("Detected amaount: " + amount);
    System.out.println("Balance amount : " + this.amount);
  }

  synchronized void deposit(int amount) {
    System.out.println("Going to deposit " + amount);
    this.amount += amount;//deposits in the balance
    System.out.println("Available Balance " + this.amount);
    System.out.println("Transaction completed.\n");
    notify();//once deposit, notify the wait above
  }
}
