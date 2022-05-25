package com.javachallengers.concurrency.racecondition;

import java.util.stream.IntStream;

public class RaceConditionForTwoThreadsSync {

  private int counter = 0;

  public synchronized int incrementAndGetCounter() {
    try {
      Thread.sleep(10);
      counter++;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return counter;
  }

  public static void main(String... args)  {
    RaceConditionForTwoThreadsSync raceConditionSync = new RaceConditionForTwoThreadsSync();
    runThread(raceConditionSync);
    runThread(raceConditionSync);
  }

  private static void runThread(RaceConditionForTwoThreadsSync raceConditionSync) {
      Thread thread = new Thread(() -> IntStream.rangeClosed(1, 2).forEach(i -> {
        System.out.println(Thread.currentThread().getName() + ":"
                           + raceConditionSync.incrementAndGetCounter());
      }));

      thread.start();
  }

}
