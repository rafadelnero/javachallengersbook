package com.javachallengers.concurrency.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PassingLock {

  public static void main(String[] args) {
    doLock();
  }

  static void doLock() {
    Lock lock = new ReentrantLock();

    try {
      lock.lock();
      // Critical section code
    } catch (Exception exception) {
      // Handle exception
    } finally {
      doUnlock(lock);
    }
  }

  static void doUnlock(Lock lock) {
    // Critical section code
    lock.unlock();
  }

}
