package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OperationExample {

  public static void main(String[] args) {
    HashMap<Integer, String> hm = new HashMap<>();
    hm.put(100, "Amit");
    hm.put(101, "Vijay");
    hm.put(102, "Rahul");

    hm.putIfAbsent(103, "test");

    hm.replace(103, "sample");
    hm.replace(101, "Vijay", "ser");

    hm.replaceAll((k, v) -> "Ajay");
    for (Map.Entry m : hm.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
}
