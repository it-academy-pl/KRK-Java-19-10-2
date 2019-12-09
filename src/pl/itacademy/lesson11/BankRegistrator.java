package pl.itacademy.lesson11;

import java.util.HashSet;
import java.util.Set;
import pl.itacademy.lesson11.exceptions.BankNotFoundException;

public class BankRegistrator {
  private static Set<Bank> banks = new HashSet<>();

  public static void registerBank(Bank bank) {
    banks.add(bank);
  }

  public static Bank getByName(String bankName) throws BankNotFoundException {
    for (Bank bank : banks) {
      if(bank.getName().equals(bankName)) {
        return bank;
      }
    }
    throw new BankNotFoundException("Bank with name: " + bankName + " not found!");
  }

}
