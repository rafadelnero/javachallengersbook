package com.javachallengers.exceptions.realworldchallenger;

public class NoAccountBalanceException extends BusinessException {

    public NoAccountBalanceException(final String customerId, final Throwable cause) {
        super(String.format("There is no account balance for the customer id: %s", customerId),
                cause, ErrorCode.NO_ACCOUNT_BALANCE);
    }

}

