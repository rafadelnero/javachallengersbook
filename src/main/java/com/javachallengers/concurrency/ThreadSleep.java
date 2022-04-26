package com.javachallengers.concurrency;

public class ThreadSleep {

  public static void main(String[] args) throws InterruptedException {
    long beforeSleep = System.currentTimeMillis();
    System.out.println(beforeSleep);
    Thread.sleep(5000);
    long totalSleepTime = System.currentTimeMillis() - beforeSleep;
    System.out.println(Thread.currentThread().getName() + " thread slept for: " + totalSleepTime);
  }
}
