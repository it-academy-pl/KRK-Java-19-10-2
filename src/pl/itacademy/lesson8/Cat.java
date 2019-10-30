package pl.itacademy.lesson8;

public class Cat {
  static String catOwner;

  static {
    catOwner = "Human";
  }

  public String name;
  private boolean hungry;
  protected String breed;
  String colour;

  public Cat(String name) {
    this.name = name;
  }
}
