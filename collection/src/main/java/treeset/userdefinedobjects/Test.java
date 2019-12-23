package treeset.userdefinedobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

  public static void main(String[] args) {
    Set<Book> bookSet = new TreeSet<>();
    //Creating Books
    Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
    Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
    Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

    bookSet.add(b1);
    bookSet.add(b2);
    bookSet.add(b3);

    //Traversing tree set
    bookSet.forEach(a -> {
      System.out.println(a.id + " " +
          a.name + " " +
          a.author + " " +
          a.publisher + " " +
          a.quantity);
    });

    System.out.println(b1.compareTo(b2));
  }
}
