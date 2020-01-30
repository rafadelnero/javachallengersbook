package exceptions.customizedexceptions;

public class OneThrow {

    void calculateCustomerBilling() throws BusinessException {
        // In the logic, this method will throw NoDiscountException, NoAccountBalanceException
        // and BillingException
    }

    static public class NoDiscountException extends BusinessException { }
    static public class NoAccountBalanceException extends BusinessException {}
    static public class BusinessException extends Exception {}

}
