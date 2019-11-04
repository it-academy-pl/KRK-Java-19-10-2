package pl.itacademy.lesson8;

public class MobilePhone {

  private int batteryCapacity;
  private int batteryAmount;

  public MobilePhone(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
    batteryAmount = batteryCapacity;
  }

  public void useApplication(String applicationName, int hours) {
    if (batteryAmount == 0) {
      System.out.println("Battery discharged");
    } else if (batteryAmount >= hours * 100) {
      System.out.println(applicationName + " has been used for " + hours + " hours");
      batteryAmount = batteryAmount - hours * 100;
      System.out.println("Remain battery charge: " + batteryAmount);
    } else {
      System.out.println(applicationName + " has been used for " + batteryAmount / 100 + " hours");
      System.out.println("Phone has been discharged");
      batteryAmount = 0;
    }
  }

  public void chargePhone() {
    batteryAmount = batteryCapacity;
  }
}
