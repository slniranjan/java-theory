package synchronizemethod;

public class Table {

  synchronized void printTable(int n) {
    for (int i = 1; i < 5; i++) {
      System.out.println(n*i);
      try {
        Thread.sleep(400);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }

}
