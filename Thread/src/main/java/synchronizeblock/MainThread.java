package synchronizeblock;

public class MainThread {

  public static void main(String[] args) {
    Table obj = new Table(); // only one object
    new Thread(new FirstThread(obj)).start();
    new Thread(new SecondThread(obj)).start();
  }
}
