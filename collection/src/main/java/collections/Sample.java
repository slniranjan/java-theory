package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("C");
    list.add("Core Java");
    list.add("Advance Java");
    System.out.println("Initial collection value:"+list);

    Collections.addAll(list,"Servlet","jsp");
    System.out.println("After adding elements collection value:"+list);

    String[] strArr = {"C#, .NET"};
    Collections.addAll(list, strArr);
    System.out.println("After adding array collection value:"+list);

    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));

  }
}
