package exceptions.throwthrows;

public class BankAccountController {

    BankAccountService bankAccountService;

    BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    void withdrawMoney(String customerId, double moneyAmount) throws BusinessException {
        try {
            bankAccountService.withdrawMoney(customerId, moneyAmount);
        } catch (NoAccountBalanceException noAccountBalanceException) {
            throw new BusinessException(noAccountBalanceException);
        }
    }

}
