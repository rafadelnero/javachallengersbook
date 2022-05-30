package com.javachallengers.concurrency.waitnotify;

public class WaitTimeoutMillisExample {

  public static void main(String[] args) {
    new WaitTimeoutMillisExample().waitWithTimeoutMillis();
  }

  synchronized void waitWithTimeoutMillis() {
    try {
      System.out.println(Thread.currentThread().getName()
          + " thread will be in the non-runnable state...");
      wait(1000);
      System.out.println("This text will be printed after 1 second...");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
