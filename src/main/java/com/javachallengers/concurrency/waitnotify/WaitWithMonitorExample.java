package com.javachallengers.concurrency.waitnotify;

public class WaitWithMonitorExample {

  public static void main(String[] args) {
    new WaitWithMonitorExample().tryToUseWait();
  }

  synchronized void tryToUseWait() {
    try {
      System.out.println(Thread.currentThread().getName() + " thread will be in the wait state...");
      wait();
      System.out.println("This text will never be reached...");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
