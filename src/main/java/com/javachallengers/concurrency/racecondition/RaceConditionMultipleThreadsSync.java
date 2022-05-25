package com.javachallengers.concurrency.racecondition;

import java.util.stream.IntStream;

public class RaceConditionMultipleThreadsSync {

  private int counter = 0;

  public synchronized int incrementAndGet() {
    try {
      Thread.sleep(10);
      counter++;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return counter;
  }

  public static void main(String... args)  {
    RaceConditionMultipleThreadsSync raceCondition = new RaceConditionMultipleThreadsSync();
    IntStream.rangeClosed(1, 5).forEach(i -> {
      Thread thread = new Thread(() -> {
        System.out.println(Thread.currentThread().getName() + ":" +
            raceCondition.incrementAndGet());
      });

      thread.start();
    });
  }

}
