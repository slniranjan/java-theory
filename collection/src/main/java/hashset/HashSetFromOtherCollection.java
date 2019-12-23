package hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromOtherCollection {

  public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<>();
    list.add("Ravi");
    list.add("Vijay");
    list.add("Ajay");

    HashSet<String> hs = new HashSet<>(list);
    hs.add("from set");

    hs.forEach(a-> {
      System.out.println(a);
    });
  }
}
