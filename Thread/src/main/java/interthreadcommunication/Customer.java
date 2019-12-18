package interthreadcommunication;

public class Customer {

  int amount = 1000;

  synchronized void withdraw(int amount) {
    System.out.println("Going to withdraw");
    if (this.amount < amount) {
      System.out.println("Less balance, waiting for deposit");
      try {
        wait();
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
    }

    this.amount -= amount;
    System.out.println("Withdraw completed ...");
  }

  synchronized void deposit(int amount) {
    System.out.println("going to deposit");
    this.amount += amount;
    System.out.println("deposit completed");
    notify();
  }
}
