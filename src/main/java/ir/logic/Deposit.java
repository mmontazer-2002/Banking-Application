package ir.logic;

import ir.models.User;

public class Deposit {

    User user = new User();

    public float deposit(float balance) {
        user.setBalance(user.getBalance() + balance);
        return user.getBalance();
    }
}
