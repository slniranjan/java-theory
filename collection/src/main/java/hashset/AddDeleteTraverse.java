package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class AddDeleteTraverse {

  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    hs.add("One");
    hs.add("Two");
    hs.add("Three");
    hs.add("Four");
    hs.add("Five");

    hs.add("One");// this value has ignored. not add to HashSet

    /*Iterator<String> itr = hs.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }*/

   /* hs.forEach(a -> {
      System.out.println(a);
    });*/

    //removing element
    /*hs.remove("One");
    hs.forEach(a -> {
      System.out.println(a);
    });*/

    //Removing elements on the basis of specified condition
    hs.removeIf(a -> a.contains("One"));
    hs.forEach(a-> {
      System.out.println(a);
    });
  }
}
