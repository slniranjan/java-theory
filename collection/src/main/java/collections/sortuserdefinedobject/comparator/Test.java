package collections.sortuserdefinedobject.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

  public static void main(String[] args) {
    ArrayList<Student> al = new ArrayList<Student>();
    al.add(new Student(101, "Vijay", 23));
    al.add(new Student(106, "Ajay", 27));
    al.add(new Student(105, null, 21));

    //Sorting elements on the basis of name
    Comparator<Student> cm1 = Comparator
        .comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
    Collections.sort(al, cm1);
    for (Student s : al) {
      System.out.println(s.rollNo + " " + s.name + " " + s.age);
    }

    //Sorting elements on the basis of age
    System.out.println("**************");
    Comparator<Student> cm2 = Comparator.comparing(Student::getAge).reversed();
    Collections.sort(al, cm2);
    for (Student s : al) {
      System.out.println(s.rollNo + " " + s.name + " " + s.age);
    }
  }
}
