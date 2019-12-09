package pl.itacademy.lesson11;

import java.math.BigDecimal;
import java.util.Scanner;
import pl.itacademy.lesson11.account.Account;
import pl.itacademy.lesson11.exceptions.BankAccountNotFoundException;
import pl.itacademy.lesson11.exceptions.BankNotFoundException;
import pl.itacademy.lesson11.exceptions.NoCardException;
import pl.itacademy.lesson11.exceptions.NotEnoughMoney;
import pl.itacademy.lesson11.exceptions.WrongPinException;

public class Bankomat implements Withdrawable{

    private BankingCard insertedCard;

    @Override
    public BigDecimal withDraw(BigDecimal amount)
        throws NoCardException, BankNotFoundException, BankAccountNotFoundException, NotEnoughMoney, WrongPinException {
        if (askPinCode()) {
            //getAccountNumber from card
            //getBank name from card
            //check is bank name has the same name as bank from card
            //find account by number in bank
            //withdraw account by amount
            //return amount of money

            String bankName = insertedCard.getBankName();
            Bank bank = BankRegistrator.getByName(bankName);
            int accountNumber = insertedCard.getAccountNumber();
            Account account = bank.getAccountByNumber(accountNumber);
            return account.withDraw(amount);
        }
        throw new WrongPinException("Entered pin is wrong!");
    }

    private boolean askPinCode() throws NoCardException {
        if(insertedCard == null) {
            throw new NoCardException("Please, insert a card!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your pin: ");
        String enteredPin = scanner.nextLine();
        return insertedCard.isCorrectPin(enteredPin);
    }

    public void insertCard(BankingCard card) {
        insertedCard = card;
    }

    public void endSession(){
        insertedCard = null;
    }
}
