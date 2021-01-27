package com.sg.bank.api.operation;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OperationHistory {

    private String operationType;
    private BigDecimal amount;
    private BigDecimal balance;
    private LocalDateTime createDate;

    public String getOperationType() {
        return operationType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

}
