public class Student implements Cloneable {

  int rollNo;
  String name;

  Student(int rollNo, String name) {
    this.rollNo = rollNo;
    this.name = name;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Student s1 = new Student(34, "abc");
    Student s2 = (Student) s1.clone();
    System.out.println(s1.rollNo + " " + s1.name);
    System.out.println(s2.rollNo + " " + s2.name);
  }

}
