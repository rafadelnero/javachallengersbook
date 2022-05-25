package com.javachallengers.concurrency.racecondition;

import java.util.stream.IntStream;

public class RaceConditionForTwoThreads {

  private int counter = 0;

  public void incrementCounter() {
    try {
      Thread.sleep(10);
      counter++;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public int getCounter() {
    return counter;
  }

  public static void main(String... args)  {
    RaceConditionForTwoThreads raceCondition = new RaceConditionForTwoThreads();
    runThread(raceCondition);
    runThread(raceCondition);
  }

  private static void runThread(RaceConditionForTwoThreads raceCondition) {
      Thread thread = new Thread(() -> IntStream.rangeClosed(1, 2).forEach(i -> {
        raceCondition.incrementCounter();
        System.out.println(Thread.currentThread().getName() + ":" + raceCondition.getCounter());
      }));

      thread.start();
  }

}
