package upcastingdowncasting;

public abstract class Animal implements Mammal{

  @Override
  public void eat() {
    System.out.println("eating ....");
  }

  @Override
  public void move() {
    System.out.println("moving ........");
  }

  @Override
  public void sleep() {
    System.out.println("sleeping ........");
  }
}
