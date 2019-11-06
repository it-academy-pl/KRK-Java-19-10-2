package pl.itacademy.lesson10;

public abstract class Feline extends Animal {

  @Override
  public void move() {
    System.out.println("Feline is moving");
  }

  @Override
  public Byte getNumberOfLegs() {
    return 4;
  }
}
