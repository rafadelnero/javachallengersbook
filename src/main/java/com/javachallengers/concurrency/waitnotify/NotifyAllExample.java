package com.javachallengers.concurrency.waitnotify;

public class NotifyAllExample {

  public static void main(String[] args) throws InterruptedException {
    NotifyAllExample notifyAllExample = new NotifyAllExample();
    Thread thread1 = new Thread(notifyAllExample::waitNotification);
    Thread thread2 = new Thread(notifyAllExample::waitNotification);
    Thread thread3 = new Thread(notifyAllExample::waitNotification);

    thread1.start();
    thread2.start();
    thread3.start();
    Thread.sleep(1000);
    notifyAllExample.notifyAllThreads();
  }

  private synchronized void waitNotification() {
    System.out.println(Thread.currentThread().getName()+ " starts");
    try {
      this.wait();
    } catch (InterruptedException e) { e.printStackTrace(); }
    System.out.println(Thread.currentThread().getName() + " notified");
  }

  private synchronized void notifyAllThreads() {
    this.notifyAll();
  }
}


