package callbyvalue;

public class ImmutableExample {

  public static void main(String... doYourBest) {
    String name = "aa";
    changeToHomer(name);
    System.out.println(name);
  }

  static void changeToHomer(String name) {
    name = "Homer";
    System.out.println(name);
  }

}
