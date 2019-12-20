public class ClassProblemWithoutGenerics {

  private Object object;

  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public static void main(String[] args) {
    ClassProblemWithoutGenerics genericsClassProblem = new ClassProblemWithoutGenerics();
    genericsClassProblem.setObject("Niranjan");
    String str = (String) genericsClassProblem.getObject();
    //type casting, error prone and can cause ClassCastException
  }

}
