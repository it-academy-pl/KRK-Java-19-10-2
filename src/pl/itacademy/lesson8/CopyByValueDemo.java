package pl.itacademy.lesson8;

public class CopyByValueDemo {

  public static void main(String[] args) {
    int number = 5;
    System.out.println("Number from main method: " + number);

    intExample(number);
    //What will be printed?
    System.out.println("Number from main method: " + number);

    Integer number1 = 5;
    System.out.println("Number from main method: " + number1);

    integerExample(number1);
    //What will be printed?
    System.out.println("Number from main method: " + number1);

    Cat tom = new Cat("Tom");
    System.out.println(tom.name);
    catExample(tom);
    System.out.println(tom.name);
  }

  private static void intExample(int number) {
    System.out.println("Number from intExampleMethod: " + number);
    number = 0;
    System.out.println("Number from intExampleMethod: " + number);
  }

  private static void integerExample(Integer number) {
    System.out.println("Number from integerExampleMethod: " + number);
    number = 0;
    System.out.println("Number from integerExampleMethod: " + number);
  }

  private static void catExample(Cat cat) {
    System.out.println(cat.name);
    //cat.name = "Jerry";
    //System.out.println(cat.name);
    cat = null;
    System.out.println(cat);
  }

}
