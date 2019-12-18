public class RunnableThread implements Runnable {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    new Thread(new RunnableThread(), "one").start();
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }

}
