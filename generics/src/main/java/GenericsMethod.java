public class GenericsMethod {

  public static <T> boolean isEqual(ClassProblemSolution<T> g1, ClassProblemSolution<T> g2) {
    return g1.get().equals(g2.get());
  }

  public static <T extends Comparable<T>> int compare(T t1, T t2) {
    return t1.compareTo(t2);
  }

  public static void main(String[] args) {
    ClassProblemSolution<String> g1 = new ClassProblemSolution<>();
    g1.set("Niranjan");

    ClassProblemSolution<String> g2 = new ClassProblemSolution<>();
    g2.set("Niranjan");

    boolean isEqual = GenericsMethod.isEqual(g1, g2);
    System.out.println(isEqual);

  }

}
