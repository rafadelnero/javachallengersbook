package com.javachallengers.concurrency;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceEx {

  public static void main(String[] args) {
    AtomicReference<Object> cache = new AtomicReference<>();

    Object cachedValue = new Object();
    cache.set(cachedValue);

    Object cachedValueToUpdate = cache.get();

    Object newValue = cachedValueToUpdate;
    boolean success = cache.compareAndSet(cachedValue,cachedValueToUpdate);
  }

}
