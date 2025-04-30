package ir.logic;

import ir.models.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepositTest {

    @Test
    public void ifDepositIsSuccessful() {

        Deposit deposit = new Deposit();
        float initialBalance = deposit.user.getBalance();
        float newBalance = deposit.deposit(20000);
        assertEquals(initialBalance + 20000, newBalance);
    }

}
