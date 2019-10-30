package pl.itacademy.lesson8;

public class PrimitiveWrappers {

  public static void main(String[] args) {
    Integer a = 1242;
    int b = 24;
    int c = a + b;
    System.out.println(c);

    System.out.println(a.byteValue());

    Boolean bool = true;
    Boolean newerRepeatItAtHome = new Boolean(false);
    Boolean bool2 = Boolean.FALSE;
    System.out.println(bool2.getClass());

    Integer newerRepeatItAtHome2 = new Integer(42);
    Integer number = Integer.valueOf("123");

    Integer i1 = 13;
    Integer i2 = 13;
    System.out.println(i1 == i2);
    Integer i3 = 200;
    Integer i4 = 200;
    System.out.println(i3 == i4);
    Integer i6 = new Integer(13);
    Integer i7 = new Integer(13);
    System.out.println(i6 == i7);

    Integer a1 = 5;
    System.out.println(a1);
    a1 = null;
    System.out.println(a1);

  }

  private static Byte getTheAnswerToAllQuestions() {
    return 42;
  }

}
