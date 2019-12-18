public class ThreadJoin implements Runnable {

  public static void main(String[] args) {
    Thread t1 = new Thread(new ThreadJoin(), "T1");
    Thread t2 = new Thread(new ThreadJoin(), "T2");
    Thread t3 = new Thread(new ThreadJoin(), "T3");

    t1.start();

    try {
      t1.join();
    }catch (InterruptedException e) {
      System.out.println(e);
    }

    t2.start();
    t3.start();

  }

  @Override
  public void run() {

    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " --> " + i);
    }

  }

}
