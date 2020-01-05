package callbyvalue;

public class PrimitiveExample {

  public static void main(String[] args) {
    int x = 3;
    PrimitiveExample primitiveExample = new PrimitiveExample();
    System.out.println("Value of x before calling increment() is " + x);
    primitiveExample.increment(x);
    System.out.println("Value of x after calling increment() is " + x);
  }

  public void increment(int a) {
    System.out.println("Value of a before incrementing is " + a);
    a = a + 1;
    System.out.println("Value of a after incrementing is " + a);
  }
}
