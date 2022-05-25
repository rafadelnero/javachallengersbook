package com.javachallengers.concurrency;

import java.util.stream.IntStream;

public class SynchronizeBlock {

  private int counter = 0;

  public int incrementAndGetCounter() {
    // Extra logic here...

    synchronized (this) {
      try {
        Thread.sleep(10);
        counter++;
        return counter;
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    return 0;
  }

  public static void main(String... args)  {
    SynchronizeBlock synchronizedBlock = new SynchronizeBlock();
    IntStream.rangeClosed(1, 5).forEach(i -> {
      Thread thread = new Thread(() -> {
        System.out.println(Thread.currentThread().getName() + ":" +
            synchronizedBlock.incrementAndGetCounter());
      });

      thread.start();
    });
  }

}
