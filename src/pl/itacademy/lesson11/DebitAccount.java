package pl.itacademy.lesson11;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    private BigDecimal balance;

    public DebitAccount() {
        super();
        balance = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Cant top up on negative amount");
        }
        return balance;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if(balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("Not enough money!");
        }
        return balance;
    }
}
