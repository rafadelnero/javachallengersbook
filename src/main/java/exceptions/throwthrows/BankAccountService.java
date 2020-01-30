package exceptions.throwthrows;

class BankAccountService {

    void withdrawMoney(String accountNumber, double moneyAmount) throws NoAccountBalanceException {
        // Perform logic
        throw new NoAccountBalanceException();
    }
}
