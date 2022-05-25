package com.javachallengers.concurrency.waitnotify;

public class WaitNotifyExample {

  public static void main(String[] args) {
    WaitNotifyExample waitNotifyExample = new WaitNotifyExample();
    new Thread(waitNotifyExample::waitForNotification).start();
    new Thread(waitNotifyExample::notifyOtherThread).start();
  }

  synchronized void waitForNotification() {
    try {
      System.out.println(Thread.currentThread().getName() + " is waiting...");
      this.wait();
      System.out.println(Thread.currentThread().getName() + " is notified!");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  synchronized void notifyOtherThread() {
    System.out.println(Thread.currentThread().getName() + " will notify other thread...");
    this.notify();
  }
}
