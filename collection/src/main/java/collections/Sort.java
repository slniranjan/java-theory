package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sort {

  public static void main(String[] args) {
    List<String> al=new ArrayList<>();
    al.add("Viru");
    al.add("Saurav");
    al.add("Mukesh");
    al.add("Tahir");

    System.out.println(al);
    Collections.sort(al);
    System.out.println(al);

    //sort in reverese order
    Collections.sort(al, Collections.reverseOrder());
    System.out.println(al);

  }
}
