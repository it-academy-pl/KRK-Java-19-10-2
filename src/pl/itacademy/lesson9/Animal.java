package pl.itacademy.lesson9;

public class Animal {

  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public void eat(String food) {
    System.out.println(name + " eating " + food);
  }

  public void eat(String food, int amount) {
    System.out.println(name + " eating " +  amount + " " + food);
  }

  public void sleep(int hours) {
    System.out.println(name + " sleeping for " + hours + " hours");
  }

  protected void doSomething() {}

}
