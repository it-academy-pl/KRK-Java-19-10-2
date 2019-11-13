package pl.itacademy.lesson11;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bankomat implements Withdrawable{

    private BankingCard insertedCard;

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if (askPinCode()) {
            //getAccountNumber from card
            //getBank name from card
            //check is IngBank has the same name as bank from card
            //find account by number in IngBank
            //withdraw account by amount
            //return amount of money
            return null;
        } else {
            //print error message
            return null;
        }
    }

    private boolean askPinCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your pin: ");
        byte enteredPin = scanner.nextByte();
        return insertedCard.isCorrectPin(enteredPin);
    }

    public void insertCard(BankingCard card) {
        insertedCard = card;
    }

    public void endSession(){
        insertedCard = null;
    }
}
