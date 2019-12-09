package pl.itacademy.lesson11.exceptions;

public class BankAccountNotFoundException extends Exception {

  public BankAccountNotFoundException(String message) {
    super(message);
  }
}
