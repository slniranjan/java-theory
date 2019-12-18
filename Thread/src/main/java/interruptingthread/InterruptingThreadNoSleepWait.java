package interruptingthread;

public class InterruptingThreadNoSleepWait implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    Thread t = new Thread(new InterruptingThreadNoSleepWait());
    t.start();
    System.out.println("Before call interrupt()... " + t.isInterrupted());
    t.interrupt();
    System.out.println("After call interrupt()... " + t.isInterrupted());
  }
}
