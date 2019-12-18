import java.io.IOException;

public class RuntimeTest {

  public static void main(String[] args) throws IOException {
//    Runtime.getRuntime().exec("code"); //open new vscode editor
//    Runtime.getRuntime().exec("shutdown -r -t 0");// shutdown the os
    Runtime r = Runtime.getRuntime();
    System.out.println("Total memory: " + r.totalMemory());
    System.out.println("Free memory: " + r.freeMemory());

    for (int i = 0; i < 10000; i++) {
      new RuntimeTest();
    }
    System.out.println("*******After object create*********");
    System.out.println("Free memory: " + r.freeMemory());
    System.gc();
    System.out.println("*******After GC*********");
    System.out.println("Free memory: " + r.freeMemory());

  }
}
