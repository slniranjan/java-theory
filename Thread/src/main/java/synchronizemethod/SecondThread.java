package synchronizemethod;

public class SecondThread implements Runnable {

  Table t;

  public SecondThread(Table t) {
    this.t = t;
  }

  @Override
  public void run() {
    t.printTable(100);
  }

}
