package com.javachallengers.basicoo.realworldchallenger;

import org.junit.Assert;
import org.junit.Test;

public class TransferTest {

    @Test
    public void shouldTransfer() {
        Account origin = new Account(1000);
        Account recipient = new Account(1000);

        origin.transfer(100, recipient);

        Assert.assertEquals(900, origin.getBalance(), 0.0001);
        Assert.assertEquals(1100, recipient.getBalance(), 0.0001);
    }

    @Test
    public void shouldNotTransfer() {
        Account origin = new Account(900);
        Account recipient = new Account(1100);

        origin.transfer(1000, recipient);
        Assert.assertEquals(900, origin.getBalance(), 0.0001);
        Assert.assertEquals(1100, recipient.getBalance(), 0.0001);
    }


}
