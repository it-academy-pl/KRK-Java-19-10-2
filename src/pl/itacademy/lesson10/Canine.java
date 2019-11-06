package pl.itacademy.lesson10;

public abstract class Canine extends Animal {

  @Override
  public void move() {
    System.out.println("Canine is moving");
  }

  @Override
  public Number getNumberOfLegs() {
    return 4;
  }
}
