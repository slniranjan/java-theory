package treeset;

import java.util.TreeSet;

public class NavigableSet {

  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();
    ts.add("A");
    ts.add("B");
    ts.add("C");
    ts.add("D");
    ts.add("E");
    System.out.println("Initial Set: "+ts);
    System.out.println("Reverse set: " + ts.descendingSet());
    System.out.println("Head set: " + ts.headSet("C", true));
    System.out.println("Sub set: " + ts.subSet("A",true, "D", false));
    System.out.println("Tail set: " + ts.tailSet("C", false));

  }
}
