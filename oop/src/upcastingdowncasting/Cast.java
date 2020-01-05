package upcastingdowncasting;

public class Cast {

  public static void main(String[] args) {
    Dog d = new Dog();
    Animal a = d;
    a.eat();

  }
}
