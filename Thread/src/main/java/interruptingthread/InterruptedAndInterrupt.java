package interruptingthread;

public class InterruptedAndInterrupt implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <= 2; i++) {
      if (Thread.interrupted()) {
        System.out.println("Code for interrupted thread");
      } else {
        System.out.println("Code for normal thread");
      }
    }

  }

  public static void main(String[] args) {
    Thread t1 = new Thread(new InterruptedAndInterrupt());
    Thread t2 = new Thread(new InterruptedAndInterrupt());

    t1.start();
    t1.interrupt();

    t2.start();
  }
}
