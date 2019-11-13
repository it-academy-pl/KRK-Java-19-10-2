package pl.itacademy.lesson11;

import java.math.BigDecimal;

public abstract class Account {
    private static int lastAccountNumber = 0;

    private int accountNumber;

    public Account() {
        accountNumber = lastAccountNumber + 1;
        lastAccountNumber++;
    }

    public abstract BigDecimal topUp(BigDecimal amount);

    public abstract BigDecimal withDraw(BigDecimal amount);

    public int getAccountNumber() {
        return accountNumber;
    }
}
