package com.javachallengers.concurrency.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockUnlock {

  public static void main(String[] args) {
    Lock lock = new ReentrantLock();

    try {
      lock.lock();
      // Critical section code
    }  finally {
      lock.unlock();
    }
  }

}
