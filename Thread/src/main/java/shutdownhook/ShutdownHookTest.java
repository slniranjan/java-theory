package shutdownhook;

public class ShutdownHookTest {

  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    r.addShutdownHook(new Thread(new ShutdownTask()));
    System.out.println("Now main sleeping... press ctrl+c to exit");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
