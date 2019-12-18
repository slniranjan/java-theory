package synchronizeblock;

public class Table {

  void printTable(int n) {
    synchronized (this) {
      for (int i = 1; i < 5; i++) {
        System.out.println(n * i);
        try {
          Thread.sleep(400);
        } catch (InterruptedException e) {
          System.out.println(e);
        }
      }
    }
  }

}
