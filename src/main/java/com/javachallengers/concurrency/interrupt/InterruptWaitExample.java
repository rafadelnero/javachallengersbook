package com.javachallengers.concurrency.interrupt;

public class InterruptWaitExample {
  synchronized void waitThread() {
    try {
      this.wait();
    } catch (InterruptedException e) {
      System.out.println("The Interrupted Exception was caught...");
    }
  }

  public static void main(String[] args) {
    InterruptWaitExample interruptWaitExample = new InterruptWaitExample();
    Thread thread = new Thread(interruptWaitExample::waitThread);
    thread.start();
    thread.interrupt();
  }
}
