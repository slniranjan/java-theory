package enumset;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
  SUNDAY, MONDAY, TUESDAY, WEDNSEDAY, THURSDAY, FRIDAY, SATURDAY
}
public class Example {

  public static void main(String[] args) {
    Set<days> set = EnumSet.of(days.MONDAY, days.THURSDAY);
    Set<days> setAll = EnumSet.allOf(days.class);
    Set<days> setNone = EnumSet.noneOf(days.class);

    Iterator<days> itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println(setAll);
    System.out.println(setNone);
  }
}
