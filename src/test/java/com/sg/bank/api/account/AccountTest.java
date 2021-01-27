package com.sg.bank.api.account;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    private Account account = new Account();

    @Nested
    class Deposit {

        @Test
        void should_make_deposit_in_the_account_when_the_initial_balance_is_null() {
            account.depoit(BigDecimal.valueOf(100));
            assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(100));
        }

        @Test
        void should_make_deposit_in_the_account_and_add_the_amount_to_the_existing_balance() {
            account.setBalance(BigDecimal.valueOf(300));
            account.depoit(BigDecimal.valueOf(100));
            assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(400));
        }
    }

    @Nested
    class Withdrawal {

        @Test
        void should_make_withdrawal_from_the_account_when_the_initial_balance_is_null() {
            account.withdrawal(BigDecimal.valueOf(100));
            assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(-100));
        }
    }


}
