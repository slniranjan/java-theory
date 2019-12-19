public class Simple {

}

class Test {

  void printName (Object obj) {
    Class c = obj.getClass();
    System.out.println(c.getName());
  }

  public static void main(String[] args) {
    /*try {
      Class c = Class.forName("Simple");
      System.out.println(c.getName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }*/
    /*Simple s = new Simple();
    Test t = new Test();
    t.printName(s);*/
    Class c = boolean.class;
    System.out.println(c.getName());

    System.out.println(Simple.class.getName());
  }
}
