package yielddemo;

public class MyThread implements Runnable {

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " in control");
    }
  }

}
