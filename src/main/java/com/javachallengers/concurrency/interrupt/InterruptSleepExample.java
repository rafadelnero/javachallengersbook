package com.javachallengers.concurrency.interrupt;

public class InterruptSleepExample {

  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        System.out.println("The Interrupted Exception was caught...");
      }
    });
    thread.start();
    thread.interrupt();
  }

}
