package com.javachallengers.basicoo.realworldchallenger;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void shouldWithdraw() {
        Account account = new Account(1000);
        Assert.assertEquals(1000.0, account.getBalance(), 0.001);

        account.withdraw(100);
        Assert.assertEquals(900, account.getBalance(), 0.001);
    }

    @Test
    public void shouldNotWithdrawWhenAmountIsGreaterThanBalance() {
        Account account = new Account(1000);
        account.withdraw(1100);
        Assert.assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test
    public void shouldDeposit() {
        Account account = new Account(900);
        account.withdraw(900);
        Assert.assertEquals(0, account.getBalance(), 0.001);
    }

    @Test
    public void shouldNotDepositWhenAmountIsNegative() {
        Account account = new Account(900);
        account.deposit(-100);
        Assert.assertEquals(900, account.getBalance(), 0.001);
    }

}
