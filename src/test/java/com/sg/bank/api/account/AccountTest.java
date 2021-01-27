package com.sg.bank.api.account;


import com.sg.bank.api.operation.OperationHistory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    private static final BigDecimal AMOUNT = BigDecimal.valueOf(100);

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Nested
    class Deposit {

        @Test
        void should_make_deposit_in_the_account_when_the_initial_balance_is_null() {
            account.depoit(AMOUNT);
            assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(100));
        }

        @Test
        void should_make_deposit_in_the_account_and_add_the_amount_to_the_existing_balance() {
            account.setBalance(BigDecimal.valueOf(300));
            account.depoit(AMOUNT);
            assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(400));
        }
    }

    @Nested
    class Withdrawal {

        @Test
        void should_make_withdrawal_from_the_account_when_the_initial_balance_is_null() {
            account.withdrawal(AMOUNT);
            assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(-100));
        }

        @Test
        void should_make_withdrawal_from_the_account_and_substruct_the_amount_from_the_existing_balance() {
            account.setBalance(BigDecimal.valueOf(300));
            account.withdrawal(AMOUNT);
            assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(200));
        }
    }

    @Nested
    class checkOperations {

        @Test
        void should_check_operations_and_return_empty_list_if_there_was_any_operation_on_the_account() {

            List<OperationHistory> operationHistoriesActual = account.checkOperations();

            assertThat(operationHistoriesActual).isEmpty();
        }
    }


}
