package pl.itacademy.lesson10;

public abstract class Animal {

  public void eat(String... food) {
    for (String s : food) {
      System.out.println("Animal is eating " + s);
    }
  }

  public abstract void move();

  public abstract Number getNumberOfLegs();

}
