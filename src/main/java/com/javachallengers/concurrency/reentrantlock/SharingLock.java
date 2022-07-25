package com.javachallengers.concurrency.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharingLock {

  public static void main(String[] args) {
    doLock();
  }

  static Lock lock = new ReentrantLock();

  static void doLock() {
    try {
      lock.lock();
      // Critical section code
    } catch (Exception exception) {
      // Handle exception
    } finally {
      doUnlock();
    }
  }

  static void doUnlock() {
    // Critical section code
    lock.unlock();
  }

}
