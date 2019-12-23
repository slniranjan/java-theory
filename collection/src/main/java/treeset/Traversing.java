package treeset;

import java.util.TreeSet;

public class Traversing {

  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();
    ts.add("Ravi");
    ts.add("Vijay");
    ts.add("Ajay");

    ts.forEach(a -> {
      System.out.println(a);
    });
  }
}
