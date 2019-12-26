package collections.sortuserdefinedobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("Viru"));
    list.add(new Student("Saurav"));
    list.add(new Student("Mukesh"));
    list.add(new Student("Tahir"));

    list.forEach(a->{
      System.out.println(a.name);
    });
    System.out.println("**************");
    Collections.sort(list);
    list.forEach(a->{
      System.out.println(a.name);
    });
  }
}
