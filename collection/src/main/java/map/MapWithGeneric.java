package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapWithGeneric {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(100, "Amit");
    map.put(101, "Vijay");
    map.put(102, "Rahul");

    /*for (Map.Entry m : map.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }*/
    //Returns a Set view of the mappings contained in this map
    System.out.println(map.entrySet());

    //Returns a sequential Stream with this collection as its source
    final Stream<Entry<Integer, String>> stream = map.entrySet().stream();
    System.out.println(stream);
    //Sorted according to the provided Comparator
    System.out.println(stream.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())));
    //Performs an action for each element of this stream
    stream.forEach(a -> {
      System.out.println(a.getValue());
    });

  }
}
