package shutdownhook;

public class ShutdownTask implements Runnable {

  @Override
  public void run() {
    System.out.println("Shutdown hook task completed...");
  }

}
