package interruptingthread;

public class InterruptingThread implements Runnable {

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      System.out.println("Task");
    } catch (InterruptedException e) {
      //if throw exception thread doesn't work further
//      throw new RuntimeException("Thread interrupted..." + e);
      System.out.println("Exception handled...");
    }
    System.out.println("Thread is running...");
  }

  public static void main(String[] args) {
    InterruptingThread interruptingThread = new InterruptingThread();
    Thread t = new Thread(interruptingThread);
    t.start();
//    try {
//      t.interrupt();
//    } catch (Exception e) {
//      System.out.println("Exception handled "+e);
//    }
    t.interrupt();

  }

}

