package wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
  public static  void printNumbers(List<? super Integer> numbers) {
    System.out.println(numbers);
  }

  public static void main(String[] args) {
    List<Number> l1 = new ArrayList<>();
    l1.add(3.4);
    l1.add(2);

    List<Double> l2 = new ArrayList<>(); // cant use with printNumber()
    l2.add(3.0);

    printNumbers(l1);
//    printNumbers(l2);

  }
}
