public class InheritingThread extends Thread {

  InheritingThread(String threadName) {
    super(threadName);
  }

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " is running");
    new InheritingThread("InheritingThread").start();
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is running");
  }

}
