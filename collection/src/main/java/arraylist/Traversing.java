package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Traversing {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("niranjan");
    list.add("how are you");

    /*Iterator itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    for (String s : list) {
      System.out.println(s);
    }*/

    //for each using lamda.
    list.forEach(a -> {
      System.out.println(a);
    });

    Iterator<String> itr = list.iterator();
    itr.forEachRemaining(a -> {
      System.out.println(a);
    });
  }
}
