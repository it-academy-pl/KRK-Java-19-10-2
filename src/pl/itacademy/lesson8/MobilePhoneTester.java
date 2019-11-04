package pl.itacademy.lesson8;

public class MobilePhoneTester {

  public static void main(String[] args) {
    MobilePhone iphone = new MobilePhone(500);
    iphone.useApplication("YouTube", 3);

    iphone.useApplication("FB", 3);
    iphone.useApplication("Tinder", 3);

    iphone.chargePhone();
    iphone.useApplication("Tinder", 3);
  }

}
