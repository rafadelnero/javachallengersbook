package com.javachallengers.concurrency.interrupt;

public class InterruptSimpleExample {

  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(() -> {
      while (true) {
        if (Thread.interrupted()) {
          System.out.println("Interrupting thread...");
          break;
        }
      }
    });
    thread.start();
    thread.interrupt();
  }

}
