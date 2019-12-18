public class GarbageCollection {

  public void finalize() {
    System.out.println("Object is garbage collected");
  }

  public static void main(String[] args) {
    GarbageCollection gc1 = new GarbageCollection();
    GarbageCollection gc2 = new GarbageCollection();
    gc1 = null;
    gc2 = null; 
    System.gc();
  }

}
