package com.javachallengers.exceptions.customizedexceptions;

public class SeveralThrows {

    void calculateCustomerBilling() throws BillingException, NoDiscountException,  NoAccountBalanceException {
        // In the logic, this method will throw NoDiscountException, NoAccountBalanceException
        // and BillingException
    }

    static public class NoDiscountException extends Exception { }
    static public class NoAccountBalanceException extends Exception {}

}
