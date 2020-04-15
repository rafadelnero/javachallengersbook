package com.javachallengers.exceptions.realworldchallenger;

public class CentralBankService {

    void notifyCentralBank(String customerId, double moneyAmount) throws CentralBankServiceDownException {
        throw new CentralBankServiceDownException(new Exception());
    }

}

