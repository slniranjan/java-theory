public class ClassProblemSolution<T> {

  private T t;

  public T get() {
    return t;
  }

  public void set(T t) {
    this.t = t;
  }

  public static void main(String[] args) {
    ClassProblemSolution<String> classProblemSolution = new ClassProblemSolution<>();
    classProblemSolution.set("Niranjan");
    String str = classProblemSolution.get();

    //always avoid this creation. will have run time exception.
    //stick above type
    ClassProblemSolution classProblemSolution2 = new ClassProblemSolution(); //raw type
    classProblemSolution2.set("Niranjan");
    classProblemSolution2.set(125);
    String str2 = classProblemSolution.get();
  }

}
