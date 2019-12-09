package pl.itacademy.lesson11;

import java.math.BigDecimal;
import pl.itacademy.lesson11.exceptions.BankAccountNotFoundException;
import pl.itacademy.lesson11.exceptions.BankNotFoundException;
import pl.itacademy.lesson11.exceptions.NoCardException;
import pl.itacademy.lesson11.exceptions.NotEnoughMoney;
import pl.itacademy.lesson11.exceptions.WrongPinException;

public interface Withdrawable {
    BigDecimal withDraw(BigDecimal amount)
        throws NoCardException, BankNotFoundException, BankAccountNotFoundException, NotEnoughMoney, WrongPinException;
}
