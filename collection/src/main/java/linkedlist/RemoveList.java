package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveList {

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
    System.out.println("Initial list of elements: " + ll);

    System.out.println(ll.remove());//retrieve and remove first element
    System.out.println(ll.removeFirst());//retrieve and remove first element
    System.out.println(ll.removeFirstOccurrence("Gaurav"));
    System.out.println(ll);

  }
}
