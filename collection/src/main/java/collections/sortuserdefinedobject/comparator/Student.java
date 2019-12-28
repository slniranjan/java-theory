package collections.sortuserdefinedobject.comparator;

public class Student {

  int rollNo;
  int age;
  String name;

  Student(int rollNo, String name, int age){
    this.rollNo = rollNo;
    this.age = age;
    this.name = name;
  }

  public int getRollNo() {
    return rollNo;
  }

  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
