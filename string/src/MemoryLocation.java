public class MemoryLocation {

  public static void main(String[] args) {
    String s1 = new String("hello");
    String s2 = new String("hello");
    String s3 = "hello";
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    s1 = s1.intern();//make string literal behavior explicitly
    System.out.println(s1 == s3);
  }
}
