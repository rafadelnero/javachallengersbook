package com.javachallengers.exceptions.realworldchallenger;

public enum ErrorCode {

    NO_ACCOUNT_BALANCE("NO_ACCOUNT_BALANCE"),
    CENTRAL_BANK_SERVICE_DOWN("CENTRAL_BANK_SERVICE_DOWN");

    String errorCode;

    ErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
