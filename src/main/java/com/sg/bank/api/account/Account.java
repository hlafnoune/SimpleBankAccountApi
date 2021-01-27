package com.sg.bank.api.account;

import java.math.BigDecimal;
import java.util.Optional;

public class Account {

    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void depoit(BigDecimal amount) {
        balance = Optional.ofNullable(balance).orElse(BigDecimal.ZERO).add(amount);
    }
}
