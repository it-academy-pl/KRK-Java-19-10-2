package pl.itacademy.lesson11;

import java.math.BigDecimal;
import pl.itacademy.lesson11.account.Account;
import pl.itacademy.lesson11.account.DebitAccount;
import pl.itacademy.lesson11.exceptions.BankAccountNotFoundException;
import pl.itacademy.lesson11.exceptions.BankNotFoundException;
import pl.itacademy.lesson11.exceptions.NoCardException;
import pl.itacademy.lesson11.exceptions.NotEnoughMoney;
import pl.itacademy.lesson11.exceptions.WrongPinException;

public class BankTester {
    public static void main(String[] args) {
        //create a bank
        //create an account, or two
        //create card and link it to account
        //add account to bank
        //create wplatomat
        //top-up card account with wplatomat
        //create bankomat
        //withdraw money from card account with bankomat
        Bank ing = new Bank("ING", new Address(36001, "Krakow", "Centralna", 1));
        BankRegistrator.registerBank(ing);
        Account debitAccount = new DebitAccount();
        ing.addAccount(debitAccount);
        Person jan = new Person("Jan", "Kowalski");
        BankingCard card = new BankingCard(1, jan, "0000", debitAccount.getAccountNumber(), ing.getName());

        Bankomat atm = new Bankomat();
        atm.insertCard(card);
        try {
            atm.withDraw(BigDecimal.TEN);
        } catch (NoCardException | BankNotFoundException | BankAccountNotFoundException | NotEnoughMoney | WrongPinException e) {
            System.out.println(e.getMessage());
        }
    }
}
