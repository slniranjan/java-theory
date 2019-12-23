package linkedlist;

import java.util.LinkedList;

public class RetrieveLinkList {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("hello");
    list.add("Niranjan");
    list.addFirst("Hey, ");

    list.forEach(a -> {
      System.out.println(a);
    });
  }
}
