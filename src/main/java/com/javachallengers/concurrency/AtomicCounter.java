package com.javachallengers.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
  private AtomicInteger atomicCounter = new AtomicInteger(0);

  public void increment() {
    atomicCounter.incrementAndGet();
  }

  public void decrement() {
    atomicCounter.decrementAndGet();
  }

  public int getValue() {
    return atomicCounter.get();
  }

}
