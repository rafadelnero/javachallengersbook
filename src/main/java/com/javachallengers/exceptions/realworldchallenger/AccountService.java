package com.javachallengers.exceptions.realworldchallenger;

public class AccountService {

    CentralBankService centralBankService = new CentralBankService();

    void withdrawAccountMoney(String customerId, double moneyAmount) throws BusinessException {
        centralBankService.notifyCentralBank(customerId, moneyAmount);
        throw new NoAccountBalanceException(customerId, new Exception());
    }

}

