package collections.sortuserdefinedobject;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Student implements Comparable<Student> {

  public String name;

  public Student(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Student s) {
    return name.compareTo(s.name);
  }
}


