package pl.itacademy.lesson8;

public class ModifierTester {

  public static void main(String[] args) {
    final int a = 42;
//    a = 0;
    final int b;
    b = 42;
//    b = 0;
    Cat tom = new Cat("Tom");
  }

  private static void catModifierTest(final Cat cat) {
    System.out.println(cat.name);
    cat.name = "Jerry";
    //cat = new Cat("Jerry");
  }


}
