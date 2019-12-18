package synchronizemethod;

public class FirstThread implements Runnable {

  Table t;

  public FirstThread(Table t) {
    this.t = t;
  }

  @Override
  public void run() {
    t.printTable(5);
  }

}
