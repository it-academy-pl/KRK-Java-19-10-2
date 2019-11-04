package pl.itacademy.lesson9;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
    System.out.println("New cat born");
  }

  public Cat() {
    this("");
  }

  @Override
  public void eat(String food) {
    super.eat(food);
    washFace();
  }

  private void washFace() {
    System.out.println("Cat " + name + " is washing his face.");
  }

}
