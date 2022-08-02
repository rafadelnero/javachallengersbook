package com.javachallengers.concurrency;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceEx {
  public static void main(String[] args) {
    AtomicReference<Object> atomicReference = new AtomicReference<>();
    String initialValue = "NoChallenger";
    atomicReference.set(initialValue);

    System.out.println(atomicReference.get());
    Object newValue = "JavaChallenger";
    boolean valueUpdated = atomicReference.compareAndSet(initialValue, newValue);

    System.out.println(atomicReference + ", " + valueUpdated);
  }
}
