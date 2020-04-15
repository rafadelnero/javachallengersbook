package com.javachallengers.basictypes.flowcontrol;

public class UsingBooleanVariables {

    public static void main(String[] args) {
        double moneyToWithdraw = 100;
        double accountBalance = 100;
        boolean isMoneyAvailableInBalance = moneyToWithdraw <= accountBalance;

        if (isMoneyAvailableInBalance) {} // Perform action
    }
}
