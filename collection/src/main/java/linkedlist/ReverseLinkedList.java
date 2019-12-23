package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Ravi");
    ll.add("Vijay");
    ll.add("Ajay");
    ll.add("Anuj");
    ll.add("Gaurav");
    ll.add("Harsh");
    ll.add("Virat");
    ll.add("Gaurav");
    ll.add("Harsh");
    ll.add("Amit");
    ll.add(null);

    Iterator<String> itr= ll.descendingIterator();
    while (itr.hasNext()){
      System.out.print(" " + itr.next());
    }
  }
}
