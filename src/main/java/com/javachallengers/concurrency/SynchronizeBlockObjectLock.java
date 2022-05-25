package com.javachallengers.concurrency;

public class SynchronizeBlockObjectLock {

  private int counter1;
  private int counter2;

  private final Object lock1 = new Object();
  private final Object lock2 = new Object();

  public void increment1() {
    synchronized(lock1) {
      counter1++;
    }
  }

  public void increment2() {
    synchronized(lock2) {
      counter2++;
    }
  }
}
