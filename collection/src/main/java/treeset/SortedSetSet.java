package treeset;

import java.util.TreeSet;

public class SortedSetSet {

  public static void main(String[] args) {
    TreeSet<String> set = new TreeSet<>();
    set.add("A");
    set.add("B");
    set.add("C");
    set.add("D");
    set.add("E");

    System.out.println("Initial set: " + set);
    System.out.println("Head set: " + set.headSet("C"));
    System.out.println("Sub set: " + set.subSet("B", "D"));
    System.out.println("Tail set: " + set.tailSet("B"));
  }
}
