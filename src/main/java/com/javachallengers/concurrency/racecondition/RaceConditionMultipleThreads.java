package com.javachallengers.concurrency.racecondition;

import java.util.stream.IntStream;

public class RaceConditionMultipleThreads {

  private int counter = 0;

  public synchronized void incrementCounter() {
    try {
      Thread.sleep(10);
      counter++;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public int getCounter() {
    System.out.println("getCounter:" + counter);
    return counter;
  }

  public static void main(String... args)  {
    RaceConditionMultipleThreads raceCondition = new RaceConditionMultipleThreads();
    IntStream.rangeClosed(1, 5).forEach(i -> {
      Thread thread = new Thread(() -> {
        raceCondition.incrementCounter();
        System.out.println(Thread.currentThread().getName() + ":" + raceCondition.getCounter());
      });

      thread.start();
    });
  }

}
